package net.javaguides.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "studioname")
	private String studioname;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return title;
	}
	public void setFirstName(String firstName) {
		this.title = firstName;
	}
	public String getLastName() {
		return year;
	}
	public void setLastName(String lastName) {
		this.year = lastName;
	}
	public String getEmail() {
		return studioname;
	}
	public void setEmail(String email) {
		this.studioname = email;
	}
}
