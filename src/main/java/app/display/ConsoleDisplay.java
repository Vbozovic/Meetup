package app.display;

import app.entities.Event;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

public class ConsoleDisplay extends Display {

    public ConsoleDisplay() {
        super();
    }

    public ConsoleDisplay(Collection<?> toDisplay) {
        super(toDisplay);
    }

    @Override
    public void doDisplay() {

        for(Object obj:this.toDisplay){
            if(obj instanceof Event){
                Event e = (Event)obj;

                Date date = new Date(e.getTime());
                SimpleDateFormat df2 = new SimpleDateFormat("dd/MM/yy");

                Document doc = Jsoup.parse(e.getDescription());
                System.out.println("-------------------EVENT-------------------");
                System.out.println("Event name: "+e.getName());
                System.out.println("Date: "+df2.format(date));
                System.out.println("Venue: "+e.getVenue().getName());
                System.out.println("Address: "+e.getVenue().getAddress_1());
                System.out.println("Description: ");
                Elements elements = doc.getElementsByTag("p");
                for(Element el : elements){
                    String txt = el.ownText().replaceAll("<br/","\n");
                    System.out.println(txt);
                }


            }
        }

    }

    @Override
    public void undoDisplay() {
        //Nothing to undo


    }
}
