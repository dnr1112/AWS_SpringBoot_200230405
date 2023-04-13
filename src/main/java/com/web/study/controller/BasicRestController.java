package com.web.study.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ResponseDto;
import com.web.study.dto.request.BasicTestDto;


@RestController
public class BasicRestController {
	
	// GET 요청의 param을 처리하는 방법
//	@GetMapping("/read")
//	public ResponseEntity<? extends ResponseDto> read(
//			@RequestParam("age") int userAge,
//			@RequestParam("name") String userName) {
//		
//		String userInfo = userName + "(" + userAge + ")";
//		
//		return ResponseEntity.ok().body(DataResponseDto.of(userInfo));
//	}
	
//	@GetMapping("/read")
//	public ResponseEntity<? extends ResponseDto> read(int age, String name) {
//		String userInfo = name + "(" + age + ")";
//		
//		return ResponseEntity.ok().body(DataResponseDto.of(userInfo));
//	}
	
//	@GetMapping("/read")
//	public ResponseEntity<? extends ResponseDto> read(Params params) {
//		String userInfo = params.getName() + "(" + params.getAge() + ")";
//		
//		return ResponseEntity.ok().body(DataResponseDto.of(userInfo));
//	}
	
	@GetMapping("/read")
	public ResponseEntity<? extends ResponseDto> read(BasicTestDto basicTestDto) {
		String userInfo = basicTestDto.getName() + "(" + basicTestDto.getAge() + ")";
		
		return ResponseEntity.ok().body(DataResponseDto.of(userInfo));
	}
	
	@GetMapping("/read2/{id}")
	public ResponseEntity<? extends ResponseDto> read2(@PathVariable int id) {			// <= @PathVariable("id") int userId를 변수를 맞춰줌으로써 줄여쓸 수 있음
		Map<Integer, String> userMap = new HashMap<>();
		
		userMap.put(1, "가가가");
		userMap.put(2, "나나나");
		userMap.put(3, "다다다");
		userMap.put(4, "라라라");
		userMap.put(5, "마마마");
		
		return ResponseEntity.ok().body(DataResponseDto.of(userMap.get(id)));
	}
	
	@PostMapping("/create")
	public ResponseEntity<? extends ResponseDto> create(BasicTestDto basicTestDto) {		// POST - raw에서 JSON사용 시 @RequestBody를 붙여줘야 함
		System.out.println("데이터 추가");																// POST - x-www-form 사용 시 빼줘야 함
		
		
		return ResponseEntity.created(null).body(DataResponseDto.of(basicTestDto));
	}
}
