package food.recipes.model;

import java.util.List;

public interface FoodItemDAO {
	public abstract FoodItemDAO selectByPrimaryKey(int useFoodNo);

	public abstract List<FoodItemDAO> getAll();

	public abstract FoodItemDAO insert(FoodItemDAO vo);

	public abstract FoodItemDAO update(FoodItemDAO vo);

	public abstract boolean delete(int id);
}
