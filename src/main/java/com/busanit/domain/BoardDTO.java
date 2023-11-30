package com.busanit.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BoardDTO {
    private Long id;
    private String board_name;
    private String board_content; //  보드 내용  (추가)
    @JsonFormat(pattern = "yyyyMMddHHmm") // 패턴 사용
    private LocalDateTime registerDateTime2; // 시간 불러 올 려고 만듬 (추가)
}
//    private String gen_date;
