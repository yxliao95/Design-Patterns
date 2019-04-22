package com.ptn.creation._05prototype.shallowCloning;

import java.util.Date;

public class ShallowCloningTest {

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		Date date = new Date(1884121999873L);
		
		Person priorPerson = new Person();
		priorPerson.setName("Somebody");
		priorPerson.setBirthday(date);
		System.out.println(priorPerson);
		
		//该克隆方法为浅克隆
		Person clonePerson = (Person) priorPerson.clone();
		System.out.println(clonePerson);
		
		//原对象和克隆对象的引用成员变量的内存地址相同
		date.setTime(2884121999873L);
		System.out.println(priorPerson);
		System.out.println(clonePerson);
	}

}
