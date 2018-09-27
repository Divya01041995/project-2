package com.niit.dao;

import com.niit.model.BlogPostlikes;
import com.niit.model.BlogPostLikes;

public interface BlogPostLikesDao {
BlogPostLikes hasUserLikedPost(int postId,String email);
BlogPostlikes updateLikes(int postId,String email);
}
