package com.semi.youtube.service;

import org.springframework.stereotype.Service;

import mapper.VideoMapper;

@Service
public class VideoService {
	
	
	
	@Autowirde
	private VideoMapper video;
	
	public List<Video> allVideo() {
		return video.allVideo();
		
		
	@GetMapping("/{}videoCode")
	public String detail(@PathVariable("videoCode") int videoCode, Model model) {
		model.addAttribute("video", video.detail(videoCode));
		model.addAttribute("list", video.allvideo());
		return "detail";
		
	}
		
		
	}

}
