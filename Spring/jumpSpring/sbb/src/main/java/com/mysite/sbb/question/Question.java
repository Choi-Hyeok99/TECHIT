package com.mysite.sbb.question;

import com.mysite.sbb.answer.Answer;
import jakarta.persistence.*;
import lombok.Getter;
import java.util.List;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

import java.time.LocalDateTime;

// question 테이블이 생김
@Getter
@Setter
@Entity
@ToString
public class Question {


    @Id // PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT
    private Integer id; // INT id

    @Column(length = 200) // VARCHAR(200)
    private String subject;

    @Column(columnDefinition = "TEXT") // TEXT
    private String content;

    private LocalDateTime createDate; // DATETIME


    // OneToMany 자바세상에서의 편의를 위해서 필드 생성
    // 이 녀석은 실제 DB에 칼럼이 생성되지 않는다. (반영 X)
    // DB는 배열이나 리스트를 저장할 수 없다.
        // 칼럼에 저장할 수  없다.
    // 만들어도 되고 안 만들어도 됩니다.
    // 다만 만들면 해당 객체(질문객체)에서 관련된 답변들을 찾을 때 편합니다.
    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    // OneToMany 에는 직접객체초기화
    private List<Answer> answerList = new ArrayList<>(); // OneToMany에는 무조건  new ArrayList<>() 이거 무조건 써라

    public void addAnswer(Answer a) {
        a.setQuestion(this);
        answerList.add(a);
    }



}
