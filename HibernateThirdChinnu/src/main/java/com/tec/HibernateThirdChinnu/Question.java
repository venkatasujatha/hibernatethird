package com.tec.HibernateThirdChinnu;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Question 
{
	@Id
	private int qno;
	private String question;
	
	@OneToMany(targetEntity = Answere.class,mappedBy ="answere", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "qno")
	
	private List<Answere> answere;

	public int getQno() {
		return qno;
	}

	public void setQno(int qno) {
		this.qno = qno;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	

	public List<Answere> getAnswere() {
		return answere;
	}

	public void setAnswere(List<Answere> answere) {
		this.answere = answere;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(List<Answere> answere) {
		super();
		this.answere = answere;
	}

	
	
	
	

}
