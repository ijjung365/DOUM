package com.example.doum.domain.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Getter
@ToString
@NoArgsConstructor
public class UserVO {
    private Long userId;
    private Long locationId;
    private String email;
    private String password;
    private String name;
    private String phoneNumber;
    private LocalDateTime registerDate;
    private Long emailApprove;
    private Long phoneApprove;
    private LocalDateTime birthDate;
    private String gender;
    private String introduction;
    private String providerId;
    private String provider;
    private String role;

    @Builder
    public UserVO(Long userId, Long locationId, String email, String password, String name, String phoneNumber, LocalDateTime registerDate,
                Long emailApprove, Long phoneApprove, LocalDateTime birthDate, String gender, String introduction, String providerId,
                String provider, String role) {
        this.userId = userId;
        this.locationId = locationId;
        this.email = email;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.registerDate = registerDate;
        this.emailApprove = emailApprove;
        this.phoneApprove = phoneApprove;
        this.birthDate = birthDate;
        this.gender = gender;
        this.introduction = introduction;
        this.providerId = providerId;
        this.provider = provider;
        this.role = role;
    }
}
