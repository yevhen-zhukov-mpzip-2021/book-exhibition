package com.example.bookexhibition.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    private int id;
    private LocalDate date;
    private Speaker speaker;
    private PublishingHouse publishingHouse;
}
