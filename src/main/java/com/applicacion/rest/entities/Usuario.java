package com.applicacion.rest.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario")
public class Usuario {
    @Id
    @SequenceGenerator(
            name = "customer_id_sequence",
            sequenceName = "user_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_id_sequence"
    )
    private Integer id;
    private String email;
    private String password;
    private String name;
    private String lastName;
    private String dni;
    private Integer typeID;
    private String phoneNumber;
    private Integer role;
}

