package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    //A place to keep events
    private static final Map<Integer, Event> events = new HashMap<>();
    //A method to get all Events
    public static Collection<Event> getAll(){
        return events.values();
    }
    //A method to get a single Event
    public static Event getById(int id){
        return events.get(id);
    }
    //A method to add an Event
    public static void add(Event event){
        events.put(event.getId(), event);
    }
    //A method to remove an Event
    public static void remove(int id){
        events.remove(id);
    }
}
