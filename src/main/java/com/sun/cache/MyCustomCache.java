package com.sun.cache;

import org.apache.ibatis.cache.Cache;

import java.util.concurrent.locks.ReadWriteLock;

public class MyCustomCache implements Cache {

    private String id;

    public MyCustomCache(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public void putObject(Object key, Object value) {

    }

    @Override
    public Object getObject(Object key) {
        return null;
    }

    @Override
    public Object removeObject(Object key) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public ReadWriteLock getReadWriteLock() {
        return null;
    }
}
