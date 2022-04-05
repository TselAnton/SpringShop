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
    @GeneratedValue
    private long id;

    @Column(name = "nick_name")
    private String nickName;
//    @Column
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
