package com.springboot.match.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Player {

@Id
@GeneratedValue
int id;
String name;
String dateOfBirth;
String email;
String status;
String noShow;

    public Player(String name, String dateOfBirth, String email, String status, String noShow) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.status = status;
        this.noShow = noShow;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNoShow() {
        return noShow;
    }

    public void setNoShow(String noShow) {
        this.noShow = noShow;
    }
}