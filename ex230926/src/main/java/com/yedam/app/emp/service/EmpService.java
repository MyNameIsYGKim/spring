package com.yedam.app.emp.service;

import java.util.List;

public interface EmpService {
	// 전체조회
	public List<EmpVO> getEmpList();
	
	// 단건조회
	public EmpVO getEmpInfo(EmpVO empVO);
	
	// 등록
	public int insertEmpInfo(EmpVO empVO);
	
}
