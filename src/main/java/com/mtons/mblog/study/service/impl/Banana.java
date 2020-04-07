package com.mtons.mblog.study.service.impl;

import org.springframework.stereotype.Service;

import com.mtons.mblog.study.service.Fighter;

@Service
public class Banana implements Fighter {
    @Override
    public void fight(){
        System.out.println("Banana: 自由的气息，香蕉迟到了");
    }
}
