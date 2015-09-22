/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.easy555.uc.dao.auth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.easy555.common.entity.BaseEntity;
import com.easy555.common.repository.support.annotation.EnableQueryCache;

/**
 * 用户权限数据
 */

@Entity
@Table(name = "sys_auth")
@EnableQueryCache
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Auth extends BaseEntity<Long> {

	/**
	 * 组织机构
	 */
	@Column(name = "organization_id")
	private Long organizationId = 0L;

	/**
	 * 用户
	 */
	@Column(name = "user_id")
	private Long userId = 0L;
	
	/**
     * 资源id
     */
    @Column(name = "resource_id")
    private Long resourceId;
	

	/**
	 * 用户拥有角色权限只之和
	 */
    @Column(name = "sum_role_perm_val")
	private Integer sumRolePermVal = 0;

	/**
	 * 用户增加的特别权限
	 */
    @Column(name = "user_add_perm_val")
	private Integer userAddPermVal = 0;

	/**
	 * 用户减少的特别权限
	 */
    @Column(name = "user_sub_perm_val")
	private Integer userSubPermVal = 0;

	public Long getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(Long organizationId) {
		this.organizationId = organizationId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getResourceId() {
		return resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	public Integer getSumRolePermVal() {
		return sumRolePermVal;
	}

	public void setSumRolePermVal(Integer sumRolePermVal) {
		this.sumRolePermVal = sumRolePermVal;
	}

	public Integer getUserAddPermVal() {
		return userAddPermVal;
	}

	public void setUserAddPermVal(Integer userAddPermVal) {
		this.userAddPermVal = userAddPermVal;
	}

	public Integer getUserSubPermVal() {
		return userSubPermVal;
	}

	public void setUserSubPermVal(Integer userSubPermVal) {
		this.userSubPermVal = userSubPermVal;
	}
	
}
