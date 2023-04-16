package com.aymar.decorator;

import java.util.Arrays;
import java.util.List;

public class IntStream implements Stream<Integer>{
    List<Integer> intStream;

    public IntStream(Integer ... ints){
        intStream= Arrays.stream(ints).toList();
    }

    public List<Integer> getStream() {
        return intStream;
    }
}
