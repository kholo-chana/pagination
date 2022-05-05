package com.Kholofelo.springboot.service;

import com.Kholofelo.springboot.payload.PostDto;
import com.Kholofelo.springboot.payload.PostResponse;

public interface PostService {
    PostDto createPost(PostDto postDto);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
}