package com.example.demo1;

/**
 * Created by user on 2020/11/17.
 */
public interface IRunService {

    boolean eat();

    default void run(){
        System.out.println("跑起来");
    };
}
