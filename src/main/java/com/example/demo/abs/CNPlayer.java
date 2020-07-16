package com.example.demo.abs;

import com.example.demo.inter.IPlayer;

/**
 * @Auther: hzx
 * @Date: 2020/7/16 22:15
 * @Description:
 */
public class CNPlayer implements IPlayer {
    @Override
    public void playBall() {
        System.out.println("CN playball");
    }
}
