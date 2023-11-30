package com.busanit.entity;

import com.busanit.constant.Category;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="board")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Board extends BaseTimeEntity{
    @Id
    @Column(name="board_idx")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idx;

    @Column(nullable = false)
    private String board_name;

    @Enumerated(EnumType.STRING)
    private Category category; //상품 판매 상태

    // Boards 부모 entity에 연관관계 설정 할 예정.
    // 현재 클래스, Many, 상대방 One
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "boards_idx")
    private Boards boards;
}
