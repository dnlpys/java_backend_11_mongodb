package test.com.mongo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class MemoDAOimpl implements MemoDAO{

//	@Autowired
//	SqlSession
	
	@Override
	public List<MemoVO> findAll() {
		log.info("findAll()...");
		
		List<MemoVO> list = new ArrayList<MemoVO>();
		MemoVO vo = new MemoVO();
		vo.setMid("abcd");
		vo.setAge(1);
		vo.setName("kim");
		vo.setOffice("multi");
		vo.setPhone("010");
		
		list.add(vo);
		
		return list;
	}

}
