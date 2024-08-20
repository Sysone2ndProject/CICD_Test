package com.example.cicd_test.board.service;

import com.example.cicd_test.board.dto.BoardDTO;

import java.util.List;

public interface BoardService {
    List<BoardDTO> getAllBoards();
}
