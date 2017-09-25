package org.hy.controller;

import javax.inject.Inject;

import org.apache.log4j.Logger;
import org.hy.domain.BoardVO;
import org.hy.persistence.BoardDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class test {
	private static final Logger logger = Logger.getLogger(test.class);

	
	@Inject
	SqlSessionTemplate sess;
	
	@Inject
	BoardDAO dao;

	
	@Test
	public void qInsertTest2(){
		for (int i = 0; i < 20; i++) {
			
			BoardVO vo = new BoardVO();
			vo.setWriter("writer"+i);
			vo.setContent("contents"+i);
			dao.create(vo);
			}
		}
	
}