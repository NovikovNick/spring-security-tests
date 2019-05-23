package com.metalheart.service;

import com.metalheart.Model;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.springframework.stereotype.Component;

@Component
public class Service {

    public List<Model> get() {
        return IntStream.range(0, 10)
            .mapToObj(i -> Model.builder().x(i).build())
            .collect(Collectors.toList());
    }
}
