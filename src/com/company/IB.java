package com.company;

public interface IB {
    int a = 20;
    void m();
    default void n() {
        System.out.println("hi from interface IB");
    }
}
