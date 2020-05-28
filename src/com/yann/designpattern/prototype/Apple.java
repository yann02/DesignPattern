package com.yann.designpattern.prototype;

public class Apple implements Cloneable {
    private String size;
    private String place;
    private String name;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Apple(String name,String size,String place) {
        System.out.println("实例化成功");
        this.name=name;
        this.size=size;
        this.place = place;
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("原型复制成功");
        return super.clone();
    }
}
