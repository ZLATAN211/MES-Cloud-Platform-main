package com.easy.mes.analysis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhaohan
 */

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.easy"})
public class MachineLoginApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(MachineLoginApplicationMain.class,args);
    }
}
