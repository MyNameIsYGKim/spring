package com.yedam.java.book.service;

import java.util.List;

public interface BookService {
	// 전체조회
	public List<BookVO> getBookList();
	
	// 단건조회 : 북넘버
	public Integer getBookNextNo();
	
	// 등록
	public int insertBookInfo(BookVO bookVO);
	
	// 대여현황 조회
	public List<RentVO> getRentStatusList();
}
