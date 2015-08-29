package ranking.model;

import java.util.List;

public interface ReflectDAO {
	public abstract ReflectVO selectByPrimaryKey(int no);

	public abstract List<ReflectVO> getAll();

	public abstract ReflectVO insert(ReflectVO vo);

	public abstract ReflectVO update(ReflectVO vo);

	public abstract boolean delete(int id);
}
