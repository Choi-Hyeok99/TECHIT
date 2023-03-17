package com.ll.basic1.boundedContext.article.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Article {

    @Id
    @GeneratedValue(strategy = IDENTITY) //AUTO_INCREMENT
    private long id;

    private LocalDateTime createDate; // 데이터 생성 날짜
    private LocalDateTime modifyDate; // 데이터 수정 날짜
    private String title;
    private String body;

}
