package test.com.mongo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemoService {

	@Autowired
	MemoDAO dao;
	
	public List<MemoVO> findAll(){
		return dao.findAll();
	}

	public int insert(MemoVO vo) {
		return dao.insert(vo);
	}

	public MemoVO findOne(MemoVO vo) {
		return dao.findOne(vo);
	}
}
