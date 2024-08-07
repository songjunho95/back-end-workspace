<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"/ >
	<main>
		<video src="${video.videoUrl}" contorls></video>
		<h2>${video.videoTitle}</h2>
		<div class = "detail-desc-left">
			<img src="${video.channel.channelImg}" /> 
			<div class = "channel-desc">
				<h3>${video.channel.channelName}</h3>
				<p>구독자 0명</p>
		</div>
		<button>구독</button>
	</div>
	<div class = "video-detail-info">
		${video.videoDesc}
	</div>
	<div class = "video-list">
		<c:forEach items="${list}" var = "video">
			<a href="/${video.videoCode}" class = "video-list-card">
			<img src = "${video.videoImg}" />
			<div class = "video-list-desc">
				<h4>${video.videoTitle}</h4>
				<p>${video.channel.channelName}</p>
				<p>조회수 ${video.videoCount}회 ${video.Date}</p>
				<p class="video-meta" date-video-date="${video.videoDate}" >
					조회수 ${video.videoCount}회 <span class="video-date"></span>
				</p>
			</div>
			
			</a>
		</c:forEach>
	</div>
</main>
</body>
</html>