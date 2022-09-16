package com.aftercoding.blog.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: some desc
 * @author: congjun
 * @email: 66@7788.com
 * @date: 2022-09-15 13:58
 */
@Configuration
@MapperScan("com.aftercoding.blog.dao.mapper")
public class MybatisPlusConfig {
    //分页插件
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        //新建MybatisPlus拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();

//        //新建分页拦截器paginationInnerInterceptor
//        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
//        //设置分页拦截器的一些属性
//        paginationInnerInterceptor.setOverflow(true);
//        paginationInnerInterceptor.setMaxLimit(100L);

        //把分页拦截器添加到MybatisPlus拦截器中
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        //添加组件，大功告成！
        return interceptor;
    }
}
