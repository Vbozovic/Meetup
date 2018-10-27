package app.meetup;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.http.HttpEntity;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;

public class MeetupApi {

    private static String API_KEY = "2a70ef7625447c376d52273671d51";

    private URI uri;

    public MeetupApi(URIBuilder uri) {
        uri.addParameter("key", API_KEY);
        try {
            this.uri = uri.build();
        } catch (URISyntaxException e) {
            uri = null;
            e.printStackTrace();
        }
    }


    private HttpRequestBase getReq(final RType type) {
        switch (type) {
            case GET:
                return new HttpGet(this.uri);
            case POST:
                return new HttpPost(this.uri);
            case PUT:
                return new HttpPut(this.uri);
            case HEAD:
                return new HttpHead(this.uri);
            case PATCH:
                return new HttpPatch(this.uri);
            case DELETE:
                return new HttpDelete(this.uri);
            case OPTIONS:
                return new HttpOptions(this.uri);
            case TRACE:
                return new HttpTrace(this.uri);
            default:
                return null;
        }
    }


    public <T> T request(final ResponseHandler<? extends T> handler, final RType reqType) {

        if (uri == null) {
            return null;
        }

        T toReturn = null;

        final CloseableHttpClient httpclient = HttpClients.createDefault();

        final HttpRequestBase request = getReq(reqType);

        try {
            CloseableHttpResponse response = httpclient.execute(request);

            StatusLine line = response.getStatusLine();

            //checking if everything
            if (line.getStatusCode() == 200) {

                HttpEntity entity = response.getEntity();
                BufferedReader iStream = new BufferedReader(new InputStreamReader(entity.getContent()));
                StringBuilder bldr = new StringBuilder();

                //in case new lines are present in response
                while (iStream.ready()) {
                    bldr.append(iStream.readLine());
                }

                toReturn = handler.responseHandler(bldr.toString());

                //close all the resources
                iStream.close();
                response.close();
                httpclient.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return toReturn;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }
}
