package com.yedam.app.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

@Controller
public class EmpController {
	
	@Autowired
	EmpService empService;
	
	// 전체조회
	@GetMapping("empList")
	public String empList(Model model) {
		List<EmpVO> list = empService.getEmpList();
		model.addAttribute("empList", list);
		return "empList";
	}
	
	// 단건조회
	@GetMapping("empInfo")
	public String empInfo(EmpVO empVO, Model model) {
		EmpVO findVO = empService.getEmpInfo(empVO);
		model.addAttribute("empInfo", findVO);
		return "empInfo";
	}
	
	// 등록 - 페이지
	@GetMapping("empInsert")
	public String empInsertForm(Model model) {
		model.addAttribute("empVO", new EmpVO());
		return "empInsert";
	}
	
	// 등록 - 처리
	@PostMapping("empInsert")
	public String empInsertProcess(EmpVO empVO) {
		empService.insertEmpInfo(empVO);
		return "redirect:empList";
	}
	
}















