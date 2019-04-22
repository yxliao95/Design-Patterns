package com.ptn.creation._05prototype.deepCloning;

import java.util.Date;

public class DeepCloningTest {

	public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
		Date date = new Date(1224121999873L);
		
		Person priorPerson = new Person();
		priorPerson.setName("Somebody");
		priorPerson.setBirthday(date);
		System.out.println(priorPerson);
		
		//该克隆方法为深克隆
		Person clonePerson = (Person) priorPerson.clone();
		System.out.println(clonePerson);
		
		//原对象和克隆对象的引用成员变量的内存地址不同
		date.setTime(2884121999873L);
		System.out.println(priorPerson);
		System.out.println(clonePerson);
	}

}
