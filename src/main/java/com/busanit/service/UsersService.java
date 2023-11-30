package com.busanit.service;

import com.busanit.domain.BoardDTO;
import com.busanit.domain.BoardsDTO;
import com.busanit.domain.UserDTO;
import com.busanit.entity.Board;
import com.busanit.entity.Boards;
import com.busanit.entity.Users;
import com.busanit.repository.BoardRepository;
import com.busanit.repository.BoardsRepository;
import com.busanit.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsersService {



    private UsersRepository usersRepository;

    public void joinUser(UserDTO userDTO) {

        Users users = new Users();
        users.setUserEmail(userDTO.getUserEmail());
        users.setUserName(userDTO.getUserName());
        users.setUserPassword(userDTO.getUserPassword());


//        blogRepository.save(blog);
        usersRepository.save(users);
    }
}
