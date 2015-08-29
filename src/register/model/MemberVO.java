package register.model;

import java.io.Serializable;

public class MemberVO implements Serializable{
	private int memberNo;
	private String id;
	private String password;
	private String firstName;
	private String lastName;
	private String nickname;
	private String email;
	private java.util.Date birthday;
	private String gender;
	private int purview;
	
	@Override
	public String toString() {
		return "{"+memberNo+":"+id+":"+password+":"+firstName+":"+lastName+
				":"+nickname+":"+email+":"+birthday+":"+gender+":"+purview+"}";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && (obj instanceof MemberVO)) {
			MemberVO temp = (MemberVO) obj;
			if(this.memberNo == temp.memberNo) {
				return true;
			}
		}
		return false;
	}
	
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public java.util.Date getBirthday() {
		return birthday;
	}
	public void setBirthday(java.util.Date birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getPurview() {
		return purview;
	}
	public void setPurview(int purview) {
		this.purview = purview;
	}
}
