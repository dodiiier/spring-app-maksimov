package org.example.maksimov;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    public static void main(String[] args) {
        List<String> song1 = new ArrayList<>();
        song1.add("Maestro");
        song1.add("Bethoven");
        song1.add("Mozart");
    }

    @Override
    public List<String> getSong() {
        return song1;
    }
}

