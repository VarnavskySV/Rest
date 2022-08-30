package ru.haulmont.demo.dto;

import javax.persistence.Column;
import java.util.Date;

public class BookDto {
    private String name;

    private Date datePublish;

    private String producer;

    public BookDto(String name, Date datePublish, String producer) {
        this.name = name;
        this.datePublish = datePublish;
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDatePublish() {
        return datePublish;
    }

    public void setDatePublish(Date datePublish) {
        this.datePublish = datePublish;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
