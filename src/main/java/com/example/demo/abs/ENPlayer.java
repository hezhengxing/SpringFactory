package com.example.demo.abs;

import com.example.demo.inter.IPlayer;

/**
 * @Auther: hzx
 * @Date: 2020/7/16 22:17
 * @Description:
 */
public class ENPlayer implements IPlayer {
    @Override
    public void playBall() {
        System.out.println("EN playball");
    }
}
