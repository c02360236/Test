package school.model;

import java.util.List;

public interface ExamDAO {
	public abstract ExamVO selectByPrimaryKey(int no);

	public abstract List<ExamVO> getAll();

	public abstract ExamVO insert(ExamVO vo);

	public abstract ExamVO update(ExamVO vo);

	public abstract boolean delete(int id);
}
