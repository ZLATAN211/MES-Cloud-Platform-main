package com.easy.mes.test;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.easy.mes.analysis.handler.MqttPublisher;
import com.easy.mes.analysis.handler.MqttSubscriber;
import org.junit.Test;


public class CodeGenerator {

    @Test
    public void run() throws Exception {

        MqttPublisher.publisher(MqttSubscriber.subscriber());

    }
}
