package com.example.doum.service.jung;

import com.example.doum.domain.dto.jung.JungAnonymousListDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface JungService {
    List<JungAnonymousListDTO> tblAnonymousGetAnonymousList();
}
