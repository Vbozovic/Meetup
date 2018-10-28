package app.handlers;

import app.entities.City;
import app.meetup.ResponseHandler;
import app.responses.CityResponse;
import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


public class CityHandler implements ResponseHandler<List<City>> {


    public List<City> responseHandler(final CloseableHttpResponse response) {

        Gson g = new Gson();

        try {
            CityResponse cresp = (CityResponse) g.fromJson(EntityUtils.toString(response.getEntity()),CityResponse.class);
            return cresp.getResults();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
