package com.nesoy.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nesoy on 2018. 1. 6..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */
//JpaRepository<Entity클래스, PK타입>
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
