package com.busanit.service;

import com.busanit.domain.BlogDTO;
import com.busanit.domain.BoardDTO;
import com.busanit.entity.Blog;
import com.busanit.entity.Board;
import com.busanit.repository.BlogRepository;
import com.busanit.repository.BoardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
public class BlogService {

    private BlogRepository blogRepository;
    private BoardRepository boardRepository;

    public List<Blog> getBlogList() {
        return blogRepository.findAll();
    }

    public List<Blog> getBlogSearchList(String searchText) {
        return blogRepository.findByTitleContaining(searchText);
    }

    public Blog getBlog(Long idx) {
        return blogRepository.findByIdx(idx);
    }

    public void writeBlog(BlogDTO blogDTO) {
        Blog blog = new Blog();
        if(blogDTO.getIdx() != null) {
            blog.setIdx(blogDTO.getIdx());
        }
        blog.setTitle(blogDTO.getTitle());
        blog.setContent(blogDTO.getContent());

        blogRepository.save(blog);
    }

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
            // 보드 불러오기
    public void removeBlog(Long idx) {
        blogRepository.deleteById(idx);
    }
}
