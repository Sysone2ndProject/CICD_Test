package com.example.cicd_test.board.service;

import com.example.cicd_test.board.dto.BoardDTO;
import com.example.cicd_test.board.entity.Board;
import com.example.cicd_test.board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Override
    public List<BoardDTO> getAllBoards() {
        return boardMapper.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private BoardDTO convertToDTO(Board board) {
        return BoardDTO.builder()
                .id(board.getId())
                .writer(board.getWriter())
                .title(board.getTitle())
                .content(board.getContent())
                .build();
    }

}