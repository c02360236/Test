package health.model;

import java.io.Serializable;

public class EatRecordVO implements Serializable{
	private long no;
	private int memberNo;
	private java.util.Date date;
	private String time;
	private int foodNo;
	private int count;
	
	@Override
	public String toString() {
		return "{"+no+":"+memberNo+":"+date+":"+time+":"+foodNo+":"+count+"}";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && (obj instanceof EatRecordVO)) {
			EatRecordVO temp = (EatRecordVO) obj;
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
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getFoodNo() {
		return foodNo;
	}
	public void setFoodNo(int foodNo) {
		this.foodNo = foodNo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
