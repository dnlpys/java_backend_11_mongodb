package test.com.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

/**
 * Handles requests for the application home page.
 */
@Slf4j
@Controller
public class MemberRestController {
	
	@Autowired
	MemberService service;
	
	@ResponseBody
	@RequestMapping(value = "/findAll.do", method = RequestMethod.GET)
	public List<MemberVO> findAll() {
		log.info("/findAll.do");
	
		List<MemberVO> list = service.findAll();
		
		return list;
	}
	
	@ResponseBody
	@RequestMapping(value = "/findAll2.do", method = RequestMethod.GET)
	public List<MemberVO> findAll2(int page, int limit) {
		log.info("/findAll2.do...{},{}",page,limit);
		
		List<MemberVO> list = service.findAll2(page,limit);
		
		return list;
	}
	
	@ResponseBody
	@RequestMapping(value = "/searchList.do", method = RequestMethod.GET)
	public List<MemberVO> searchList(String searchKey, String searchWord) {
		log.info("/searchList.do....{},{}",searchKey,searchWord);
		
		List<MemberVO> list = service.searchList(searchKey,searchWord);
		
		return list;
	}
	
	@ResponseBody
	@RequestMapping(value = "/searchList2.do", method = RequestMethod.GET)
	public List<MemberVO> searchList2(int num1,int num2) {
		log.info("/searchList2.do....{},{}",num1,num2);
		
		List<MemberVO> list = service.searchList2(num1,num2);
		
		return list;
	}
	
	@ResponseBody
	@RequestMapping(value = "/searchList3.do", method = RequestMethod.GET)
	public List<Document> searchList3(int num1,int num2) {
		log.info("/searchList3.do....{},{}",num1,num2);
		
		List<Document> list = service.searchList3(num1,num2);
		
		return list;
	}
	
	
	
	
	@ResponseBody
	@RequestMapping(value = "/findOne.do", method = RequestMethod.GET)
	public MemberVO findOne(MemberVO vo) {
		log.info("/findOne.do....{}",vo);
		
		MemberVO vo2 = service.findOne(vo);
		
		return vo2;
	}
	
	@ResponseBody
	@RequestMapping(value = "/insertOK.do", method = RequestMethod.GET)
	public Map<String, Integer> insertOK(MemberVO vo) {
		log.info("/insertOK.do...{}",vo);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int result = service.insert(vo);
		
		map.put("result", result);
		
		return map; //{"result":1}
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/updateOK.do", method = RequestMethod.GET)
	public Map<String, Integer> updateOK(MemberVO vo) {
		log.info("/updateOK.do...{}",vo);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int result = service.update(vo);
		
		map.put("result", result);
		
		return map; //{"result":1}
	}
	
	
	
}
