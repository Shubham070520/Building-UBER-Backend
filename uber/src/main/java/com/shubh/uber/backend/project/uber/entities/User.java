package com.shubh.uber.backend.project.uber.entities;

import com.shubh.uber.backend.project.uber.entities.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "app_user", indexes = {
        @Index(name = "idx_user_email", columnList = "email")
})
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //every time we add new row/entity,db will provide new id
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    @ElementCollection(fetch = FetchType.LAZY)
    //creating another table specifically for roles as sql db is used, and set is being stored .....many things for a particular user.
    // new table will be created named app_user_roles  (table name + variable name)
    @Enumerated(EnumType.STRING)
    // to tell hibernate that roles are gonna be stored in string format
    private Set<Role> roles;
}
