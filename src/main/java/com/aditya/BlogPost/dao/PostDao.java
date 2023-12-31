package com.aditya.BlogPost.dao;

import com.aditya.BlogPost.entity.Post;

import java.util.List;

public interface PostDao {
    public void save(Post post);
    public List<Post> findAllPosts( String order);
    public  Post findById(String id);
    public void updateById(int id, String title, String content);
     public void deleteById(String id);
     public List<Post> sortByNewest();
     public List<Post> searchbyPostFields(String search, String order);
    public List<String> findAllAuthors();
    public List<Post> findByAuthors(List<String> authors, String order);
    public List<Post> findByTags(List<String> tags, String order);
    public List<Post> findByAuthorsAndTags(List<String> authors, List<String> tags, String order);


}
