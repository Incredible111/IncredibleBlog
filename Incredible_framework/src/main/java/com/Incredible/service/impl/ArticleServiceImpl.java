package com.Incredible.service.impl;

import com.Incredible.domain.ResponseResult;
import com.Incredible.domain.entity.Article;
import com.Incredible.domain.vo.HotArticleVo;
import com.Incredible.mapper.ArticleMapper;
import com.Incredible.service.ArticleService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    @Override
    public ResponseResult hotArticleList() {
        //查询热门文章，封装成ResponseResult返回
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        //必须是正式文章
        queryWrapper.eq(Article::getStatus, 0);
        //按浏览量进行排序
        queryWrapper.orderByDesc(Article::getViewCount);
        //最多只能查询十条
        Page<Article> page = new Page(1,10);
        page(page, queryWrapper);

        List<Article> articles = page.getRecords();

        //bean拷贝
        List<HotArticleVo> articleVos = new ArrayList<>();
        for(Article article : articles) {
            HotArticleVo vo = new HotArticleVo();
            BeanUtils.copyProperties(article, vo );
            articleVos.add(vo);
        }

        return ResponseResult.okResult(articleVos);
    }
}
