package com.nesoy.webservice.domain.posts;

import com.nesoy.webservice.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by nesoy on 2018. 1. 6..
 * blog : https:nesoy.github.io
 * email : kyoje11@gmail.com
 */

@NoArgsConstructor(access = AccessLevel.PROTECTED)
// 기본 생성자 자동 추가
// 기본생성자의 접근 권한을 protected로 제한
// 이유 : 프로젝트 코드상에서 기본생성자로 생성하는 것은 막되, JPA에서 Entity 클래스를 생성하는것은 허용
@Getter
// 클래스내 모든 필드의 Getter 메소드를 자동생성
// Setter는 왜 안하느냐? -> 함수의 의도를 제대로 표현하지 못하기 때문에.
@Entity
// 테이블과 링크될 클래스임을 나타냅니다. 언더스코어 네이밍(_)으로 이름을 매칭합니다.
// ex) SalesManager.java -> sales_manager table
public class Posts extends BaseTimeEntity{
    @Id // 해당 테이블의 PK 필드를 나타냅니다.
    @GeneratedValue // PK의 생성 규칙을 나타냅니다. 기본값은 AUTO 로, MySQL의 auto_increment와 같이 자동증가하는 정수형 값이 됩니다.
    private Long id;
    @Column(length = 500, nullable = false) // 테이블의 컬럼을 나타내면, 굳이 선언하지 않더라도 해당 클래스의 필드는 모두 컬럼이 됩니다.
    private String title;
    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;
    private String author;

    @Builder // 해당 클래스의 빌더패턴 클래스를 생성
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}

