package com.kh.fileupload.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.kh.fileupload.service.BoardService;

@Controller
public class BoardController {

	private String path="\\\\192.168.10.51\\upload\\";
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/")
	public String index() {
			return "index";
	}
	
	public String fileUpload(MultipartFile file) {
		// 중복 방지를 위한 UUID 적용
		UUID uuid = UUID.randomUUID();
		String fileName = uuid.toString() + "_" + file.getOriginalFilename();
		return fileName;
	}
	
	@PostMapping("/upload")
	public String upload(MultipartFile file) {
		System.out.println("upload!");
		System.out.println("파일 이름 : " + file.getOriginalFilename());
		System.out.println("파일 사이즈 : " + file.getSize());
		System.out.println("파일 파라미터명 : " + file.getName());
		
		fileUpload(file);
		
		return "redirect/";
		
		
	}
	
	
	
	
}
