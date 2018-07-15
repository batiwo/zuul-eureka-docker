package com.github.rest2server;

import java.util.concurrent.atomic.AtomicLong;

public class Download {

    private static AtomicLong counter = new AtomicLong();

    private long _id;
    private String _name;
    private String _file;
    private boolean _visible;

    public Download(String name, String file, boolean visible) {
        _id = counter.getAndIncrement();
        _name = name;
        _file = file;
        _visible = visible;
    }

    public long getId() {
        return _id;
    }

    public Download setId(long id) {
        _id = id;
        return this;
    }

    public String getName() {
        return _name;
    }

    public Download setName(String name) {
        _name = name;
        return this;
    }

    public String getFile() {
        return _file;
    }

    public Download setFile(String file) {
        _file = file;
        return this;
    }

    public boolean isVisible() {
        return _visible;
    }

    public Download setVisible(boolean visible) {
        _visible = visible;
        return this;
    }
}
