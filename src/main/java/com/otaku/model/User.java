package com.otaku.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users",uniqueConstraints= {@UniqueConstraint (columnNames = {"user_name"}),@UniqueConstraint (columnNames = {"email"})})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("user_id")
    private long userId;

    @Column(name="user_name")
    private String userName;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="mobile_number")
    private String mobileNumber;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="gender")
    private Gender gender;

}
