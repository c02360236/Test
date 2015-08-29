package food.recipes.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class FoodListVO implements Serializable{
	private int cookNo;
	private int useFoodNo;
	public FoodListVO(){
		
	}
	@Override
	public String toString(){
		return "("+cookNo+":"+useFoodNo+")";
	}
	@Override
	public boolean equals(Object obj){
		if(obj == this){
			return true;
		}
		if(!(obj instanceof FoodListVO)) {
			return false;
		}
		FoodListVO foodList = (FoodListVO) obj;
		return new EqualsBuilder()
				.append(this.cookNo, foodList.getCookNo())
				.append(this.useFoodNo, foodList.getUseFoodNo())
				.isEquals();
	}
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(this.cookNo)
                .append(this.useFoodNo)
                .toHashCode();
    }
	
	public int getCookNo() {
		return cookNo;
	}
	public void setCookNo(int cookNo) {
		this.cookNo = cookNo;
	}
	public int getUseFoodNo() {
		return useFoodNo;
	}
	public void setUseFoodNo(int useFoodNo) {
		this.useFoodNo = useFoodNo;
	}
}
