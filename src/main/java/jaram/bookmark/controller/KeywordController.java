package jaram.bookmark.controller;

import jaram.bookmark.service.KeywordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/keyword")
@RequiredArgsConstructor
public class KeywordController {

    private final KeywordService keywordService;

    //todo: 뷰 연결
    @GetMapping
    public String getMainPage(Model model) {
        model.addAttribute("keywords", keywordService.getKeyword());
        return "index";
    }
}
