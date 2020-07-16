package com.example.demo.abs;

import com.example.demo.inter.IMangePerson;
import com.example.demo.inter.IPlayer;

/**
 * @Auther: hzx
 * @Date: 2020/7/16 22:23
 * @Description:
 */
public class ENAbsPersonFactory extends AbsPersonFactory {
    @Override
    public IMangePerson getManage() {
        super.init();
        return new ENManage();
    }

    @Override
    public IPlayer getPlayer() {
        super.init();
        return new ENPlayer();
    }
}
