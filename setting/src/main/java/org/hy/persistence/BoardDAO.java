package org.hy.persistence;

import java.util.List;

import org.hy.domain.BoardVO;


public interface BoardDAO {

	public List<BoardVO> readAll();
	
	public void create(BoardVO vo);
	
}
