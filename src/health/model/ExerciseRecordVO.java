package health.model;

import java.io.Serializable;

public class ExerciseRecordVO implements Serializable{
	private long no;
	private int memberNo;
	private int exerciseNo;
	private java.util.Date date;
	private int count;
	
	@Override
	public String toString() {
		return "{"+no+":"+memberNo+":"+exerciseNo+":"+date+":"+count+"}";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && (obj instanceof ExerciseRecordVO)) {
			ExerciseRecordVO temp = (ExerciseRecordVO) obj;
			if(this.no == temp.no) {
				return true;
			}
		}
		return false;
	}
	
	public long getNo() {
		return no;
	}
	public void setNo(long no) {
		this.no = no;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public int getExerciseNo() {
		return exerciseNo;
	}
	public void setExerciseNo(int exerciseNo) {
		this.exerciseNo = exerciseNo;
	}
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
