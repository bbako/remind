package org.hy.persistence;

import java.util.List;

import javax.inject.Inject;

import org.hy.domain.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class BoardDAOImpl implements BoardDAO {

	final static String namespace = "org.hy.persistence.BoardDAO";
	
	@Inject
	SqlSessionTemplate sess;
	
	@Override
	public List<BoardVO> readAll() {
		return sess.selectList(namespace+".readAll");

	}

	@Override
	public void create(BoardVO vo) {
		sess.insert(namespace+".create", vo);		
	}

}
