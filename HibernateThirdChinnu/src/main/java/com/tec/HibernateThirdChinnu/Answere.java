package com.tec.HibernateThirdChinnu;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.QueryException;

@Entity
public class Answere 
{
	@Id
	private int ansno;
	private String answere;
	@ManyToOne
	@JoinColumn(name="ansno")
	private Question question;
	
	public int getAnsno() {
		return ansno;
	}
	public void setAnsno(int ansno) {
		this.ansno = ansno;
	}
	public String getAnswere() {
		return answere;
	}
	public void setAnswere(String answere) {
		this.answere = answere;
	}
	public Answere(int ansno, String answere) {
		super();
		this.ansno = ansno;
		this.answere = answere;
	}
	public Answere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	
	
	

}
