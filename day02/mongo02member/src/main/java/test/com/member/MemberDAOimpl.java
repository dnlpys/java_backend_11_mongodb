package test.com.member;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class MemberDAOimpl implements MemberDAO {

	@Autowired
	MongoCollection<Document> member;
	
	@Override
	public List<MemberVO> findAll() {
		log.info("findAll()....");
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		FindIterable<Document> docs =  member.find();
		for (Document doc : docs) {
			MemberVO vo = new MemberVO();
			vo.setMid(doc.get("_id").toString());
			vo.setNum(doc.getInteger("num", 0));
			vo.setId(doc.getString("id"));
			vo.setPw(doc.getString("pw"));
			vo.setName(doc.getString("name"));
			vo.setTel(doc.getString("tel"));
			list.add(vo);
		}
		
		return list;
	}

	@Override
	public int insert(MemberVO vo) {
		log.info("insert()....{}",vo);
		int flag = 0;
		
		try {
			Document doc = new Document();
			doc.put("num", vo.getNum());
			doc.put("id", vo.getId());
			doc.put("pw", vo.getPw());
			doc.put("name", vo.getName());
			doc.put("tel", vo.getTel());
			member.insertOne(doc);
			flag = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}

	@Override
	public MemberVO findOne(MemberVO vo) {
		log.info("findOne()....{}",vo);
		
		MemberVO vo2 = new MemberVO();
		//db.member.find({num:1})
		Bson filter = new Document("num",vo.getNum());
		FindIterable<Document> docs =  member.find(filter);
		for (Document doc : docs) {
			vo2.setMid(doc.get("_id").toString());
			vo2.setNum(doc.getInteger("num", 0));
			vo2.setId(doc.getString("id"));
			vo2.setPw(doc.getString("pw"));
			vo2.setName(doc.getString("name"));
			vo2.setTel(doc.getString("tel"));
		}
		
		return vo2;
	}

	
	

}
