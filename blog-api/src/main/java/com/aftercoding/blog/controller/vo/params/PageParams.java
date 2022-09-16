package com.aftercoding.blog.controller.vo.params;

import lombok.Data;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-09-15 14:55
 */
@Data
public class PageParams {
    private  int page = 1;
    private int pageSize = 10;
}
