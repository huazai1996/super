package org.springmvc.join;

import java.util.Arrays;
import java.util.Date;

public class User {
	private Integer id;
	
	private String name;
	
	private String[] hobbies;
	
	private  Date birthday;
	
	private boolean married;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", hobbies=" + Arrays.toString(hobbies) + ", birthday=" + birthday
				+ ", married=" + married + "]";
	}
	
}
