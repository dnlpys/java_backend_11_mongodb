package test.com.mongo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
}
