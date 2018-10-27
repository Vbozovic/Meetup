package app.entities;

public class City {

    private String zip;
    private String country;
    private String localized_country_name;
    private double distance;
    private String city;
    private float lon;
    private int ranking;
    private long id;
    private long member_count;
    private double lat;

    public City() {
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocalized_country_name() {
        return localized_country_name;
    }

    public void setLocalized_country_name(String localized_country_name) {
        this.localized_country_name = localized_country_name;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getMember_count() {
        return member_count;
    }

    public void setMember_count(long member_count) {
        this.member_count = member_count;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "City{" +
                "zip='" + zip + '\'' +
                ", country='" + country + '\'' +
                ", localized_country_name='" + localized_country_name + '\'' +
                ", distance=" + distance +
                ", city='" + city + '\'' +
                ", lon=" + lon +
                ", ranking=" + ranking +
                ", id=" + id +
                ", member_count=" + member_count +
                ", lat=" + lat +
                '}';
    }
}
