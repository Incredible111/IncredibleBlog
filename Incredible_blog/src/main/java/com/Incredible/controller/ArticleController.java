package com.Incredible.controller;

import com.Incredible.domain.ResponseResult;
import com.Incredible.domain.entity.Article;
import com.Incredible.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Incredible
 * @Date 2023/8/27 15:10
 * @PackageName:com.Incredible.controller
 * @ClassName: ArticleController
 * @Description: TODO
 * @Version 1.0
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/list")
    public List<Article> test(){
        return articleService.list();
    }

//    @GetMapping("hotArticleList")
//    public ResponseResult hotArticleList(){
//        //查询热门文章，封装成ResponseResult返回
//
//    }


}
