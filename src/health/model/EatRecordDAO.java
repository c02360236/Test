package health.model;

import java.util.List;

public interface EatRecordDAO {

	public abstract EatRecordVO selectByPrimaryKey(long no);

	public abstract List<EatRecordVO> selectByMemberNo(int memberNo);

	public abstract List<EatRecordVO> getAll();

	public abstract EatRecordVO insert(EatRecordVO vo);

	public abstract EatRecordVO update(EatRecordVO vo);

	public abstract boolean delete(int id);

}