package com.yedam.java.book.mapper;

import java.util.List;

import com.yedam.java.book.service.BookVO;

public interface BookMapper {
	// 전체조회
	public List<BookVO> bookList();
	
	// 단건조회
	public BookVO bookInfo(BookVO bookVO);
	
	// 등록
	public int insertBook(BookVO bookVO);
	
	// 수정
	public int updateBook(BookVO bookVO);
	
	// 삭제
	public int deleteBook(int bookNo);
}
