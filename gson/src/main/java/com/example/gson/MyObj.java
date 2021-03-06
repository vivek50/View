package com.example.gson;

import java.util.ArrayList;

/**
 * Created by vivek50 on 20/10/16.
 */

public class MyObj {

    private String name;
    private ArrayList<String> cities;
    private Integer age;
    private Boolean isIndian;
    private InnerObj obj;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getCities() {
        return cities;
    }

    public void setCities(ArrayList<String> cities) {
        this.cities = cities;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getIndian() {
        return isIndian;
    }

    public void setIndian(Boolean indian) {
        isIndian = indian;
    }

    public InnerObj getObj() {
        return obj;
    }

    public void setObj(InnerObj obj) {
        this.obj = obj;
    }
}
