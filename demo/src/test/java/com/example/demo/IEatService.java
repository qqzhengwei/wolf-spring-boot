package com.example.demo;

/**
 * Created by user on 2020/11/17.
 */
public interface IEatService {

    void eat(String model);

    default void eatDefault(String model){
        System.out.println(model);
    }
}
