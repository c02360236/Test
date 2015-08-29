package food.combo.model;

import java.io.Serializable;

public class MealNameVO implements Serializable{
	private int mealNo;
	private String name;
	
	@Override
	public String toString() {
		return "{"+mealNo+":"+name+"}";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && (obj instanceof MealNameVO)) {
			MealNameVO temp = (MealNameVO) obj;
			if(this.mealNo == temp.mealNo) {
				return true;
			}
		}
		return false;
	}

	public int getMealNo() {
		return mealNo;
	}
	public void setMealNo(int mealNo) {
		this.mealNo = mealNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
