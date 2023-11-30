package com.busanit.repository;

import com.busanit.entity.Boards;
import com.busanit.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findByIdx(Long idx);

//    List<Blog> findByTitleContaining(String searchText);
}
