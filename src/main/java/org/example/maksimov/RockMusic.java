package org.example.maksimov;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> song = new ArrayList<>();

    @Override
    public List<String> getSong() {
        return song;
    }
}
