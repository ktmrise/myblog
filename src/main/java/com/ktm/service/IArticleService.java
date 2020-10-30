package com.ktm.service;

import com.ktm.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ktm
 * @since 2020-10-30
 */
public interface IArticleService extends IService<Article> {

    List<Article> selectArticles();
}
