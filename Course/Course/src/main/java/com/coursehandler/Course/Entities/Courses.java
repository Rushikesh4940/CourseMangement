package com.coursehandler.Course.Entities;

public class Courses {
	private long id;
	private String Title;
	private String Mentor;
	private long Number;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Courses(long id, String title, String mentor, long number) {
		super();
		this.id = id;
		Title = title;
		Mentor = mentor;
		Number = number;
	}
	@Override
	public String toString() {
		return "Courses [id=" + id + ", Title=" + Title + ", Mentor=" + Mentor + ", Number=" + Number + ", getId()="
				+ getId() + ", getTitle()=" + getTitle() + ", getMentor()=" + getMentor() + ", getNumber()="
				+ getNumber() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getMentor() {
		return Mentor;
	}
	public void setMentor(String mentor) {
		Mentor = mentor;
	}
	public long getNumber() {
		return Number;
	}
	public void setNumber(long number) {
		Number = number;
	}
}
