package com.yedam.java.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	// 도서등록 - 페이지 : Get
	@GetMapping("bookInsert")
	public String bookInsertForm(Model model) {
		model.addAttribute("bNo", bookService.getBookNextNo());
		return "book/bookInsert";
	}
	
	// 도서등록 - 처리 : Post
	@PostMapping("bookInsert")
	public String bookInsertProcess(BookVO bookVO) {
		bookService.insertBookInfo(bookVO);
		return "redirect:bookList";
	}
	
	// 도서목록조회 : Get
	@GetMapping("bookList")
	public String bookList(Model model) {
		model.addAttribute("bookList", bookService.getBookList());
		return "book/bookList";
	}
	
	// 대여현황조회 : Get
	@GetMapping("rentList")
	public String rentList(Model model) {
		model.addAttribute("rentList", bookService.getRentStatusList());
		return "book/bookRentList";
	}
	
}













