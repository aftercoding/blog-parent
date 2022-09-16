package com.aftercoding.blog.service;

import com.aftercoding.blog.controller.vo.TagVo;

import java.util.List;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-09-15 16:17
 */
public interface TagService {
    List<TagVo> findTagsByArticleId(Long articleId);
}
