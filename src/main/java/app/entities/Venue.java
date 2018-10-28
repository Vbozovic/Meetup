
package app.entities;

import java.util.HashMap;
import java.util.Map;

public class Venue {

    private String country;
    private String localized_country_name;
    private String city;
    private String address_1;
    private String name;
    private Double lon;
    private Long id;
    private Double lat;
    private Boolean repinned;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress_1() {
        return address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Boolean getRepinned() {
        return repinned;
    }

    public void setRepinned(Boolean repinned) {
        this.repinned = repinned;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
