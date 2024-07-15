package com.example.doum.controller.jung;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jung")
@RequiredArgsConstructor
public class JungController {
    @GetMapping("/announcement")
    public String announcement(Model model) {
        return "/jung/announcement";
    }
    @GetMapping("/anonymous")
    public String anonymous(Model model) {
        return "/jung/anonymous";
    }

    @GetMapping("/applied-volunteer")
    public String appliedVolunteer(Model model) {
        return "/jung/applied-volunteer";
    }
    @GetMapping("/organization-search")
    public String organizationsearch(Model model) {
        return "/jung/organization-search";
    }
    @GetMapping("/registered-volunteer")
    public String registeredVolunteer(Model model) {
        return "/jung/registered-volunteer";
    }
    @GetMapping("/user-list-applied")
    public String userListApplied(Model model) {
        return "/jung/user-list-applied";
    }
    @GetMapping("/user-list-review")
    public String userListReview(Model model) {
        return "/jung/user-list-review";
    }
    @GetMapping("/volunteer-search")
    public String volunteerSearch(Model model) {
        return "/jung/volunteer-search";
    }

}
