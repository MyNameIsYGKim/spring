package com.yedam.java.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.book.mapper.BookMapper;
import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookMapper bookMapper;
	
	@Override
	public List<BookVO> bookList() {
		return bookMapper.bookList();
	}

	@Override
	public BookVO bookInfo(BookVO bookVO) {
		return bookMapper.bookInfo(bookVO);
	}

	@Override
	public int insertBook(BookVO bookVO) {
		return bookMapper.insertBook(bookVO) == 1 ? bookVO.getBookNo() : -1;
	}

	@Override
	public int updateBook(BookVO bookVO) {
		return bookMapper.updateBook(bookVO) == 1 ? bookVO.getBookNo() : -1;
		}

	@Override
	public int deleteBook(int bookNo) {
		return bookMapper.deleteBook(bookNo) == 1 ? bookNo : -1;
	}

}
