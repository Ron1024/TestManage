package com.ron.tm.core.service.org;

import com.ron.tm.core.dao.org.entities.Org;

import java.util.List;

public interface OrgService {
    /**
     * 取得所有的部门信息
     *
     * @return 所有部门信息
     */
    List<Org> getOrgByList();

    /**
     * 根据父类Id取得部门信息
     *
     * @param parentId 父Id
     * @return 该父类部门下所有子部门信息
     */
    List<Org> getOrgListByParentId(int parentId);

    /**
     * 通过部门ID取得该部门的详细信息
     *
     * @param orgId 部门ID
     * @return 部门详细信息
     */
    Org getOrgByOrgId(int orgId);

    /**
     * 新增部门
     *
     * @param org 新增部门信息
     * @return 新增部门ID
     */
    int insertOrg(Org org);


    /**
     * 更新部门信息
     *
     * @param org 需要更新的部门信息
     * @return 更新部门的部门ID
     */
    int updateOrg(Org org);

    /**
     * 删除部门信息
     * @param org 需要删除的部门信息
     * @return 删除的部门id
     */
    int deleteOrg(Org org);
}
