package calories.model;

import java.io.Serializable;

public class MenuVO implements Serializable{
	private int menuNo;
	private String name;
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && (obj instanceof MenuVO)) {
			MenuVO temp = (MenuVO) obj;
			if(this.menuNo == temp.menuNo) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "{"+menuNo+":"+name+"}" ;
	}
	
	public int getMenuNo() {
		return menuNo;
	}
	public void setMenuNo(int menuNo) {
		this.menuNo = menuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
