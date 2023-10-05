package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("events")
public class EventController {

    @GetMapping()
    public String eventController(Model model){
        ArrayList<String> eventList = new ArrayList<>();
        eventList.add("Bog Fest");
        eventList.add("Annual Maize Celebration");
        eventList.add("Bob's Music Blast Off");
        model.addAttribute("events", eventList);
        return "events/index";
    }
    //lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }
}
