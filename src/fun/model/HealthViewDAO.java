package fun.model;

import java.util.List;

public interface HealthViewDAO {
	public abstract HealthViewVO selectByPrimaryKey(int no);

	public abstract List<HealthViewVO> getAll();

	public abstract HealthViewVO insert(HealthViewVO vo);

	public abstract HealthViewVO update(HealthViewVO vo);

	public abstract boolean delete(int id);
}
