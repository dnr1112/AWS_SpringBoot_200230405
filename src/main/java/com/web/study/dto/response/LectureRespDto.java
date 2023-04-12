package com.web.study.dto.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LectureRespDto {
	private int lectureId;
	private int lecturePrice;
	private String instructorName;
	private String lectureName;
}
