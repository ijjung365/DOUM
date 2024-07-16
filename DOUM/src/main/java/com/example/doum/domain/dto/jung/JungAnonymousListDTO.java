package com.example.doum.domain.dto.jung;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class JungAnonymousListDTO {
    private Long anonymousId;
    private Long userId;
    private String title;
    private String content;
    private LocalDateTime createdDate;
    private Long views;
}
