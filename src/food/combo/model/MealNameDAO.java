package food.combo.model;

import java.util.List;

public interface MealNameDAO {
	public abstract MealNameVO selectByPrimaryKey(int mealNo);

	public abstract List<MealNameVO> getAll();

	public abstract MealNameVO insert(MealNameVO vo);

	public abstract MealNameVO update(MealNameVO vo);

	public abstract boolean delete(int id);
}
