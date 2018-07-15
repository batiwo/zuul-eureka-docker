package com.github.rest1server;

import java.util.concurrent.atomic.AtomicLong;

public class Admin {

    private static AtomicLong counter = new AtomicLong();

    private long _id;
    private String _name;

    public Admin(String name) {
        _id = counter.getAndIncrement();
        _name = name;
    }

    public long getId() {
        return _id;
    }

    public Admin setId(long id) {
        _id = id;
        return this;
    }

    public String getName() {
        return _name;
    }

    public Admin setName(String name) {
        _name = name;
        return this;
    }
}
