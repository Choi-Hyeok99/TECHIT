package com.ll.basic1.boundedContext.article.controller;

import com.ll.basic1.base.rsData.RsData;
import com.ll.basic1.boundedContext.article.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/article")
public class ArticleController {
    @GetMapping("/write")
    @ResponseBody
    public RsData write(String title, String body){
        Article article = Article
                .builder()
                .title(title)
                .body(body)
                .build();

        //// 위 코드와 같은 의미
        //Article article2 = new Article();
        //article2.setCreateDate(LocalDateTime.now())
        //article2.setModifyDate(LocalDateTime.now())
        //article2.setBody(body);
        //article2.setTitlte(title);
        //article2.setBody(body);

        return RsData.of("S-1","1번 글이 생성되었습니다.",article);
    }
}
