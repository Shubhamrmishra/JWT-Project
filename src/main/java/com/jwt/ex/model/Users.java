package com.jwt.ex.model;

import lombok.*;

@Getter
@Setter
public class Users {

    private String id;
    private String name;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public Users(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
