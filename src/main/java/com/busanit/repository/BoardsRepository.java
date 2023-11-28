package com.busanit.repository;

import com.busanit.entity.Board;
import com.busanit.entity.Boards;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardsRepository extends JpaRepository<Boards, Long> {

    Boards findByIdx(Long idx);

//    List<Blog> findByTitleContaining(String searchText);
}
