package com.web.study.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ErrorResponseDto;
import com.web.study.dto.ResponseDto;

@RestController							// @Controller: 일반 뷰를 리턴
public class BasicController {
	
//	@RequestMapping(value = "/view/test", method = RequestMethod.GET)  =>  @GetMapping으로 간단하게 사용가능
	@GetMapping("/view/test")
//	@ResponseBody						// Controller를 사용할 때 붙여줘야 함
	public ResponseEntity<? extends ResponseDto> view() {				// 응답은, String일 때만 text로 오고 그 외에는 JSON으로 옴
		
		List<String> strList = new ArrayList<>();
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		
		if(strList.contains("e")) {
			try {
				throw new RuntimeException("오류!");
			} catch (Exception e) {
				return ResponseEntity.internalServerError().body(ErrorResponseDto.of(HttpStatus.INTERNAL_SERVER_ERROR, e));		// 500 에러
//				return ResponseEntity.badRequest().body(ErrorResponseDto.of(HttpStatus.BAD_REQUEST, e));
			}
		}
		
//		return ResponseEntity.ok(DataResponseDto.of(strList));
		return ResponseEntity.ok().body(DataResponseDto.of(strList));
	}
	
}
