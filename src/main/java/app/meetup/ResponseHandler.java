package app.meetup;

import org.apache.http.client.methods.CloseableHttpResponse;

public interface ResponseHandler<T> {

    T responseHandler(final CloseableHttpResponse response);

}
