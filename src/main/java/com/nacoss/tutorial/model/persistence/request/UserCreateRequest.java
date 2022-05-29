package com.nacoss.tutorial.model.persistence.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserCreateRequest {

    @JsonProperty
    private String username;

    @JsonProperty
    private  String firstname;

    @JsonProperty
    private  String lastname;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
