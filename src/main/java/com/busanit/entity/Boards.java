package com.busanit.entity;

import com.busanit.constant.Category;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="boards")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Boards extends BaseTimeEntity{
    @Id
    @Column(name="boards_idx")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idx;

    @Column(nullable = true)
    private String user_id; // 작성자, 즉, 로그인한 유저.

    @OneToMany(mappedBy = "boards", cascade = CascadeType.ALL
            , orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Board> boardList = new ArrayList<>();



    // Boards 부모 entity에 연관관계 설정 할 예정.
    // 현재 클래스, Many, 상대방 One
//    @OneToMany(mappedBy = "blog", cascade = CascadeType.REMOVE)
//    private List<BlogReply> blogReplyList;
}
