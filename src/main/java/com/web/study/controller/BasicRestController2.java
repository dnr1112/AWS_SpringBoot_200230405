package com.web.study.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ResponseDto;
import com.web.study.dto.request.BasicTestDto2;

//@Data
//class PPPP {
//	private int num;
//	private String str;
//	private List<String> list;
//}

@RestController
public class BasicRestController2 {
	
	@GetMapping("/pppp")
	public ResponseEntity<? extends ResponseDto> pppp(BasicTestDto2 basicTestDto2) {
		String data = "Dto_num: " + basicTestDto2.getNum()
		+ " / Dto_str: " + basicTestDto2.getStr()
		+ " / Dto_list: " + basicTestDto2.getList();
		
		return ResponseEntity.ok().body(DataResponseDto.of(data));
	}
	
	@PostMapping("/pppp2")
	public ResponseEntity<? extends ResponseDto> pppp2(BasicTestDto2 basicTestDto2) {
		
		return ResponseEntity.created(null).body(DataResponseDto.of(basicTestDto2));
	}
}
