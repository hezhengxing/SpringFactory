package com.example.demo.test;

import com.example.demo.factory.CNPersonFactory;
import com.example.demo.factory.ENPersonFactory;
import com.example.demo.inter.IPerson;

/**
 * @Auther: hzx
 * @Date: 2020/7/16 21:57
 * @Description:
 */
public class TestFactory {
    public static void main(String[] args) {
        IPerson person = new CNPersonFactory().getSport();
        person.sport();
        IPerson person1 = new ENPersonFactory().getSport();
        person1.sport();
    }
}
