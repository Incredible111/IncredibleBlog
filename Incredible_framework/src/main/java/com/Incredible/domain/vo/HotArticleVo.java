package com.Incredible.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Incredible
 * @Date 2023/11/8 21:04
 * @PackageName:com.Incredible.domain.vo
 * @ClassName: HotArticleVo
 * @Description: 前端只返回规定的字段
 * @Version 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HotArticleVo {
    private Long id;

    //标题
    private String title;

    //访问量
    private Long viewCount;
}
