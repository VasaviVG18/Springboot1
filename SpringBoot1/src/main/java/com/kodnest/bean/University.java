package com.kodnest.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class University {
	int uid;
	String uname;
	
	Trainer trainer;
	@Override
	public String toString() {
		return "University [uid=" + uid + ", uname=" + uname + ", trainer=" + trainer + "]";
	}
	public University() {
		super();
		System.out.println("0-param-constr");
	}
	
	public University(int uid, String uname, Trainer trainer) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.trainer = trainer;
		System.out.println("Param-constr");
	}
	public int getUid() {
		System.out.println("getter-uid");
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
		System.out.println("setter-uid");
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		System.out.println("setter-uname");
		this.uname = uname;
	}
	public Trainer getTrainer() {
		System.out.println("getter-trainer");
		return trainer;
	}
	@Autowired
	public void setTrainer(Trainer trainer) {
		System.out.println("setter-trainer");
		this.trainer = trainer;
	}


}
