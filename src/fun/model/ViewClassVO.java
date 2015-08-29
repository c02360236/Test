package fun.model;

import java.io.Serializable;

public class ViewClassVO implements Serializable{
	private int viewClassNo;
	private String name;
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && (obj instanceof ViewClassVO)) {
			ViewClassVO temp = (ViewClassVO) obj;
			if(this.viewClassNo == temp.viewClassNo) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "{"+viewClassNo+":"+name+"}";
	}
	
	public int getViewClassNo() {
		return viewClassNo;
	}
	public void setViewClassNo(int viewClassNo) {
		this.viewClassNo = viewClassNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
