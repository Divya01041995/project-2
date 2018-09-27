package com.niit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="blogpostlikes_s190035")
public class BlogPost {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int likesId;//PK
	@ManyToOne
private BlogPostlikes blogPost;//FK  blogpost_id
	@ManyToOne
private User user;//FK  user_email
	public int getLikesId() {
		return likesId;
	}
	public void setLikesId(int likesId) {
		this.likesId = likesId;
	}
	public BlogPostlikes getBlogPost() {
		return blogPost;
	}
	public void setBlogPost(BlogPostlikes blogPost) {
		this.blogPost = blogPost;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}


}
