package com.ptn.creation.prototype.shallowCloning;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**   
 * @Description: 浅克隆
 * @author: 	 liao
 * @date:   	 2019年4月1日 下午8:29:16   
 */  
public class Person implements Cloneable {

	//非引用成员变量
	private String name;
	//引用成员变量
	private Date birthday;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return "Person [name=" + name + ", birthday=" + format.format(birthday) + "]";
	}

}
