package com.busanit.controller;

import com.busanit.domain.BlogDTO;
import com.busanit.domain.BlogReplyDTO;
import com.busanit.domain.BoardDTO;
import com.busanit.domain.BoardsDTO;
import com.busanit.entity.Blog;
import com.busanit.entity.Board;
import com.busanit.entity.Boards;
import com.busanit.service.BlogReplyService;
import com.busanit.service.BlogService;
import com.busanit.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")
@AllArgsConstructor
//@CrossOrigin(origins = "http://localhost:3000")
public class BoardRestController {

    private BlogService blogService;
    private BoardService boardService;
    private BlogReplyService blogReplyService;

    @RequestMapping("/test")
    public String runTest() {
        return "리액트 연동 테스트2";
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

    //board write
    // 1차 완성, 뼈대.
    @PostMapping("/boardWrite")
    public void writeBoard(@RequestBody BoardDTO baordDTO) {
        blogService.writeBoard(baordDTO);
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


    //boards write
    @PostMapping("/boardsWrite")
    public void writeBoards(@RequestBody BoardsDTO boardsDTO) {
        boardService.writeBoards(boardsDTO);
    }


    // 보드s 하나 가져오기.
    @GetMapping("/getBoards/{idx}")
    public Boards getBoards(@PathVariable("idx")Long idx) {
        return boardService.getBoards(idx);
    }

    // 보드 여러개 들고 오기.
    @GetMapping("/boardsList")
    public List<Boards> getBoardsList() {
        return boardService.getBoardsList();
    }

    //

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
