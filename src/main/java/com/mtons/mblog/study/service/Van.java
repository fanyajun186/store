package com.mtons.mblog.study.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Van {
    @Autowired
    private Fighter fighter;

    public void fight(){
        System.out.println("van：boy next door,do you like 玩游戏");
        fighter.fight();
    }
}
