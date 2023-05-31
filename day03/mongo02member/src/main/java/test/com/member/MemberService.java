package test.com.member;

import java.util.List;

import org.bson.Document;
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


	public List<MemberVO> searchList(String searchKey, String searchWord) {
		return dao.searchList(searchKey, searchWord) ;
	}


	public List<MemberVO> searchList2(int num1, int num2) {
		return dao.searchList2(num1, num2);
	}

	public List<Document> searchList3(int num1, int num2) {
		return dao.searchList3(num1, num2);
	}


	public List<MemberVO> findAll2(int page, int limit) {
		return dao.findAll2(page, limit);
	}


	public int update(MemberVO vo) {
		return dao.update(vo);
	}
	



	

}
