package com.ktm.controller;


import com.ktm.entity.Article;
import com.ktm.service.IArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ktm
 * @since 2020-10-30
 */
@Controller
public class ArticleController {

    @Resource
    private IArticleService articleService;


    @GetMapping("/articles")
    public String toArticles(HttpServletRequest request) {
        List<Article> articles = articleService.selectArticles();
        request.setAttribute("articles", articles);
        return "article";
    }


    @GetMapping("/read")
    public String readArticle(int id,HttpServletRequest request) {
        Article article = articleService.getById(id);
        request.setAttribute("article", article);
        return "read";

    }
}
