package com.ergasia2.model;

/*to save 8a ginetai mesw tou id/title ths tainias 1 pros polla*/


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bookmarks")
public class UserBookmark {
	
	@Id
	@Column(name = "bookmarkId")
	int bookmarkId;
	
	@Column(name = "movieId")
	int movieId;
	
	@Column(name = "UserUsername")
	String username;
}
