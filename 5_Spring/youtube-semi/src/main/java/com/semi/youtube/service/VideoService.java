package com.semi.youtube.service;

import org.springframework.stereotype.Service;

import mapper.VideoMapper;

@Service
public class VideoService {
	
	
	
	@Autowirde
	private VideoMapper video;
	
	@Autowirde
	private ViedoLikeMapper like;
	
	public List<Video> allVideo() {
		return video.allVideo();
		
	public Video detail(int videoCode) {
		retunr video.detail(videoCode);
	}	
	
	public void like(VideoLike vo) {
		like.like(vo);
	}
	
	public VideoLike checkLike(VideoLike vo) {
		return like.check(vo);
	}
	
	public void unlike(int code) {
		like.unlike(code);
	}
	
	
	
	
	
		
	@GetMapping("/{}videoCode")
	public String detail(@PathVariable("videoCode") int videoCode, Model model) {
		model.addAttribute("video", video.detail(videoCode));
		model.addAttribute("list", video.allvideo());
		return "detail";
		
			
		}

	
}
