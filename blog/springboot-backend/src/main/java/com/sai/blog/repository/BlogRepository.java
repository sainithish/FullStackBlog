package com.sai.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sai.blog.model.Blog;

@Repository
public interface BlogRepository extends JpaRepository <Blog, Long> {

}
