package calories.model;

import java.util.List;

public interface FoodCalDAO {
	public abstract FoodCalVO selectByPrimaryKey(int foodNo);

	public abstract List<FoodCalVO> getAll();

	public abstract FoodCalVO insert(FoodCalVO vo);

	public abstract FoodCalVO update(FoodCalVO vo);

	public abstract boolean delete(int id);
}
