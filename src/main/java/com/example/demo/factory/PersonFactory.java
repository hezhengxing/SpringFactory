package com.example.demo.factory;

import com.example.demo.inter.IPerson;

/**
 * @Auther: hzx
 * @Date: 2020/7/16 20:42
 * @Description:
 */
public class PersonFactory {

    public IPerson getSport(Class<? extends IPerson> clazz) {
        try {
            if (null != clazz) {
                return (IPerson) clazz.newInstance();
            }
        } catch (Exception e) {

        }
        return null;
    }
}
