package com.yuricjardim.sbmongodb.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CommentDTO implements Serializable {

    private String text;
    private Date date;
    private AuthorDTO author;

    public CommentDTO (){}

    public CommentDTO (String text, Date date, AuthorDTO author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }

}
