package com.jan.and.swj.enumlearn;

import com.jan.and.swj.interfacelearn.Display;

public enum Season implements Display{
	// 定义枚举常量
	SPRING("Spinrg","春天") {
		public void show() {
			System.out.println("春天，万物复苏，鸟语花香。");
		}
	},
	SUMMER("Summer","夏天"),
	AUTUMN("Autumn","秋天"),
	WINTER;// 无参构造

	private String name;
	private String description;
	
	Season() {
		// 无参构造器,name+description都是null
	}
	
	// attention! -- 构造函数一定要有
	Season(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString () {
		return "Season{name = '" + name + "',description = '" + description + "'}";
	}
	
	// 实现接口方法
	public void show () {
		System.out.println(name + ":" + description);
	}	
}
