package health.model;

import java.util.List;

public interface ExerciseRecordDAO {
	public abstract ExerciseRecordVO selectByPrimaryKey(long no);

	public abstract List<ExerciseRecordVO> getAll();

	public abstract ExerciseRecordVO insert(ExerciseRecordVO vo);

	public abstract ExerciseRecordVO update(ExerciseRecordVO vo);

	public abstract boolean delete(int id);
}
