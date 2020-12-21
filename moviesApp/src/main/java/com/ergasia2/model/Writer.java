package com.ergasia2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MovieDirector")
public class Writer {
	
	@Id
	@Column(name = "writerId")
	int writerId;
	
	@Column(name = "movieId")
	int movieId;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "surname")
	String surname;

	public int getWriterId() {
		return writerId;
	}

	public void setWriterId(int writerId) {
		this.writerId = writerId;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Writer [writerId=" + writerId + ", movieId=" + movieId + ", name=" + name + ", surname=" + surname
				+ "]";
	}

	public Writer(int writerId, int movieId, String name, String surname) {
		super();
		this.writerId = writerId;
		this.movieId = movieId;
		this.name = name;
		this.surname = surname;
	}
	

}