package com.example.doum.service.lee;


import com.example.doum.domain.dto.lee.MyPageStoryDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface MyPageService {


    //게시물(내 스토리들) 목록
    List<MyPageStoryDTO> getStoryActivity();

    //게시물(story) 작성
    void saveStory(MyPageStoryDTO myPageStoryDTO, List<MultipartFile> files);


    //게시글 상세보기
    MyPageStoryDTO getStoryById(Long storyId, CustomOAuth2User customOAuth2User);







}
