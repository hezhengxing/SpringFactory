package com.example.demo.test;

import com.example.demo.abs.AbsPersonFactory;
import com.example.demo.abs.CNAbsPersonFactory;
import com.example.demo.abs.ENAbsPersonFactory;

/**
 * @Auther: hzx
 * @Date: 2020/7/16 22:27
 * @Description:
 */
public class TestAbsFactory {
    public static void main(String[] args) {
        AbsPersonFactory personFactory = new ENAbsPersonFactory();
        personFactory.getPlayer().playBall();
        personFactory.getManage().manageTeam();

        AbsPersonFactory personFactory1 = new CNAbsPersonFactory();
        personFactory1.getPlayer().playBall();
        personFactory1.getManage().manageTeam();
    }
}
