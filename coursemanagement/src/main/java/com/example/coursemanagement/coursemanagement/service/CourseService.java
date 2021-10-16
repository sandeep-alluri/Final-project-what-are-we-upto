package com.example.coursemanagement.coursemanagement.service;

import java.util.List;

import com.example.coursemanagement.coursemanagement.entity.Courses;

public interface CourseService {
	
	public void addCourse(Courses course);
	public void deleteCourse(Courses course);
	public List<Courses> getAllCourse();
	public Courses updateCourse(Courses course);
	public Courses getCourseById(Integer id);
}
                                                