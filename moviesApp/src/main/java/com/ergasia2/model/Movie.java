package com.ergasia2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movies")
public class Movie {
	
	@Id
	@Column(name = "id")
	int id;
	
	@Column(name = "title")
	String title;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}  

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + "]";
	}

	public Movie(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	
	
}
