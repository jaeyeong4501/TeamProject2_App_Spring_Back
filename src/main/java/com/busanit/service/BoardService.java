package com.busanit.service;

import com.busanit.domain.BlogDTO;
import com.busanit.domain.BoardDTO;
import com.busanit.domain.BoardsDTO;
import com.busanit.entity.Blog;
import com.busanit.entity.Board;
import com.busanit.entity.Boards;
import com.busanit.repository.BlogRepository;
import com.busanit.repository.BoardRepository;
import com.busanit.repository.BoardsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BoardService {


    private BoardRepository boardRepository;
    private BoardsRepository boardsRepository;

//    public List<Blog> getBlogList() {
//        return blogRepository.findAll();
//    }
//
//    public List<Blog> getBlogSearchList(String searchText) {
//        return blogRepository.findByTitleContaining(searchText);
//    }
//
//    public Blog getBlog(Long idx) {
//        return blogRepository.findByIdx(idx);
//    }
//
//    public void writeBlog(BlogDTO blogDTO) {
//        Blog blog = new Blog();
//        if(blogDTO.getIdx() != null) {
//            blog.setIdx(blogDTO.getIdx());
//        }
//        blog.setTitle(blogDTO.getTitle());
//        blog.setContent(blogDTO.getContent());
//
//        blogRepository.save(blog);
//    }

    // 보드 하나 쓰기.
    public void writeBoard(BoardDTO boardDTO) {
//        Blog blog = new Blog();
        Board board = new Board();
        if(boardDTO.getId() != null) {
            board.setIdx(boardDTO.getId());
        }
        board.setBoard_name(boardDTO.getBoard_name());


//        blogRepository.save(blog);
        boardRepository.save(board);
    }

    // Board 하나 조회.
    public Board getBoard(Long idx) {
//        return blogRepository.findByIdx(idx);
        return boardRepository.findByIdx(idx);
    }

    // 보드 여러개 가져오기.
        public List<Board> getBoardList() {
        return boardRepository.findAll();
    }

    // 중요할일 보드 들고오기
    public List<Board> getBoardListImportant() {
        return boardRepository.findAll();
    }

    //해야 할일 보드 들고오기
    public List<Board> getBoardListOught() {
        return boardRepository.findAll();
    }

    // 보드s 하나 쓰기.
    public void writeBoards(BoardsDTO boardsDTO) {
//        Blog blog = new Blog();
        Boards boards = new Boards();
        if(boardsDTO.getId() != null) {
            boards.setIdx(boardsDTO.getId());
        }
        boards.setUser_id(boardsDTO.getUser_id());


//        blogRepository.save(blog);
        boardsRepository.save(boards);
    }


    // Boards 하나 조회.
    public Boards getBoards(Long idx) {
//        return blogRepository.findByIdx(idx);
        return boardsRepository.findByIdx(idx);
    }

    // 보드 여러개 가져오기.
    public List<Boards> getBoardsList() {
        return boardsRepository.findAll();
    }

//    public void removeBlog(Long idx) {
//        blogRepository.deleteById(idx);
//    }
}
