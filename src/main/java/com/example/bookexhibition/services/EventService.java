package com.example.bookexhibition.services;

import com.example.bookexhibition.domain.Event;

import java.time.LocalDate;
import java.util.List;

public interface EventService {

    List<Event> getAll();

    List<Event> getByDate(LocalDate date);

    List<Event> getBySpeakerId(int speakerId);

    List<Event> getSelectedEvents();

    List<Event> rememberSelectedEvents(List<Integer> eventIdList);
}
