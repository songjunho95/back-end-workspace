package mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kh.mybatis.model.vo.Member;

@Mapper
public interface MemberMapper {
	
	
	
	
	void register(Member vo);
	Member login(String id);
	
}
