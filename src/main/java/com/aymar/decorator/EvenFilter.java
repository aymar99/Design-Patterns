package com.aymar.decorator;

import java.util.List;

public class EvenFilter implements Stream<Integer>{
    Stream<Integer> integerStream;
    public EvenFilter(Stream<Integer> stream) {
        integerStream=stream;
    }

    @Override
    public List<Integer> getStream() {
        return integerStream.getStream().stream().filter(integer -> integer%2==1).toList();
    }
}
