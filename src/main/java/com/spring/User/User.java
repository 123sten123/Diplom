package com.spring.User;

import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Степан1 on 03.04.2018.
 */
@Component
@Entity
@Table(name = "USERID")
public class User {
    @Id
    @Column(name = "LASTNAME")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("123");
    }

}
