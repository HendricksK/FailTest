/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.failtest.configuration;

/**
 *
 * @author kurvin
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import cputgroup3a.failtest.service.FailTestService;
import cputgroup3a.failtest.service.Impl.FailTestServiceImpl;


public class AppConfig {
    @Bean(name="FT")
    public FailTestService getService(){
        return new FailTestServiceImpl();
    }
}
