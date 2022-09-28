package com.yuricjardim.sbmongodb.dto;

import com.yuricjardim.sbmongodb.domain.User;
import lombok.Data;

import java.io.Serializable;

@Data
public class AuthorDTO implements Serializable {

    private String id;
    private String name;

    public AuthorDTO(){}

    public AuthorDTO(User obj) {
        id = obj.getId();
        name = obj.getName();
    }
}
