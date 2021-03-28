package com.example.demo.model.user;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection="users")
public class User {

    @Id
    private long id;

    @JsonProperty("username")
    private String username;

    public User() {}    

    @Builder
    public User(String username){
        this.username = username;
    }

}
