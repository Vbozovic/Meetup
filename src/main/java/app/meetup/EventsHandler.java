package app.meetup;

import app.entities.Event;
import app.responses.EventLookupResponse;
import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;

public class EventsHandler implements ResponseHandler<List<Event>> {


    public List<Event> responseHandler(CloseableHttpResponse response) {

        Gson g = new Gson();

        EventLookupResponse elresp = null;
        try {
            String json = EntityUtils.toString(response.getEntity());
            elresp = g.fromJson(json, EventLookupResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return elresp.getResults();
    }
}
