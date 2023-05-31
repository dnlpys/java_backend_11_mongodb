package test.com.member;

import java.util.List;

import org.bson.Document;

public interface MemberDAO {

	public List<MemberVO> findAll();

	public MemberVO findOne(MemberVO vo);

	public int insert(MemberVO vo);

	public List<MemberVO> searchList(String searchKey, String searchWord);

	public List<MemberVO> searchList2(int num1, int num2);

	public List<Document> searchList3(int num1, int num2);

	public List<MemberVO> findAll2(int page, int limit);

	public int update(MemberVO vo);

}
