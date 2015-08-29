package food.combo.model;

import java.io.Serializable;

public class DayMealVO implements Serializable{
	private int no;
	private String name;
	private int breakfast;
	private int lunch;
	private int dinner;
	
	@Override
	public String toString() {
		return "{"+no+":"+name+":"+breakfast+":"+lunch+":"+dinner+"}";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && (obj instanceof DayMealVO)) {
			DayMealVO temp = (DayMealVO) obj;
			if(this.no == temp.no) {
				return true;
			}
		}
		return false;
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
	public int getBreakfast() {
		return breakfast;
	}
	public void setBreakfast(int breakfast) {
		this.breakfast = breakfast;
	}
	public int getLunch() {
		return lunch;
	}
	public void setLunch(int lunch) {
		this.lunch = lunch;
	}
	public int getDinner() {
		return dinner;
	}
	public void setDinner(int dinner) {
		this.dinner = dinner;
	}
}
