package com.aymar.decorator;

public class AppMain {
    public static void main(String[] args) {
        Stream<Integer> intStream=new IntStream(1,2,3,4,5,6);
        System.out.println(intStream.getStream());
        intStream=new EvenFilter(intStream);
        System.out.println(intStream.getStream());
    }
}
