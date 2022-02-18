package com.minzheng.blog.service;

import com.minzheng.blog.dto.ArticleHomeDTO;

import java.util.List;

/**
 * @author huah
 * @since 2022年02月18日
 */
public interface SearchService {

  int initEsData(List<ArticleHomeDTO> list);
}
