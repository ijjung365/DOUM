package com.example.doum.service.jung;

import com.example.doum.domain.dto.jung.JungAnonymousListDTO;
import com.example.doum.mapper.jung.JungMapper;

import java.util.List;

public class JungServiceImpl implements JungService {
    JungMapper jungMapper;
    @Override
    public List<JungAnonymousListDTO> tblAnonymousGetAnonymousList() {
        return jungMapper.tblAnonymousSelectAll();
    }
}
