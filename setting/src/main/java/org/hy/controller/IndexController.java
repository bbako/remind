package org.hy.controller;

import java.util.List;

import javax.inject.Inject;

import org.hy.domain.BoardVO;
import org.hy.persistence.BoardDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	private static final Logger logger= LoggerFactory.getLogger(IndexController.class);
	
	@Inject
	BoardDAO dao;
	
	@GetMapping
	public void indexGet( Model model) {
		System.out.println("index");
		List<BoardVO> list = dao.readAll();
		logger.info(list.toString());
		model.addAttribute("list", list);
		
	}

	
}
