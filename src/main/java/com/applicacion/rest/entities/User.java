package com.applicacion.rest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    private long id;
    private String email;
    private String password;
    private String name;
    private String lastName;
    private String dni;
    private Integer typeID;
    private String phoneNumber;
    private Integer role;
}

