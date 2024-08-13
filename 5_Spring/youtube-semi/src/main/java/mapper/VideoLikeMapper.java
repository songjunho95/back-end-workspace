package mapper;

import org.apache.ibatis.annotations.Mapper;


import com.semi
@Mapper
public interface VideoLikeMapper {
	
	void like(VideoLike vo);
	VideoLike check(VideoLike vo);
	void unlike(int code);
}