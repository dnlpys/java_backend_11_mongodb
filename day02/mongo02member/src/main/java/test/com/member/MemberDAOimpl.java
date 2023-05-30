package test.com.member;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.client.MongoCollection;

@Repository
public class MemberDAOimpl implements MemberDAO {

	@Autowired
	MongoCollection<Document> member;
	
	@Override
	public List<MemberVO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
