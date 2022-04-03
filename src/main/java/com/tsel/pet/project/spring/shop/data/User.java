package com.tsel.pet.project.spring.shop.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //todo: вспомнить на счёт генераций
    private String id;

    private String nickName;
//    private String password;
    private String firstName;
    private String secondName;
    private String email;
    private String phone;
}
