package app;

import app.entities.City;
import app.handlers.CityHandler;
import app.meetup.MeetupApi;
import app.meetup.RType;

import org.apache.http.client.utils.URIBuilder;
import java.io.IOException;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        URIBuilder urib = new URIBuilder()
                .setScheme("https")
                .setHost("api.meetup.com")
                .setPath("/2/cities")
                .setParameter("country","rs");



        MeetupApi api = new MeetupApi(urib);

        List<City> cities = api.request(new CityHandler(), RType.GET);

        for(City c:cities){
            System.out.println(c);
        }


    }

}
