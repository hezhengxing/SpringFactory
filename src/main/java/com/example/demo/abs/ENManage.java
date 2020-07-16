package com.example.demo.abs;

import com.example.demo.inter.IMangePerson;

/**
 * @Auther: hzx
 * @Date: 2020/7/16 22:16
 * @Description:
 */
public class ENManage implements IMangePerson {
    @Override
    public void manageTeam() {
        System.out.println("EN managerTeam");
    }
}
