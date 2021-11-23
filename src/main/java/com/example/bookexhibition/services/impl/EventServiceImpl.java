package com.example.bookexhibition.services.impl;

import com.example.bookexhibition.domain.Event;
import com.example.bookexhibition.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {

    private final List<Event> eventList;

    private final List<Event> selectedEventList = new LinkedList<>();

    public EventServiceImpl(@Autowired List<Event> eventList) {
        this.eventList = eventList;
    }

    @Override
    public List<Event> getAll() {
        return eventList;
    }

    @Override
    public List<Event> getByDate(LocalDate date) {
        return eventList.stream().filter(event -> event.getDate().equals(date)).collect(Collectors.toList());
    }

    @Override
    public List<Event> getBySpeakerId(int speakerId) {
        return eventList.stream().filter(event -> event.getSpeaker().getId() == speakerId).collect(Collectors.toList());
    }

    @Override
    public List<Event> getSelectedEvents() {
        return selectedEventList;
    }

    @Override
    public List<Event> rememberSelectedEvents(List<Integer> eventIdList) {
        List<Event> eventsToRemember = eventList.stream()
                .filter(event -> eventIdList.contains(event.getId()))
                .collect(Collectors.toList());

        selectedEventList.addAll(eventsToRemember);

        return eventsToRemember;
    }
}
