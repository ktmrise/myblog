package com.ktm;

import com.ktm.service.IArticleService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class MyBlogApplicationTests {


    @Resource
    private IArticleService articleService;

    @Test
    void contextLoads() {
        System.out.println(articleService.selectArticles());
    }

}
