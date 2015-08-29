package ranking.model;

import java.io.Serializable;

public class ReflectVO implements Serializable{

	private int no;
	private int reflectedNo;
	private int authorNo;
	private java.util.Date reflectedDate;
	private java.util.Date authorDate;
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && (obj instanceof ReflectVO)) {
			ReflectVO temp = (ReflectVO) obj;
			if(this.no == temp.no) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "{"+no+":"+reflectedNo+":"+authorNo+":"+reflectedDate+":"+authorDate+"}";
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getReflectedNo() {
		return reflectedNo;
	}
	public void setReflectedNo(int reflectedNo) {
		this.reflectedNo = reflectedNo;
	}
	public int getAuthorNo() {
		return authorNo;
	}
	public void setAuthorNo(int authorNo) {
		this.authorNo = authorNo;
	}
	public java.util.Date getReflectedDate() {
		return reflectedDate;
	}
	public void setReflectedDate(java.util.Date reflectedDate) {
		this.reflectedDate = reflectedDate;
	}
	public java.util.Date getAuthorDate() {
		return authorDate;
	}
	public void setAuthorDate(java.util.Date authorDate) {
		this.authorDate = authorDate;
	}
}
