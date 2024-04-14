package serial;

import java.io.Serializable;

public class Person  implements Serializable {
	private static final long serialVersionUID = -513691967707913440L;

	private String myName;
	private int age;
	
	public Person(String myName, int age) {
		this.setMyName(myName);
		this.setAge(age);
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
