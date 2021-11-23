package com.example.bookexhibition.configurations;

import com.example.bookexhibition.domain.Event;
import com.example.bookexhibition.domain.PublishingHouse;
import com.example.bookexhibition.domain.Speaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Configuration
public class EventConfiguration {

    @Bean
    public List<Event> eventList() {
        return Arrays.asList(
                new Event(
                        1,
                        LocalDate.of(2021, 11, 23),
                        new Speaker(1, "John", "Doe"),
                        new PublishingHouse(1, "Awesome Publishing")),
                new Event(
                        1,
                        LocalDate.of(2021, 11, 23),
                        new Speaker(2, "Johanna", "Doe"),
                        new PublishingHouse(2, "Cool Publishing")),
                new Event(
                        1,
                        LocalDate.of(2021, 11, 24),
                        new Speaker(3, "Michel", "Jackson"),
                        new PublishingHouse(3, "Eternity Publishing"))
        );
    }
}
