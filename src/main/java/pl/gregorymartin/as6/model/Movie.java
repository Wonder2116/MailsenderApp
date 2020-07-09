package pl.gregorymartin.as6.model;

import java.time.LocalDate;

public class Movie {
    private String name;
    private LocalDate date;
    private String producer;

    public Movie(final String name, final LocalDate date, final String producer) {
        this.name = name;
        this.date = date;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(final LocalDate date) {
        this.date = date;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(final String producer) {
        this.producer = producer;
    }
}
