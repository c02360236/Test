package fun.model;

import java.util.List;

public interface ViewClassDAO {
	public abstract ViewClassVO selectByPrimaryKey(int viewClassNo);

	public abstract List<ViewClassVO> getAll();

	public abstract ViewClassVO insert(ViewClassVO vo);

	public abstract ViewClassVO update(ViewClassVO vo);

	public abstract boolean delete(int id);
}
