
package app.entities;

import java.util.HashMap;
import java.util.Map;

public class Event {

    private Long utc_offset;
    private Venue venue;
    private Long rsvp_limit;
    private Long headcount;
    private Double distance;
    private String visibility;
    private Long waitlist_count;
    private Long created;
    private Long maybe_rsvp_count;
    private String description;
    private String event_url;
    private Long yes_rsvp_count;
    private Long duration;
    private String name;
    private String id;
    private String photo_url;
    private Long time;
    private Long updated;
    private Group group;
    private String status;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Long getUtc_offset() {
        return utc_offset;
    }

    public void setUtc_offset(Long utc_offset) {
        this.utc_offset = utc_offset;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Long getRsvp_limit() {
        return rsvp_limit;
    }

    public void setRsvp_limit(Long rsvp_limit) {
        this.rsvp_limit = rsvp_limit;
    }

    public Long getHeadcount() {
        return headcount;
    }

    public void setHeadcount(Long headcount) {
        this.headcount = headcount;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public Long getWaitlist_count() {
        return waitlist_count;
    }

    public void setWaitlist_count(Long waitlist_count) {
        this.waitlist_count = waitlist_count;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Long getMaybe_rsvp_count() {
        return maybe_rsvp_count;
    }

    public void setMaybe_rsvp_count(Long maybe_rsvp_count) {
        this.maybe_rsvp_count = maybe_rsvp_count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEvent_url() {
        return event_url;
    }

    public void setEvent_url(String event_url) {
        this.event_url = event_url;
    }

    public Long getYes_rsvp_count() {
        return yes_rsvp_count;
    }

    public void setYes_rsvp_count(Long yes_rsvp_count) {
        this.yes_rsvp_count = yes_rsvp_count;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getUpdated() {
        return updated;
    }

    public void setUpdated(Long updated) {
        this.updated = updated;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
