package com.example.doum.mapper.lee;


import com.example.doum.domain.dto.lee.MyPageStoryDTO;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper {

   User selectUserById(long id);

   List<MyPageStoryDTO> selectVolunteerActivitiesId(long userId);

}
