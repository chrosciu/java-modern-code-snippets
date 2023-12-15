package eu.chrost.sequencedcollections;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.SequencedSet;
import java.util.Set;

@Slf4j
class S01LinkedHashSet {
    public static void main(String[] args) {
        SequencedSet<Integer> primes = new LinkedHashSet<>(List.of(2, 3, 5, 7, 11, 13, 17, 19));
        log.info("Original: {}", primes); // [2, 3, 5, 7, 11, 13, 17, 19]

        //before JDK21 it was not possible to get first & last element in easy way - only via iterator
        log.info("Poll last element: {}", primes.getLast()); // 19

        log.info("Remove last element: {}", primes.removeLast()); // 19
        log.info("Poll last element: {}", primes.getLast()); // 17

        primes.addFirst(1);
        log.info("Poll first element: {}", primes.getFirst()); // 1

        //this is reversed view of original set, not a copy !
        SequencedSet<Integer> reversed = primes.reversed();
        log.info("Reversed: {}", reversed); // [17, 13, 11, 7, 5, 3, 2, 1]

        log.info("Remove last element from reversed: {}", reversed.removeLast()); // 1
        log.info("Reversed: {}", reversed); // [17, 13, 11, 7, 5, 3, 2]
        log.info("Original: {}", primes); // [2, 3, 5, 7, 11, 13, 17]

    }
}
