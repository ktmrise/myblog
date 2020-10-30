package com.ktm.service.impl;

import com.ktm.entity.Article;
import com.ktm.mapper.ArticleMapper;
import com.ktm.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ktm
 * @since 2020-10-30
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

    @Override
    public List<Article> selectArticles() {
        return list();
    }
}
