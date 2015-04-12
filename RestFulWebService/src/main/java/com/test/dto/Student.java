package com.test.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Student implements Serializable {
	private Integer sno;
	private String sname;
	private Float fee;
	private String course;

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Student() {
		super();
	}

	public Student(Integer sno, String sname, Float fee, String course) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.fee = fee;
		this.course = course;
	}

	public Float getFee() {
		return fee;
	}

	public void setFee(Float fee) {
		this.fee = fee;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", fee=" + fee
				+ ", course=" + course + "]";
	}

}
