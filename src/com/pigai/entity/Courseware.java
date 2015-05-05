package com.pigai.entity;

// default package
// Generated 2015-5-5 22:39:25 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Courseware generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "courseware", catalog = "pigai")
public class Courseware implements java.io.Serializable {

	private Integer coursewareId;
	private Course course;
	private File file;

	public Courseware() {
	}

	public Courseware(Course course, File file) {
		this.course = course;
		this.file = file;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "coursewareId", unique = true, nullable = false)
	public Integer getCoursewareId() {
		return this.coursewareId;
	}

	public void setCoursewareId(Integer coursewareId) {
		this.coursewareId = coursewareId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "courseId", nullable = false)
	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fileId", nullable = false)
	public File getFile() {
		return this.file;
	}

	public void setFile(File file) {
		this.file = file;
	}

}
