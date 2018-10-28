package app;

import app.display.Display;
import app.entities.City;
import app.entities.Event;
import app.handlers.CityHandler;
import app.meetup.EventsHandler;
import app.meetup.MeetupApi;
import app.meetup.RType;
import org.apache.http.client.utils.URIBuilder;
import picocli.CommandLine;

import java.util.List;
import java.util.concurrent.Callable;

public class MeetupLink implements Callable<List<Event>> {

    @CommandLine.Option(names={"City number"},interactive = true, description = "City for which you would like to see all events")
    private int cityNr;

    private List<City> cities;

    public MeetupLink() {
        start();
    }

    public void start(){
        URIBuilder urib = new URIBuilder()
                .setPath("/2/cities")
                .setParameter("country","rs");

        MeetupApi api = new MeetupApi(urib);
        this.cities = api.request(new CityHandler(), RType.GET);

        cities.forEach((c)-> System.out.println(+c.getRanking()+" "+c.getCity()+String.format(" |lat %f lon %f|",c.getLat(),c.getLon())));
    }

    public List<Event> call() throws Exception {

        City selected = cities.get(cityNr);
        System.out.println("All events for "+selected.getCity());

        URIBuilder uri = new URIBuilder()
                .setPath("/2/open_events")
                .setParameter("lat",String.valueOf(selected.getLat()))
                .setParameter("lon",String.valueOf(selected.getLon()))
                //.setParameter("city",selected.getCity())
                .setParameter("country",selected.getCountry());

        MeetupApi api = new MeetupApi(uri);
        List<Event> events = api.request(new EventsHandler(),RType.GET);
        return events;
    }
}
