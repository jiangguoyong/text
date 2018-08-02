package com.jt.common.po;

import java.io.Serializable;
import java.util.Date;
/*
 * BasePojo:大部分表格都有created和updated字段,只要我们的pojo继承了
   BasePojo,就无需实现序列化,无序编写两个字段属性,简化了业务系统中pojo的编写
 * */
//pojo基类，完成2个任务，2个日期，实现序列化
public class BasePojo implements Serializable{
	private Date created;
	private Date updated;
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	
}
