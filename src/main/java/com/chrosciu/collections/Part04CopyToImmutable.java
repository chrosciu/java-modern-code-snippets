package com.chrosciu.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
public class Part04CopyToImmutable {
    public static void main(String[] args) {
        var originalList = Arrays.asList("A", "B");
        var list = List.copyOf(originalList);
        originalList.set(0, "C");
        log.info("{}", originalList);
        list.set(0, "C");
    }
}
