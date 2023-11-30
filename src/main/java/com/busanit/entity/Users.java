package com.busanit.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Users extends BaseTimeEntity{
    @Id
    @Column(name="users_idx")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idx;

    @Column(nullable = true)
    private String userName; // 작성자, 즉, 로그인한 유저.

    @Column(nullable = true)
    private String userEmail; // 작성자, 즉, 로그인한 유저.

    @Column(nullable = true)
    private String userPassword; // 작성자, 즉, 로그인한 유저.


}
