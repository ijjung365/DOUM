package com.example.doum.controller.lee;


import com.example.doum.mapper.lee.UsersMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    private final FileService fileService;
    private final UsersMapper usersMapper;


    @GetMapping("/list")


}
