package com.Kholofelo.springboot.repository;

import com.Kholofelo.springboot.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}