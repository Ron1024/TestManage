package com.ron.tm.core.service.permission;

import com.ron.tm.core.dao.permission.entities.Permission;

import java.util.List;

public interface PermissionService {

    /**
     * 取得所有的权限信息
     * @return 所有权限信息
     */
    List<Permission> getPermissionList();

    /**
     * 根据权限ID得到该权限的详细信息
     * @param permissionId 权限ID
     * @return  权限的详细信息
     */
    Permission getPermissionByPermissionId(int permissionId);

    /**
     * 根据父id信息得到该父id下所有权限信息
     * @param parentId 父类ID
     * @return 权限列表
     */
    List<Permission> getPermissionListByParentId(int parentId);

    /**
     * 增加权限信息
     * @param permission 需要增加的权限信息
     * @return 权限ID
     */
    int InsertPermission(Permission permission);

    /**
     * 根据权限信息删除权限
     * @param permission 需要删除的权限信息
     * @return 删除权限的权限ID
     */
    int deletePermissionByPermissionId(Permission permission);

    /**
     * 更新权限信息
     * @param permission 需要更新的权限信息
     * @return 更新权限的权限ID
     */
    int updatePermission(Permission permission);
}
