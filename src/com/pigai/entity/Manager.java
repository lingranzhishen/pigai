package com.pigai.entity;

// default package
// Generated 2015-5-5 22:39:25 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Manager generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "manager", catalog = "pigai")
public class Manager implements java.io.Serializable {

	private Integer managerId;
	private String username;
	private String password;

	public Manager() {
	}

	public Manager(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "managerId", unique = true, nullable = false)
	public Integer getManagerId() {
		return this.managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	@Column(name = "username", nullable = false)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
