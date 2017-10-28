package com.kaishengit;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by 蔡林红 on 2017/10/27.
 */
public class HelloWord {
    private  Integer age;
    private String address;
    private List<String> list;
    private Set<Double> set;
    private Map<String,String> map;
    private Properties properties;

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<Double> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    //set 注入①
    private String name;
    public  void setName(String name){
        this.name=name;
    }

 /*   //②构造方法
    public HelloWord(String name){
        this.name=name;
    }*/

    public void  printHello(){
        System.out.println("Hello" + name);

    }
}
