package test.com.member;

import java.util.List;

public interface MemberDAO {

	public List<MemberVO> findAll();
	
	public MemberVO findOne(MemberVO vo);

	public int insert(MemberVO vo);

	

}
