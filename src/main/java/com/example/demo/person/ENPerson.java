package com.example.demo.person;

import com.example.demo.inter.IPerson;

public class ENPerson implements IPerson {
    @Override
    public void sport() {
        System.out.println("basketball");
    }
}
