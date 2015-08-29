package calories.model;

import java.util.List;

public interface MenuDAO {
	public abstract MenuVO selectByPrimaryKey(int menuNo);

	public abstract List<MenuVO> getAll();

	public abstract MenuVO insert(MenuVO vo);

	public abstract MenuVO update(MenuVO vo);

	public abstract boolean delete(int id);
}
