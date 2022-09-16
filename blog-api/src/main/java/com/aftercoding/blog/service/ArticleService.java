package com.aftercoding.blog.service;

import com.aftercoding.blog.controller.vo.Result;
import com.aftercoding.blog.controller.vo.params.PageParams;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-09-15 15:09
 */
public interface ArticleService {
    /*
    * 分页查询文章列表
    * */
    Result listArticle(PageParams pageParams);
}
