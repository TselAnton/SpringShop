package com.tsel.pet.project.spring.shop.dto;

import java.io.Serial;
import java.io.Serializable;

public record UserLoginDTO(String userName, String password, String firstName,
                           String secondName, String email, String phone) implements Serializable {

    @Serial
    private static final long serialVersionUID = -4675056867199357505L;
}
