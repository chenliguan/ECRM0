package com.ecrm.core.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.struts2.json.annotations.JSON;
//属性可以被继承，但当前类作为一个基础服务类，BaseDomainEntity不会被映射数据库
//公共系统属性
@MappedSuperclass
public class BaseDomainEntity
{
	protected Long id;
	
	protected String creater;
	protected Date createrTime;
	
	protected String lastUpdater;
	protected Date lastUpdateTime;
	
	protected String remake;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public String getCreater() {
		return creater;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@JSON(format="yyyy/MM/dd HH:mm:ss")
	public Date getCreaterTime() {
		return createrTime;
	}

	public String getLastUpdater() {
		return lastUpdater;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@JSON(format="yyyy/MM/dd HH:mm:ss")
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	@Lob
	public String getRemake() {
		return remake;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public void setCreaterTime(Date createrTime) {
		this.createrTime = createrTime;
	}

	public void setLastUpdater(String lastUpdater) {
		this.lastUpdater = lastUpdater;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public void setRemake(String remake) {
		this.remake = remake;
	}
	
	
}
