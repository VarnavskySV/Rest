package ru.haulmont.demo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.UUID;

@Entity
public class Book {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "ID", nullable = false)
    private UUID id;

    @Column(name="name")
    private String name;

    @Column(name="date_publish")
    private Date datePublish;

    @Column(name="producer")
    private String producer;

    public Book(String name, Date datePublish, String producer) {
        this.name = name;
        this.datePublish = datePublish;
        this.producer = producer;
    }
    public Book(){}
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
