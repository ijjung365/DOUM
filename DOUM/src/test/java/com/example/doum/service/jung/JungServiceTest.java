package com.example.doum.service.jung;

import com.example.doum.domain.dto.jung.JungAnonymousListDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JungServiceTest {
    @Autowired
    JungService jungService;

    @Test
    void test() {

        List<JungAnonymousListDTO> list = jungService.tblAnonymousGetAnonymousList();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}