package com.example.demo.factory;

import com.example.demo.inter.IPerson;
import com.example.demo.inter.IPersonFactory;
import com.example.demo.person.ENPerson;

/**
 * @Auther: hzx
 * @Date: 2020/7/16 21:54
 * @Description:
 */
public class ENPersonFactory implements IPersonFactory {
    @Override
    public IPerson getSport() {
        System.out.println("playbasketball");
        return new ENPerson();
    }
}
