package com.yedam.java.book.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	// 전체조회
	@GetMapping("bookList")
	public String bookList(Model model) {
		List<BookVO> list = bookService.bookList();
		model.addAttribute("bookList", list);
		return "book/bookList";
	}
	
	// 단건조회
	@GetMapping("bookInfo")
	public String bookInfo(BookVO bookVO, Model model) {
		BookVO findVO = bookService.bookInfo(bookVO);
		model.addAttribute("bookInfo", findVO);
		return "book/bookInfo";
	}
	
	// 등록 페이지
	@GetMapping("bookInsert")
	public String bookInsertForm() {
		return "book/bookInsert";
	}
	
	// 등록 처리
	@PostMapping("bookInsert")
	public String bookInsertProcess(BookVO bookVO) {
		bookService.insertBook(bookVO);
		return "redirect:bookList";
	}
	
	// 수정 페이지
	@GetMapping("bookUpdate")
	public String bookUpdateForm(BookVO bookVO, Model model) {
		BookVO findVO = bookService.bookInfo(bookVO);
		model.addAttribute("bookInfo", findVO);
		return "book/bookUpdate";
	}
	
	// 수정 처리
	@PostMapping("bookUpdate")
	@ResponseBody
	public Map<String, Object> bookUpdateProcess(@RequestBody BookVO bookVO){
		Map<String, Object> map = new HashMap<>();
		int result = bookService.updateBook(bookVO);
		if(result > -1) {
			map.put("result", true);
			map.put("bookNo", result);
		}else {
			map.put("result", false);
		}
		return map;
	}
	
	// 삭제
	@GetMapping("bookDelete")
	public String bookDelete(@RequestParam Integer bookNo) {
		bookService.deleteBook(bookNo);
		return "redirect:bookList";
	}
	
}









