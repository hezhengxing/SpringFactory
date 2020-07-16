package com.example.demo.test;

import com.example.demo.person.CNPerson;
import com.example.demo.person.ENPerson;
import com.example.demo.inter.IPerson;
import com.example.demo.factory.PersonFactory;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello");

        IPerson iPerson = new PersonFactory().getSport(CNPerson.class);
        iPerson.sport();
        IPerson iPerson1 = new PersonFactory().getSport(ENPerson.class);
        iPerson1.sport();

    }
}
