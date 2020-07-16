package com.example.demo.abs;

import com.example.demo.inter.IMangePerson;

/**
 * @Auther: hzx
 * @Date: 2020/7/16 22:15
 * @Description:
 */
public class CNMange implements IMangePerson {
    @Override
    public void manageTeam() {
        System.out.println("CN managerTeam");
    }
}
