package com.example.doum.domain.dto.lee;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class VolunteerActivity {
    private Long id;
    private String title;
    private String date;
    private String organization;
    private String imageUrl;


}
