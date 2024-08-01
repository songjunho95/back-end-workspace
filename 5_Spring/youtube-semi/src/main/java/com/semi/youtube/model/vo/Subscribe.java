package com.semi.youtube.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Subscribe {
	private int subcode;
	private String id; // member
	private int channelCode; // channel
}
