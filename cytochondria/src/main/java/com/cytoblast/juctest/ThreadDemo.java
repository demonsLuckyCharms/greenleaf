package com.cytoblast.juctest;

/**
 * Created on 2018/4/20.
 */
public class ThreadDemo implements Runnable {

    private boolean flag = false;
    @Override
    public void run() {
        try{
            Thread.sleep(200);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        flag = true;

        System.out.println("flag============" + isFlag());
    }

    public boolean isFlag(){
        return flag;
    }

    public void setFlag(boolean flag){
        this.flag = flag;
    }

}
