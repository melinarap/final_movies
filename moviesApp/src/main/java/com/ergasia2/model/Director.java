package com.ergasia2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MovieDirector")
public class Director {
	
	@Id
	@Column(name = "directorId")
	int directorId;  
	
	@Column(name = "movieId")
	int movieId;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "surname")
	String surname;
	    


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

	public int getDirectorId() {
		return directorId;
	}

	public void setDirectorId(int directorId) {
		this.directorId = directorId;
	}

	public Director(int movieId, String name, String surname, int directorId) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.surname = surname;
		this.directorId = directorId;
	}

	@Override
	public String toString() {
		return "Director [movieId=" + movieId + ", name=" + name + ", surname=" + surname + ", directorId=" + directorId
				+ "]";
	}
	
}
	