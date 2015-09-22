/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.easy555.uc.dao.resource.entity;

import com.easy555.common.entity.BaseEntity;
import com.easy555.common.plugin.entity.Treeable;
import com.easy555.common.repository.support.annotation.EnableQueryCache;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Formula;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * <p>
 * User: Zhang Kaitao
 * <p>
 * Date: 13-2-4 上午9:38
 * <p>
 * Version: 1.0
 */
@Entity
@Table(name = "sys_resource")
@EnableQueryCache
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Resource extends BaseEntity<Long> {

	/**
	 * 标题
	 */
	private String name;

	/**
	 * 资源标识符 用于权限匹配的 如sys:resource
	 */
	private String identity;

	/**
	 * 点击后前往的地址 菜单才有
	 */
	private String url;

	/**
	 * 图标
	 */
	private String icon;

	/**
	 * 是否显示
	 */
	@Column(name = "visible")
	private Boolean visible = Boolean.FALSE;
	
	/**
	 * 权限值
	 */
	private Integer permission_val;

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Boolean getVisible() {
		return visible;
	}

	public void setVisible(Boolean show) {
		this.visible = show;
	}

	public Integer getPermission_val() {
		return permission_val;
	}

	public void setPermission_val(Integer permission_val) {
		this.permission_val = permission_val;
	}
	
	

}
