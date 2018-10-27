package app.handlers;

import app.entities.City;
import app.meetup.ResponseHandler;
import app.responses.CityResponse;
import com.google.gson.Gson;

import java.util.LinkedList;
import java.util.List;


public class CityHandler implements ResponseHandler<List<City>> {



    public List<City> responseHandler(String payload) {
        Gson g = new Gson();
        CityResponse cresp = g.fromJson(payload,CityResponse.class);
        return cresp.getResults();
    }
}
