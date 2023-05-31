package test.com.member;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.bson.Document;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping(value = "/searchList.do", method = RequestMethod.GET)
	public List<MemberVO> searchList(String searchKey, String searchWord) {
		log.info("/searchList.do....{},{}",searchKey,searchWord);
		
		List<MemberVO> list = service.searchList(searchKey,searchWord);
		
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
	
	
	
}
