package com.example.Rabota.Models;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.sql.Date;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Length(min = 2, max = 20)
    @Pattern(regexp ="^[А-Яа-яЁё]+$", message = "В фамилии могут быть только русские буквы")
    private String lastname;
    @Length(min = 2, max = 20)
    @Pattern(regexp ="^[А-Яа-яЁё]+$", message = "В имени могут быть только русские буквы")
    private String name;
    @Length(min = 2, max = 20)
    @Pattern(regexp ="^[А-Яа-яЁё]+$", message = "В отчестве могут быть только русские буквы")
    private String middlename;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull(message = "Заполните дату")
    @Past
    private java.util.Date birthday;
    @Min(0)
    @NotNull(message = "Заполните колличество покупок")
    private Integer bues;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public java.util.Date getBirthday() {
        return birthday;
    }

    public void setBirthday(java.util.Date birthday) {
        this.birthday = birthday;
    }

    public Integer getBues() {
        return bues;
    }

    public void setBues(Integer bues) {
        this.bues = bues;
    }

    public Client() {
    }


}