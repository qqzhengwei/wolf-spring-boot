package com.example.demo1;

import com.example.demo.IEatService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by user on 2020/11/17.
 */
public class FilterUtil<T> {

    @Test
    public void f1() {
        doEat(() -> {
            System.out.println("吃饭了");
            return false;
        });
        doEat(new IRunService() {
            @Override
            public boolean eat() {
                System.out.println("eat起来了");
                return true;
            }
        });
    }

    public static void doEat(IRunService runService) {
        System.out.println("className"+runService.getClass().getClass()+runService.eat());;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<T>();
        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

    boolean test(T t) {
        return false;
    }
}
