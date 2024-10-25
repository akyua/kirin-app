package com.kirin_app.api.domain.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name= "users")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.UUID)
    private String id;

    private String name;

    private String email;

    private String password;
}