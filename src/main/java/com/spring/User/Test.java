package com.spring.User;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by Степан1 on 10.05.2018.
 */
@Component
@Entity
@Table(name = "TEST")
public class Test {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "LASTNAME")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("123");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
