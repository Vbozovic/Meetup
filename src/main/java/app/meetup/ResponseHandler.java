package app.meetup;

public interface ResponseHandler<T> {

    T responseHandler(String payload);

}
