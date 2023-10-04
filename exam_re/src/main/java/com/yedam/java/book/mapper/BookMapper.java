package com.yedam.java.book.mapper;

import java.util.List;

import com.yedam.java.book.service.BookVO;

public interface BookMapper {
	// 전체조회
	public List<BookVO> selectBookAll();
	
	// 단건조회 -> 북너버 자동부여 : 예측
	public Integer selectBookNextNo();
	
	// 등록
	public int insertBookInfo(BookVO bookVO);
	
}
