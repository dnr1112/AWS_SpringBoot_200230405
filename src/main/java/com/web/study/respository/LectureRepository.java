package com.web.study.respository;

import org.apache.ibatis.annotations.Mapper;

import com.web.study.domain.entity.Lecture;

@Mapper
public interface LectureRepository {

	public int registe(Lecture lecture);
}
