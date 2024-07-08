package com.example.doum.domain.dto.lee;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UsersDTO {
//마이페이지 유저들의 DTO
    private Long providerId;
    private String providerName;
    private int age;
    private String location;
    private String qualifications;
    private String availableDays;
    private String profilePic;
    private String createAt;
    private String updateAt;



}
