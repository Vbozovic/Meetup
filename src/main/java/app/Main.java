package app;
import app.display.ConsoleDisplay;
import app.display.Display;
import app.entities.Event;
import picocli.CommandLine;
import java.io.IOException;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {


        List<Event> events = CommandLine.call(new MeetupLink(),"City number");
        System.out.println();
        Display display = new ConsoleDisplay(events);
        display.doDisplay();

    }

}
