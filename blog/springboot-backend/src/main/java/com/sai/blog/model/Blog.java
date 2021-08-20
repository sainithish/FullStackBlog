package com.sai.blog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="blogs")
public class Blog {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private long id;
	@Column(name = "title")
	private String title;
	@Column(name = "content")
	private String content;
	
	public Blog()	{
		
	}
	public Blog(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
