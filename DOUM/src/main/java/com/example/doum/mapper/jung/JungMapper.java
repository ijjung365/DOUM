package com.example.doum.mapper.jung;

import com.example.doum.domain.dto.jung.JungAnonymousListDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JungMapper {
    List<JungAnonymousListDTO> tblAnonymousSelectAll();
}
