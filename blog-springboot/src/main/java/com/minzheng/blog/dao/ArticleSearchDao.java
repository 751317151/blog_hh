package com.minzheng.blog.dao;

import com.minzheng.blog.dto.ArticleSearchDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author huah
 * @since 2022年02月17日
 */
@Repository
public interface ArticleSearchDao extends ElasticsearchRepository<ArticleSearchDTO, Long> {
}
