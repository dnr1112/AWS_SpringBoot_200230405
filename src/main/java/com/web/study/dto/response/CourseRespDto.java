package com.web.study.dto.response;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class CourseRespDto {
	private int courseId;
	private int lecturePrice;
	private String lectureName;
	private String instructorName;
	private String studentName;
	private LocalDate registeDate;
}
