package food.recipes.model;

import java.util.List;

public interface CookDAO {
	public abstract CookVO selectByPrimaryKey(int cookno);

	public abstract List<CookVO> getAll();

	public abstract CookVO insert(CookVO vo);

	public abstract CookVO update(CookVO vo);

	public abstract boolean delete(int id);
}
