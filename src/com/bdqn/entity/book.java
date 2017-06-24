package com.bdqn.entity;

/**
 * Created by 王 on 2017/6/16.
 */
public class book {
    private int id;
    private String name;
    private int typess;

    public int getTypess() {
        return typess;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypess(int typess) {
        this.typess = typess;
    }
}
