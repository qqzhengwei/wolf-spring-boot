package com.wolf.java8.begin;

import lombok.Data;

import java.util.List;

/**
 * Created by user on 2020/11/17.
 */
@Data
public class Apple {

    private Integer weight;

    private String name;

    private List<Apple> appleList;

    public Apple() {
    }

    public Apple(Integer weight) {
        this.weight = weight;
    }

    public Apple(Integer weight, String name) {
        this.weight = weight;
        this.name = name;
    }
}
