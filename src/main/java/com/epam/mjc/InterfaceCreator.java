package com.epam.mjc;

import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return a -> a.stream().map((b) -> b / divider).collect(Collectors.toList());
    }
}
