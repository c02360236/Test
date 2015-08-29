package fun.model;

import java.io.Serializable;

public class HealthViewVO implements Serializable{
	private int no;
	private String name;
	private int viewClassNo;
	private float lat;
	private float lng;
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && (obj instanceof HealthViewVO)) {
			HealthViewVO temp = (HealthViewVO) obj;
			if(this.no == temp.no) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "{"+no+":"+name+":"+viewClassNo+":"+lat+":"+lng+"}";
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
	public int getViewClassNo() {
		return viewClassNo;
	}
	public void setViewClassNo(int viewClassNo) {
		this.viewClassNo = viewClassNo;
	}
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public float getLng() {
		return lng;
	}
	public void setLng(float lng) {
		this.lng = lng;
	}
}
