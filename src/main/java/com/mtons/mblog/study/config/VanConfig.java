package com.mtons.mblog.study.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mtons.mblog.study.service.Fighter;
import com.mtons.mblog.study.service.impl.Banana;
import com.mtons.mblog.study.service.impl.Billy;

@Configuration
public class VanConfig {
    @Bean
    @ConditionalOnBean(Billy.class)
    public Fighter fighter(Billy billy){
    	System.out.println("初始化Billy.....................");
        return new Billy();
    }

    /*@Bean
    @ConditionalOnMissingBean
    public Fighter fighter2(){
    	System.out.println("初始化Babana**********************");
        return new Banana();
    }*/
}
