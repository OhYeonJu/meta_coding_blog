package com.cos.blog.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
// 답변 테이블
public class Reply {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 200)
    private String content;

    @ManyToOne // 여러개의 답변은 하나의 게시글에 존재할 수 있다.
    @JoinColumn(name="boardId")
    private Board board;

    @ManyToOne // 여러개의 답변을 하나의 유저가 쓸 수 있다.
    @JoinColumn(name = "userId")
    private Users users;

    @CreationTimestamp
    private Timestamp createDate;

}
