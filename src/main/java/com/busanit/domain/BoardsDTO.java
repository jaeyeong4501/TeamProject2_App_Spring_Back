package com.busanit.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardsDTO {
    private Long id;
    // 로그인 유저
    // 연관관계 빼고 , 뼈대 만들기.
    private String user_id;
//    private String gen_date;
}
