package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.wolf.java8.begin.Apple;
import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Created by user on 2020/11/17.
 */
public class SimpleTest {

    @Test
    public void test7(){
        Predicate<Apple> predicate = new Predicate<Apple>(){
            @Override
            public boolean test(Apple apple) {
                return apple.getName().equalsIgnoreCase("大苹果");
            }
        };
        Apple apple = new Apple(18, "大苹果");
        Apple apple1 = new Apple(6, "小苹果");
        System.out.println(predicate.test(apple));;
        System.out.println(predicate.test(apple1));;
    }

    @Test
    public void test6(){
        List<Apple> appleList = new ArrayList<Apple>();
        Apple apple = new Apple(18, "大苹果");
        Apple apple1 = new Apple(6, "小苹果");
        Apple apple2 = new Apple(11, "中苹果");
        Apple apple3 = new Apple(66, "特大苹果");
        appleList.add(apple);
        appleList.add(apple1);
        appleList.add(apple2);
        appleList.add(apple3);
        System.out.println(JSON.toJSONString(appleList));

        //原始写法1
        appleList.sort(new AppleComparator());
        //写法2
        appleList.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        //写法3-lambda写法1
        appleList.sort((Apple o1,Apple o2)->o1.getWeight().compareTo(o2.getWeight()));
        //写法4-lambda写法2
        appleList.sort((o1,o2)->o1.getWeight().compareTo(o2.getWeight()));


        //
        appleList.sort(Comparator.comparing(Apple::getWeight));
        appleList.sort(Comparator.comparing(Apple::getWeight).reversed());

        System.out.println(JSON.toJSONString(appleList));
    }

    class  AppleComparator implements Comparator<Apple>{

        @Override
        public int compare(Apple o1, Apple o2) {
            return o1.getWeight().compareTo(o2.getWeight());
        }
    }

    @Test
    public void test5() {
        Apple apple = new Apple(18, "大苹果");

        Supplier<Apple> supplier = Apple::new;//等价于
        Supplier<Apple> supplier1 = () -> new Apple();
        System.out.println(supplier.get());

        Function<Integer,Apple> function = Apple::new;
        Apple apple1 = function.apply(10);
        System.out.println(JSON.toJSONString(apple1));
    }

    @Test
    public void test4() {
        IEatService eatService = new EatServiceImp();
        eatService.eatDefault("默认吃东西");
        eatService.eat("自定义吃东西啊");
    }

    @Test
    public void test3() {
        List<Apple> appleList = null;//new ArrayList<Apple>();
        appleList = Optional.ofNullable(appleList).orElse(new ArrayList<>());
        Apple apple = new Apple(18, "大苹果");
        Apple apple1 = new Apple(6, "小苹果");
        Apple apple2 = new Apple(11, "中大苹果");
        Apple apple3 = new Apple(66, "特大苹果");
        Apple apple4 = new Apple(22, "大苹果");
        Apple apple5 = new Apple(22, "大苹果22号");
        appleList.add(apple);
        appleList.add(apple1);
        appleList.add(apple2);
        appleList.add(apple3);
        appleList.add(apple4);
        appleList.add(apple5);
        Map<Integer, List<Apple>> appleWeightByApple = new HashMap<>();
        appleWeightByApple = appleList.stream().filter(ap -> ap.getWeight() > 11).collect(Collectors.groupingBy(Apple::getWeight));
        System.out.println(JSON.toJSONString(appleWeightByApple));
    }

    @Test
    public void test2() {
        List<Apple> appleList = null;//new ArrayList<Apple>();
        appleList = Optional.ofNullable(appleList).orElse(new ArrayList<>());
        Apple apple = new Apple(18, "大苹果");
        Apple apple1 = new Apple(6, "小苹果");
        Apple apple2 = new Apple(11, "中大苹果");
        Apple apple3 = new Apple(66, "特大苹果");
        Apple apple4 = new Apple(22, "大苹果");
        List<Apple> appleSubList = new ArrayList<Apple>();
        appleSubList.add(apple);
        appleSubList.add(apple2);
        apple4.setAppleList(appleSubList);
        appleList.add(apple);
        appleList.add(apple1);
        appleList.add(apple2);
        appleList.add(apple3);
        appleList.add(apple4);
        //选出重量大于10的苹果
        List<Apple> appleList2 = appleList.stream().filter(ap -> ap.getWeight() > 10 && ap.getName().contains("大")).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(appleList2));
        //选出重量大于10的苹果
        List<Apple> appleList2x = appleList.parallelStream().filter(ap -> ap.getWeight() > 10 && ap.getName().contains("大")).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(appleList2x));
        //选出苹果中包含大的
        List<Apple> appleList3 = appleList.stream().filter(ap -> ap.getName().contains("大")).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(appleList3));

        System.out.println(JSON.toJSONString(appleList
                .stream()
                .map(Apple::getName)));
        //获取券列表
        List<Apple> conditionCouponList = appleList
                .stream()
                .filter(subApple -> subApple.getAppleList() != null)//过滤一下，苹果下面没的配置的信息：防止空指针
                .map(Apple::getAppleList)//
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(JSON.toJSONString(conditionCouponList));
        List<Apple> conditionCouponList2 = new ArrayList<>();
        for (Apple ap : appleList) {
            if (ap.getAppleList() != null) {
                conditionCouponList2.addAll(ap.getAppleList());
            }
        }
        System.out.println(JSON.toJSONString(conditionCouponList2));
    }

    //Predicate
    public static boolean getBigApp(Apple apple) {
        return apple.getWeight() > 10;
    }

    @Test
    public void test1() {
        List<Apple> appleList = new ArrayList<Apple>();
        Apple apple = new Apple(18, "大苹果");
        Apple apple1 = new Apple(6, "小苹果");
        Apple apple2 = new Apple(11, "中苹果");
        Apple apple3 = new Apple(66, "特大苹果");
        appleList.add(apple);
        appleList.add(apple1);
        appleList.add(apple2);
        appleList.add(apple3);

        //由小到大排序
        Collections.sort(appleList, new Comparator<Apple>() {
            public int compare(Apple a1, Apple a2) {
                return a2.getWeight().compareTo(a1.getWeight());
            }
        });
        System.out.println(JSON.toJSONString(appleList));

        appleList = appleList.stream().sorted((a1, a2) -> a1.getWeight().compareTo(a2.getWeight())).collect(Collectors.toList());
        System.out.println(JSON.toJSONString(appleList));
    }
}
