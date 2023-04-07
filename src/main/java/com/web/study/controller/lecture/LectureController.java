package com.web.study.controller.lecture;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.dto.DataResponseDto;
import com.web.study.dto.ResponseDto;
import com.web.study.dto.request.lecture.LectureReqDto;
import com.web.study.service.LectureService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor							// LectureService에 의존성 주입
public class LectureController {

	private final LectureService lectureService;
	
	// Create
	@PostMapping("/lecture")
	public ResponseEntity<? extends ResponseDto> register(@RequestBody LectureReqDto lectureReqDto) {		// JSON으로 받기 때문에 @RequestBody 붙여줄 것

		lectureService.registeLecture(lectureReqDto);
		
		return ResponseEntity.ok().body(DataResponseDto.ofDefault());
	}
	
	// Read
	public ResponseEntity<? extends ResponseDto> get() {
			
		return ResponseEntity.ok().body(DataResponseDto.ofDefault());
	}

	// Update
	public ResponseEntity<? extends ResponseDto> modify() {
		
		return ResponseEntity.ok().body(DataResponseDto.ofDefault());
	}

	// Delete
	public ResponseEntity<? extends ResponseDto> remove() {
		
		return ResponseEntity.ok().body(DataResponseDto.ofDefault());
	}	
	
}
