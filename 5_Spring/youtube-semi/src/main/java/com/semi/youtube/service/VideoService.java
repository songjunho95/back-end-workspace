package com.semi.youtube.service;

import org.springframework.stereotype.Service;

@Service
public class VideoService {
	
	
	
	@Autowirde
	private VideoMapper video;
	
	public List<Video> allVideo() {
		return video.allVideo();
		
	}

}
