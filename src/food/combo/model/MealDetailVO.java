package food.combo.model;

import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class MealDetailVO implements Serializable{
	private int mealNo;
	private int foodNo;

	@Override
	public boolean equals(Object obj){
		if(obj == this){
			return true;
		}
		if(!(obj instanceof MealDetailVO)) {
			return false;
		}
		MealDetailVO mealdetail = (MealDetailVO) obj;
		return new EqualsBuilder()
				.append(this.mealNo, mealdetail.getMealNo())
				.append(this.foodNo, mealdetail.getFoodNo())
				.isEquals();
	}
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(this.mealNo)
                .append(this.foodNo)
                .toHashCode();
    }	
	@Override
	public String toString() {
		return "{"+mealNo+":"+foodNo+"}";
	}
	
	public int getMealNo() {
		return mealNo;
	}
	public void setMealNo(int mealNo) {
		this.mealNo = mealNo;
	}
	public int getFoodNo() {
		return foodNo;
	}
	public void setFoodNo(int foodNo) {
		this.foodNo = foodNo;
	}
}
