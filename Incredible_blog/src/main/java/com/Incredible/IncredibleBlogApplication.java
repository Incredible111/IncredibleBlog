package com.Incredible;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author Incredible
 * @Date 2023/8/17 11:27
 * @PackageName:com.Incredible
 * @ClassName: IncredibleBlogApplication
 * @Description: TODO
 * @Version 1.0
 */


@SpringBootApplication
@MapperScan("com.Incredible.mapper")
public class IncredibleBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(IncredibleBlogApplication.class,args);
    }
}

