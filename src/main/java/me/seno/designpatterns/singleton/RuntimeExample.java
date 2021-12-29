package me.seno.designpatterns.singleton;

public class RuntimeExample {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        System.out.println("runtime.maxMemory() = " + runtime.maxMemory());
        System.out.println("runtime.maxMemory() = " + runtime.freeMemory());
    }
}
