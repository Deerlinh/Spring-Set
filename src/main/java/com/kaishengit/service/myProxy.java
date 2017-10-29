package com.kaishengit.service;

/**
 * Created by 蔡林红 on 2017/10/29.
 */
public class myProxy implements Proxy {



    @Override

    public void save() {
       /* if(1==1){
            throw  new RuntimeException("这是故意抛出的异常");
        }*/
        System.out.println("first Proxy");
    }

    private void find(){
        System.out.println("double Proxy");
    }
}
