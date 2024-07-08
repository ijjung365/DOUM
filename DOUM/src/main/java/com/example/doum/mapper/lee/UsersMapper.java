package com.example.doum.mapper.lee;


import com.example.doum.domain.dto.lee.UsersDTO;
import com.example.doum.domain.dto.lee.VolunteerActivity;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper {

   User selectUserById(long id);

   List<VolunteerActivity> selectVolunteerActivitiesId(long userId);

}
