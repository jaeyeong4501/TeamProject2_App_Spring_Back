package com.busanit.controller;

import com.busanit.domain.BlogDTO;
import com.busanit.domain.BlogReplyDTO;
import com.busanit.domain.BoardDTO;
import com.busanit.entity.Blog;
import com.busanit.entity.BlogReply;
import com.busanit.entity.Board;
import com.busanit.repository.BlogRepository;
import com.busanit.service.BlogReplyService;
import com.busanit.service.BlogService;
import com.busanit.service.BoardService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
@AllArgsConstructor
//@CrossOrigin(origins = "http://localhost:3000")
public class BlogRestController {

    private BlogService blogService;
    private BoardService boardService;
    private BlogReplyService blogReplyService;

    @RequestMapping("/test1")
    public String runTest() {
        return "리액트 연동 테스트3" +
                "";
    }

    @GetMapping("/list")
    public List<Blog> getBlogList() {
        return blogService.getBlogList();
    }

    @GetMapping("/searchList")
    public List<Blog> getBlogSearchList(String searchText) {
        return blogService.getBlogSearchList(searchText);
    }

    @GetMapping("/get")
    public Blog getBlog(Long idx) {
        return blogService.getBlog(idx);
    }



    @PostMapping("/write")
    public void writeBlog(@RequestBody BlogDTO blogDTO) {
        blogService.writeBlog(blogDTO);
    }




   //-------------------board write----------------------------
    // 1차 완성, 뼈대.
    @PostMapping("/boardWrite")
    public void writeBoard(@RequestBody BoardDTO boardDTO) {
        blogService.writeBoard(boardDTO);
    }



    // 보드 하나 가져오기.
    @GetMapping("/getBoard/{idx}")
    public Board getBoard(@PathVariable("idx")Long idx) {
        return boardService.getBoard(idx);
    }

    // 보드 여러개 들고 오기.
    @GetMapping("/boardList")
    public List<Board> getBoardList() {
        return boardService.getBoardList();
    }


    //----------------------------------------------------------------

    @GetMapping("/remove")
    public void removeBlog(Long idx) {
        blogService.removeBlog(idx);
    }

//    @GetMapping("/replyList")
//    public List<BlogReply> getBlogReplyList(Long blogIdx) {
//        return blogReplyService.getBlogReplyList(blogIdx);
//    }

    @PostMapping("/replyWrite")
    public void writeReply(@RequestBody BlogReplyDTO blogReplyDTO) {
        blogReplyService.writeReply(blogReplyDTO);
    }

    @GetMapping("/removeReply")
    public void removeReply(Long rIdx) {
        blogReplyService.removeReply(rIdx);
    }
}
