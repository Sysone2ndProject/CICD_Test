package com.example.cicd_test.board.mapper;

import com.example.cicd_test.board.entity.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<Board> findAll();
}
