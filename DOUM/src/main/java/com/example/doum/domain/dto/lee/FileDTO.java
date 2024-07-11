package com.example.doum.domain.dto.lee;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class FileDTO {
    //마이스토리 게시물에 들어가는 파일.


    //올린 파일의 아이디
    private Long fileId;
    //올린 파일의 실제 노출할 이름
    private String fileName;
    // 파일 크기
    private Long fileSize;
    //파일 올린 시간
    private LocalDateTime uploadTime;
    //어느 게시물의 첨부파일인지 (fk)
    private Long storyId;








}
