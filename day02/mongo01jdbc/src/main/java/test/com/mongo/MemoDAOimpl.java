package test.com.mongo;

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
public class MemoDAOimpl implements MemoDAO{

	@Autowired
	MongoCollection<Document> testcollection;
	
	@Override
	public List<MemoVO> findAll() {
		log.info("findAll()...");
		
		List<MemoVO> list = new ArrayList<MemoVO>();
		
		FindIterable<Document> docs = testcollection.find();
		log.info("docs...{}",docs);
		
		for (Document doc : docs) {
			log.info("{}",doc);
			MemoVO vo = new MemoVO();
			vo.setMid(doc.get("_id").toString());
			vo.setAge(doc.getInteger("age"));
			vo.setName(doc.getString("name"));
			vo.setOffice(doc.getString("office"));
			vo.setPhone(doc.getString("phone"));
			
			list.add(vo);
		}
		
		
		return list;
	}

	@Override
	public int insert(MemoVO vo) {
		log.info("insert()...{}",vo);
		
		int flag = 0;
		
		try {
			Document doc = new Document();
			doc.put("age", vo.getAge());
			doc.put("name", vo.getName());
			doc.put("office", vo.getOffice());
			doc.put("phone", vo.getPhone());
			testcollection.insertOne(doc);
			flag = 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public MemoVO findOne(MemoVO vo) {
		log.info("findOne()....{}",vo);
		
		MemoVO vo2 = new MemoVO();
		
		Bson filter = new Document("age",vo.getAge());
		FindIterable<Document> docs = testcollection.find(filter);
		log.info("docs...{}",docs);
		
		for (Document doc : docs) {
			log.info("{}",doc);
			vo2.setMid(doc.get("_id").toString());
			vo2.setAge(doc.getInteger("age"));
			vo2.setName(doc.getString("name"));
			vo2.setOffice(doc.getString("office"));
			vo2.setPhone(doc.getString("phone"));
		}
		
		return vo2;
	}

}
