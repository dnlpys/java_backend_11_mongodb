package test.com.mongo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class HomeController {
	
	@Autowired
	MemoService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		log.info("Welcome home!");
		
		return "home";
	}
	
	@ResponseBody
	@RequestMapping(value = "/findAll.do", method = RequestMethod.GET)
	public List<MemoVO> findAll() {
		log.info("/findAll.do");
		
		List<MemoVO> list = service.findAll();

		
		return list;
	}
	
	@ResponseBody
	@RequestMapping(value = "/findOne.do", method = RequestMethod.GET)
	public MemoVO findOne(MemoVO vo) {
		log.info("/findOne.do....{}",vo);
		
		MemoVO vo2 = service.findOne(vo);
		
		
		return vo2;
	}
	
	@ResponseBody
	@RequestMapping(value = "/insertOK.do", method = RequestMethod.GET)
	public Map<String, Integer> insertOK(MemoVO vo) {
		log.info("/insertOK.do...{}",vo);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		int result = service.insert(vo);
		map.put("result", result);
		return map;
	}
	
	
}
