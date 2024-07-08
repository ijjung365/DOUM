package com.example.doum.domain.dto.lee;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class PostDTO {

    private Long postId;
    private int likes;
    private String postTitle;
    private String providerId;
    private String postContent;
    private int postViews;
    private LocalDateTime postRegisterDate;
    private LocalDateTime postUpdateDate;


}
