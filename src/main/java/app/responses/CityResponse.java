package app.responses;

import app.entities.City;

import java.util.List;

public class CityResponse {

    private List<City> results;

    public CityResponse() {
    }

    public List<City> getResults() {
        return results;
    }

    public void setResults(List<City> results) {
        this.results = results;
    }
}
