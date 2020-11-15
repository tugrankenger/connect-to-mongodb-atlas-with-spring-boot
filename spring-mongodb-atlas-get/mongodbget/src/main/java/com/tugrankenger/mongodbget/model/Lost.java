package com.tugrankenger.mongodbget.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data

@Document(collection = "actors")
public class Lost {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int age;

}
