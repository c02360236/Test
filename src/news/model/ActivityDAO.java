package news.model;

import java.util.List;

public interface ActivityDAO {
	public abstract ActivityVO selectByPrimaryKey(int no);

	public abstract List<ActivityVO> getAll();

	public abstract ActivityVO insert(ActivityVO vo);

	public abstract ActivityVO update(ActivityVO vo);

	public abstract boolean delete(int id);
}
