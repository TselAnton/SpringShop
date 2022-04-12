package com.tsel.pet.project.spring.shop.data;

import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import lombok.ToString;

@Entity
@Table(name = "user")
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = -1117533208827714793L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column
    private String firstName;

    @Column
    private String secondName;

    @Column
    private String email;

    @Column
    private String phone;
}
