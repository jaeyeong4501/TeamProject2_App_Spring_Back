package com.busanit.controller;

import com.busanit.domain.*;
import com.busanit.entity.Blog;
import com.busanit.entity.Board;
import com.busanit.entity.Boards;
import com.busanit.service.BlogReplyService;
import com.busanit.service.BlogService;
import com.busanit.service.BoardService;
import com.busanit.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
//@CrossOrigin(origins = "http://localhost:3000")
public class UsersRestController {

    private UsersService usersService;

    @PostMapping("/join")
    public void userJoin(@RequestBody UserDTO userDTO) {
        usersService.joinUser(userDTO);
    }


}
