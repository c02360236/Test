package food.recipes.model;

import java.util.List;

public interface FoodListDAO {
	public abstract FoodListVO selectByPrimaryKey(int cookNo, int useFoodNo);

	public abstract List<FoodListVO> getAll();

	public abstract FoodListVO insert(FoodListVO vo);

	public abstract FoodListVO update(FoodListVO vo);

	public abstract boolean delete(int id);
}
