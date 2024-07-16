package com.example.doum.domain.dto.won;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class WonJoinOrgDTO {

    // 기관 테이블
    private Long organizationId;
    private Long  locarionId;
    private String eail;
    private String password;
    private String name;
    private Long  phoneNumber;
    private LocalDateTime resisterDate;
    private Long eailApprove;
    private Long   privatephoneApprove;

    private String managerName;
    private String managerPhoneNumber;
    private String  fileLocation;
    private String status;

    private String  providerId;
    private String provider;
    private String role;


}
