package com.example.demo.abs;

import com.example.demo.inter.IMangePerson;
import com.example.demo.inter.IPlayer;

/**
 * @Auther: hzx
 * @Date: 2020/7/16 22:07
 * @Description:
 */
public abstract class AbsPersonFactory {

    public void init() {
        System.out.println("初始化数据");
    }

    public abstract IMangePerson getManage();

    public abstract IPlayer getPlayer();

}
