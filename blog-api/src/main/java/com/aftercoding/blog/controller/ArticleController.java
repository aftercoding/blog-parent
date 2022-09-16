package com.aftercoding.blog.controller;

import com.aftercoding.blog.controller.vo.Result;
import com.aftercoding.blog.controller.vo.params.PageParams;
import com.aftercoding.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-09-15 14:43
 */

// json 数据进行交互
@RestController
@RequestMapping("argicles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /*首页文章列表
    *
    * */
    @PostMapping
    public Result listArticle(@RequestBody PageParams pageParams){
        return articleService.listArticle(pageParams);
    }
}
