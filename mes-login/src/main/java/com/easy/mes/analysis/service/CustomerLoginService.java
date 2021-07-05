package com.easy.mes.analysis.service;

import com.easy.mes.analysis.entity.CustomerLogin;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LiZiHan
 * @since 2021-02-19
 */
public interface CustomerLoginService extends IService<CustomerLogin> {

    String culogin(CustomerLogin customerLogin);

    void curegister(CustomerLogin customerLogin);

    List<CustomerLogin> getCuInfoById(Long id);
}
