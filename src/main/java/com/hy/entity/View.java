package com.hy.entity;

public class View {
    String name;
    String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "View{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}