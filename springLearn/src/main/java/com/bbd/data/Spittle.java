package com.bbd.data;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

public class Spittle {

    private final Long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longtude;


    public Spittle(String message, Date time, Double latitude, Double longtude) {
        id = null;
        this.message = message;
        this.time = time;
        this.latitude = latitude;
        this.longtude = longtude;
    }

    public Spittle(String message, Date time) {
        this(message, time, null, null);
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongtude() {
        return longtude;
    }

    public void setLongtude(Double longtude) {
        this.longtude = longtude;
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, "id", "time");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }
}
