package com.smhrd.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.smhrd.board.domain.Board;

@Mapper
public interface BoardMapper {
   
   public int write(Board b); 
   public List<Board> writelist();
}