package food.combo.model;

import java.util.List;

public interface DayMealDAO {
	public abstract DayMealVO selectByPrimaryKey(int no);

	public abstract List<DayMealVO> getAll();

	public abstract DayMealVO insert(DayMealVO vo);

	public abstract DayMealVO update(DayMealVO vo);

	public abstract boolean delete(int id);
}
