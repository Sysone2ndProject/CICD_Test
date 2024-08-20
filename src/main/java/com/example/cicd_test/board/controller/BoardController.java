package com.example.cicd_test.board.controller;

import com.example.cicd_test.board.dto.BoardDTO;
import com.example.cicd_test.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/list")
    public String list(Model model) {
        List<BoardDTO> boards = boardService.getAllBoards();
        for(BoardDTO board : boards){
            System.out.println(board.toString());
        }
        model.addAttribute("boards", boards);
        return "board/list";
    }

}