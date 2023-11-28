package com.busanit.repository;

import com.busanit.entity.Blog;
import com.busanit.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {

    Board findByIdx(Long idx);

//    List<Blog> findByTitleContaining(String searchText);
}
