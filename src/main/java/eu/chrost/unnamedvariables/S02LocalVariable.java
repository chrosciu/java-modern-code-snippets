package eu.chrost.unnamedvariables;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
class S02LocalVariable {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(1, 2 ,3 ,4));
        if (list.size() >= 4) {
            var x = list.remove(0);
            var y = list.remove(0);
            var _ = list.remove(0);
            var _ = list.remove(0);
            log.info("{} {}", x, y);
        }
    }
}
