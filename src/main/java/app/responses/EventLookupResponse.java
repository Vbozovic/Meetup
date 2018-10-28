package app.responses;

import app.entities.Event;

import java.util.List;

public class EventLookupResponse {

    private List<Event> results;


    public EventLookupResponse() {
    }

    public List<Event> getResults() {
        return results;
    }

    public void setResults(List<Event> results) {
        this.results = results;
    }
}
