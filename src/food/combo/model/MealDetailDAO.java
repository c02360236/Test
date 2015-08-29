package food.combo.model;

import java.util.List;

public interface MealDetailDAO {
	public abstract MealDetailVO selectByPrimaryKey(int mealNo, int foodNo);

	public abstract List<MealDetailVO> getAll();

	public abstract MealDetailVO insert(MealDetailVO vo);

	public abstract MealDetailVO update(MealDetailVO vo);

	public abstract boolean delete(int id);
}
