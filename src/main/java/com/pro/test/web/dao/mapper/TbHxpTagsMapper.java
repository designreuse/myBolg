package com.pro.test.web.dao.mapper;

import com.pro.test.core.common.mybatis.dao.GenericMapper;
import com.pro.test.web.entity.TbHxpTags;

public interface TbHxpTagsMapper extends GenericMapper {
    int deleteByPrimaryKey(String id);

    int insert(TbHxpTags record);

    int insertSelective(TbHxpTags record);

    TbHxpTags selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TbHxpTags record);

    int updateByPrimaryKey(TbHxpTags record);
}