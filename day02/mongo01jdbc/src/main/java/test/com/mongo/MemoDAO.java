package test.com.mongo;

import java.util.List;

public interface MemoDAO {
	
	public List<MemoVO> findAll();

	public int insert(MemoVO vo);

	public MemoVO findOne(MemoVO vo);

}
