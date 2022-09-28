package com.yuricjardim.sbmongodb.dto;

import com.yuricjardim.sbmongodb.domain.User;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {

    private String id;
    private String name;
    private String email;

    public UserDTO (){}

    public UserDTO(User obj){
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();

    }




}
