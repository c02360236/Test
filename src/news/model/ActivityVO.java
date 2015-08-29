package news.model;

import java.io.Serializable;

public class ActivityVO implements Serializable {
	private int no;
	private String name;
	private String content;
	private java.sql.Timestamp startTime;
	private java.sql.Timestamp endTime;
	private String address;
	private java.sql.Blob picture;
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && (obj instanceof ActivityVO)) {
			ActivityVO temp = (ActivityVO) obj;
			if(this.no == temp.no) {
				return true;
			}			
		}
		return false;
	}
	@Override
	public String toString() {
		return "{"+no+":"+name+":"+content+":"+startTime+":"+endTime+":"+address+":"+picture+"}";
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public java.sql.Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(java.sql.Timestamp startTime) {
		this.startTime = startTime;
	}
	public java.sql.Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(java.sql.Timestamp endTime) {
		this.endTime = endTime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public java.sql.Blob getPicture() {
		return picture;
	}
	public void setPicture(java.sql.Blob picture) {
		this.picture = picture;
	}
}
