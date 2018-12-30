package bean;

import java.io.Serializable;

// user 实现接口
public class User implements Serializable{

	private static final long serialVersionUID = 7380380061601988451L;
	
	private Integer id;
	private String uName;
	private String uPassword;
	private String age;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPassword() {
		return uPassword;
	}
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public User(Integer id, String uName, String uPassword, String age) {
		super();
		this.id = id;
		this.uName = uName;
		this.uPassword = uPassword;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uName=" + uName + ", uPassword=" + uPassword + ", age=" + age + "]";
	}
	public User() {
		super();
	}
	
	
}
