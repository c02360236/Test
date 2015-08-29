package food.recipes.model;

import java.io.Serializable;

public class CookVO implements Serializable{
	private int cookno;
	private String wayno;
	private java.sql.Blob picture;
	public CookVO(){
		
	}	
	
	public boolean equals(Object obj){
		if(obj!=null && (obj instanceof CookVO)){
			CookVO temp = (CookVO) obj;
			if(this.cookno == temp.cookno){
				return true;
			}
		}
		return false;
	}
	public String toString(){
		return "("+cookno+":"+ wayno+")";
	}
	
	public int getCookno() {
		return cookno;
	}
	public void setCookno(int cookno) {
		this.cookno = cookno;
	}
	public String getWayNo() {
		return wayno;
	}
	public void setWayNo(String wayNo) {
		this.wayno = wayNo;
	}

	public java.sql.Blob getPicture() {
		return picture;
	}

	public void setPicture(java.sql.Blob picture) {
		this.picture = picture;
	}
	
}
