package school.model;

import java.io.Serializable;

public class ExamVO implements Serializable{
	private int no;
	private String content;
	private String correct;
	private String optA;
	private String optB;
	private String optC;
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null && (obj instanceof ExamVO)) {
			ExamVO temp = (ExamVO) obj;
			if(this.content == temp.content) {
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return "{"+content+":"+correct+":"+optA+":"+optB+":"+optC+"}";
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCorrect() {
		return correct;
	}
	public void setCorrect(String correct) {
		this.correct = correct;
	}
	public String getOptA() {
		return optA;
	}
	public void setOptA(String optA) {
		this.optA = optA;
	}
	public String getOptB() {
		return optB;
	}
	public void setOptB(String optB) {
		this.optB = optB;
	}
	public String getOptC() {
		return optC;
	}
	public void setOptC(String optC) {
		this.optC = optC;
	}
}
