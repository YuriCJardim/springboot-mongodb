package com.yuricjardim.sbmongodb.domain;

import com.yuricjardim.sbmongodb.dto.AuthorDTO;
import com.yuricjardim.sbmongodb.dto.CommentDTO;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Document
public class Post implements Serializable {

    @Id
    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO authorDTO;

    private List<CommentDTO> comments = new ArrayList<>();


    public Post(){}

    public Post(String id, Date date, String title, String body, AuthorDTO authorDTO) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.body = body;
        this.authorDTO = authorDTO;
    }
}
