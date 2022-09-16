package com.aftercoding.blog.dao.mapper;

import com.aftercoding.blog.dao.pojo.Tag;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-09-15 14:42
 */
public interface TagMapper extends BaseMapper<Tag> {
    /*
    * 根据文章id查询标签列表
    * */
    List<Tag> findTagsByArticleId(Long tagIds);
}
