package com.tw.apistackbase.core;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile")
    private Profile profile;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Company() {}

    public Company(String name) {
        this.name = name;
    }
}
