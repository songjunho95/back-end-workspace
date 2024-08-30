package com.kh.fileupload.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.fileupload.model.vo.Board;

import mapper.BoardMapper;

@Service
public class BoardService {

	
	@Autowired
	private BoardMapper mapper;
	
	public void insert(Board vo) {
		mapper.insert(vo);
	}
}
