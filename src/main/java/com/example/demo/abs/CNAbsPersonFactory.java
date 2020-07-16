package com.example.demo.abs;

import com.example.demo.inter.IMangePerson;
import com.example.demo.inter.IPlayer;

/**
 * @Auther: hzx
 * @Date: 2020/7/16 22:19
 * @Description:
 */
public class CNAbsPersonFactory extends AbsPersonFactory {
    @Override
    public IMangePerson getManage() {
        super.init();
        return new CNMange();
    }

    @Override
    public IPlayer getPlayer() {
        return new CNPlayer();
    }
}
