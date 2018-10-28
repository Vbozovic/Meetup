
package app.entities;

import java.util.HashMap;
import java.util.Map;

public class Group {

    private String join_mode;
    private Long created;
    private String name;
    private Double group_lon;
    private Long id;
    private String urlname;
    private Double group_lat;
    private String who;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getJoin_mode() {
        return join_mode;
    }

    public void setJoin_mode(String join_mode) {
        this.join_mode = join_mode;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGroup_lon() {
        return group_lon;
    }

    public void setGroup_lon(Double group_lon) {
        this.group_lon = group_lon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrlname() {
        return urlname;
    }

    public void setUrlname(String urlname) {
        this.urlname = urlname;
    }

    public Double getGroup_lat() {
        return group_lat;
    }

    public void setGroup_lat(Double group_lat) {
        this.group_lat = group_lat;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
