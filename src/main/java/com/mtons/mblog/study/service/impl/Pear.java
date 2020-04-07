package com.mtons.mblog.study.service.impl;

import org.springframework.stereotype.Service;

import com.mtons.mblog.study.service.Fighter;

@Service
public class Pear implements Fighter {
    public void fight(){
        System.out.println("Billy：吾乃新日暮里的王，三界哲学的主宰。");

    }
}
