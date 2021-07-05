package com.easy.mes.analysis.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.easy.mes.analysis.entity.Bottle;
import com.easy.mes.analysis.entity.CommodityAttributes;
import com.easy.mes.analysis.entity.Order;
import com.easy.mes.analysis.entity.Water;

import java.util.concurrent.Callable;

/**
 * @author zhaohan
 * 执行的任务
 */

public class Implementer implements Callable {

    /**
     * 在这里主要进行订单json解析成为任务json的过程
     * 所有任务都要带着订单id
     * @return String
     * @throws Exception
     */

    public Implementer(String json){

        ParserConfig.getGlobalInstance().setSafeMode(true);
        this.json=json;

    }

    private String json;
    @Override
    public String[] call() throws Exception {

        Order order= JSON.parseObject(json,Order.class);
        int o_id=order.getO_id();
        String s_vals=order.getS_vals();
        CommodityAttributes attributes= JSON.parseObject(s_vals,CommodityAttributes.class);

        short capacity=attributes.getCapacity();
        int num=attributes.getNum();
        Bottle bottle=new Bottle(o_id,capacity,num);
        String bottleTask=(String)JSON.toJSON(bottle);

        String type=attributes.getType();
        long total=attributes.getTotal();
        Water water=new Water(o_id,type,total);
        String waterTask=(String)JSON.toJSON(water);

        String[] task={bottleTask,waterTask};

        return task;

    }

}
/**
 *
 * {
 *     name:zhulixin,
 *     age:21,
 *     sex:woman,
 * }
 */
