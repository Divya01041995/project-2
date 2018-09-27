package com.niit.dao;

import java.util.List;

import com.niit.model.BlogComment;
import com.niit.model.BlogPostlikes;

public interface BlogPostDao {
	
	void addBlogPost(BlogPostlikes blogPost);
	List<BlogPostlikes> getBlogs(boolean approved);
	BlogPostlikes getBlogById(int id);
	void blogApproved(int id);
	void blogRejected(int id,String rejectionReason);
	void addBlogComment(BlogComment blogComment);
	List<BlogComment> getAllBlogComments(int blogPostId);
}
