package com.web.study.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class Lecture {

	private int id;
	private int lecture_price;
	private String lecture_name;
	private int lecturer_id;
}
