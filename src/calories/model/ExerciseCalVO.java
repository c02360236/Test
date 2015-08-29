package calories.model;

import java.io.Serializable;

public class ExerciseCalVO implements Serializable{
	private int exerciseNo;
	private String name;
	private float calHour;
		
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && (obj instanceof ExerciseCalVO)) {
			ExerciseCalVO temp = (ExerciseCalVO) obj;
			if(this.exerciseNo == temp.exerciseNo) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "{"+exerciseNo+":"+name+":"+calHour+"}";
	}
	
	public int getExerciseNo() {
		return exerciseNo;
	}
	public void setExerciseNo(int exerciseNo) {
		this.exerciseNo = exerciseNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCalHour() {
		return calHour;
	}
	public void setCalHour(float calHour) {
		this.calHour = calHour;
	}
}
