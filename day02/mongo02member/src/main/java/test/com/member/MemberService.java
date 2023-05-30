package test.com.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	MemberDAO dao;
	
	public List<MemberVO> findAll(){
		return dao.findAll();
	}
	

	public int insert(MemberVO vo) {
		return dao.insert(vo);
	}

	public MemberVO findOne(MemberVO vo) {
		return dao.findOne(vo);
	}
}
