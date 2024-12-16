package com.jan.and.swj.enumlearn;

public class Season2 {
	// 本类内部创建对象
	public static final Season2 SPRING = new Season2("Spring", "春天");
	public static final Season2 SUMMER = new Season2("Summer", "夏天");
	public static final Season2 AUTUMN = new Season2("Autumn", "秋天");
	public static final Season2 WINTER = new Season2("Winter", "冬天");
			
	
	private final String name;
	private final String description;
	
	// attention! -- 构造函数一定要有
	private Season2(String name, String description) {
		super();
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
	
	public static void main(String[] args) {
		Season spring = Season.SPRING;
		System.out.println(spring);
	}
}
