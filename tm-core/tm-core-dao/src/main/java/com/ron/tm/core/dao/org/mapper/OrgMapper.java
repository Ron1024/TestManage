package com.ron.tm.core.dao.org.mapper;

import com.ron.tm.core.dao.org.entities.Org;

import java.util.List;

public interface OrgMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Org record);

    int insertSelective(Org record);

    Org selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Org record);

    int updateByPrimaryKey(Org record);

    List<Org> getOrgList();

    List<Org> getOrgListByParentId(Integer parentId);

}