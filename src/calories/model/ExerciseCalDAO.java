package calories.model;

import java.util.List;

public interface ExerciseCalDAO {
	public abstract ExerciseCalVO selectByPrimaryKey(int exerciseNo);

	public abstract List<ExerciseCalVO> getAll();

	public abstract ExerciseCalVO insert(ExerciseCalVO vo);

	public abstract ExerciseCalVO update(ExerciseCalVO vo);

	public abstract boolean delete(int id);
}
