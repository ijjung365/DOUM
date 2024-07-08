package com.example.doum.controller.lee;


import ch.qos.logback.core.model.Model;
import com.example.doum.domain.dto.lee.PostDTO;
import com.example.doum.mapper.lee.UsersMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
    private final FileService fileService;
    private final UsersMapper usersMapper;


    //마이페이지 봉사작성글 폼으로 이동
    @GetMapping("/write")
    public String writeForm(Model model) {
        model.addAttribute("post", new PostDTO());
        return "post/write";
    }


    //마이페이지 봉사작성글 처리
    @PostMapping("/write")
    public String write(PostDTO post, Model model) {


    }


}
