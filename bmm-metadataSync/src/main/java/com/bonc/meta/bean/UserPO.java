package com.bonc.meta.bean;

/**
 * Created by malz on 2019/5/30.
 */
public class UserPO {
	private Long uid;
	private String name;
	private Integer age;

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserPO{" +
				"uid=" + uid +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
