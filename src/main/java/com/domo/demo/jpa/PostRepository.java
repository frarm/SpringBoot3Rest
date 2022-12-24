package com.domo.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.domo.demo.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
