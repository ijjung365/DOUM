package com.example.doum.mapper.lee;


import com.example.doum.domain.dto.lee.MyPageDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MyPageMapper {







    // 게시물 작성
    void saveStory(MyPageDTO myPage);




}
