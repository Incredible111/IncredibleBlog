package com.Incredible.service.impl;

import com.Incredible.domain.entity.Article;
import com.Incredible.mapper.ArticleMapper;
import com.Incredible.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @Author Incredible
 * @Date 2023/8/27 15:05
 * @PackageName:com.Incredible.domain.service.impl
 * @ClassName: ArticleServiceImpl
 * @Description: TODO
 * @Version 1.0
 */

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {
}
