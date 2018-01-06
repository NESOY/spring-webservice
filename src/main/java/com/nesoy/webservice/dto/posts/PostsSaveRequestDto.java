package com.nesoy.webservice.dto.posts;

import com.nesoy.webservice.domain.posts.Posts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by nesoy on 2018. 1. 6..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    public Posts toEntity() {
        return Posts.builder().title(title).content(content).author(author).build();
    }
}

