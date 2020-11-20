package com.example.demo;

/**
 * Created by user on 2020/11/17.
 */
public class EatServiceImp implements IEatService {

    @Override
    public void eat(String model) {
        System.out.println(model);
    }

    @Override
    public void eatDefault(String model) {
        System.out.println("默认已被改写"+model);
    }
}
