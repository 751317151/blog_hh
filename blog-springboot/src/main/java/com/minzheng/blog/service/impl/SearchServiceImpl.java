package com.minzheng.blog.service.impl;

import com.minzheng.blog.dao.ArticleSearchDao;
import com.minzheng.blog.dto.ArticleBackDTO;
import com.minzheng.blog.dto.ArticleHomeDTO;
import com.minzheng.blog.dto.ArticleSearchDTO;
import com.minzheng.blog.service.SearchService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huah
 * @since 2022年02月18日
 */
@Service
public class SearchServiceImpl implements SearchService {

  @Autowired
  private ArticleSearchDao articleSearchDao;
  @Autowired
  private ModelMapper modelMapper;

  @Override
  public int initEsData(List<ArticleHomeDTO> list) {
    if (list == null || list.size() ==0){
      return 0;
    }
    //存入es
    List<ArticleSearchDTO> articleSearchs = new ArrayList<>();
    for(ArticleHomeDTO homeDTO : list){
      ArticleSearchDTO search = modelMapper.map(homeDTO,ArticleSearchDTO.class);
      articleSearchs.add(search);
    }
    try {
      articleSearchDao.saveAll(articleSearchs);
    }catch (Exception e){
      e.printStackTrace();
    }
    return list.size();
  }
}
