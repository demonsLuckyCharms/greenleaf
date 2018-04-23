package com.cytoblast.juctest;

/**
 * Created on 2018/4/20.
 */
public class volatileDemo {

    public static void main(String[] args){
        ThreadDemo td = new ThreadDemo();
        new Thread(td).start();

        while(true){
            if(td.isFlag()){
                System.out.println("########");
                break;
            }
        }
    }
//        Thread.State
}
