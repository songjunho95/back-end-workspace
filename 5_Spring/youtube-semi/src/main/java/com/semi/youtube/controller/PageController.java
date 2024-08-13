package com.semi.youtube.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kh.mybatis.model.vo.Member;
import com.semi.youtube.service.VideoService;

import jakarta.servlet.http.HttpSession;

@Controller
public class PageController {
	
	@Autowired
	private VideoService video;
	
	@GetMapping("/")
	public String index(Model model) {
		System.out.println(video.allVideo());
		model.addAttribute("list", video.allVideo());
		return "index";
	}
	
	// 비디오 1개 보여주기
	// 좋아요 관련 정보 가져오기
	// 구닥자수, 구독 관련 정보 가져오기
	
	@GetMapping("/{videoCode}")
	public String detail(@PathVariable("videoCode") int videoCode, Model model) {
		
		Video da = video.detail(videoCode);
		
		
		
		
		model.addAttribute("video", data);
		model.addAttribute("list", video.allVideo());
		model.addAllAttributes("count", video.count(data.getChannel().getChannelCode()));
		
		
		
		HttpSession session = request.getSession();
		Member member = (Member) session.getAttribute("vo");
		VideoLike like = null;
		Subscribe sub = null;
		
		if(member!=null) {
			video.checkLike(VideoLike.builder()
					 .id(null)
					 .videoCode(videoCode)
					 .build());
			
			sub = video.check(Subscribe.builder()
					.id(member.getId())
					.channelCode(data.getChannel().getChannelCode())
					.bulid());
		}
		model.addAllAttributes("like", like);
	
		return "detail";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

}