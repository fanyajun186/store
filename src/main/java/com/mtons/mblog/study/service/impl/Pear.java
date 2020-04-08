package com.mtons.mblog.study.service.impl;

import org.springframework.stereotype.Service;

import com.mtons.mblog.study.service.Fighter;

@Service
public class Pear implements Fighter {
    public void fight(){
        System.out.println("Pear：亚历山大。");

    }
}
