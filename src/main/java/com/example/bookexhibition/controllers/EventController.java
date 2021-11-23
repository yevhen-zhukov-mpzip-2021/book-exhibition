package com.example.bookexhibition.controllers;

import com.example.bookexhibition.domain.Event;
import com.example.bookexhibition.services.EventService;
import com.example.bookexhibition.utils.DateMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    private final EventService eventService;

    public EventController(@Autowired EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/all")
    public List<Event> getAllEvents() {
        return eventService.getAll();
    }

    @GetMapping("/filter/date/{date}")
    public List<Event> getEventsByDate(@PathVariable("date") int integerDate) {
        return eventService.getByDate(DateMapperUtils.integerToDate(integerDate));
    }

    @GetMapping("/filter/speaker/{speakerId}")
    public List<Event> getEventsBySpeakerId(@PathVariable("speakerId") int speakerId) {
        return eventService.getBySpeakerId(speakerId);
    }

    @GetMapping(value = "/favorite/all")
    public List<Event> getEventsBySpeakerId() {
        return eventService.getSelectedEvents();
    }

    @PostMapping(value = "/favorite/new",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Event> saveEventsById(@RequestBody List<Integer> eventIdList) {
        return eventService.rememberSelectedEvents(eventIdList);
    }
}
