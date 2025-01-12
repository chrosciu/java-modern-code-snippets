package eu.chrost.streamgatherers;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Gatherer;

@RequiredArgsConstructor
class MapNotNullGatherer<T, M> implements Gatherer<T, T, M> {
    private final Function<T, M> mapper;

    @Override
    public Integrator<T, T, M> integrator() {
        return null;
    }
}

class S08MapNotNull {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(null);
        numbers.add(3);
        List<Integer> doubledNumbers = numbers.stream()
                .gather(new MapNotNullGatherer<>(i -> i * 2))
                .toList();
        System.out.println(doubledNumbers);
    }
}
