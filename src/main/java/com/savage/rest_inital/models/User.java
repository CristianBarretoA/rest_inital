package com.savage.rest_inital.models;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(unique = true, nullable = false)
    private String id;
    private String name;
    private String mail;
    private Integer priority;

    public User() {
    }

    public User(String name, String mail, Integer priority) {
        this.name = name;
        this.mail = mail;
        this.priority = priority;
    }
}
