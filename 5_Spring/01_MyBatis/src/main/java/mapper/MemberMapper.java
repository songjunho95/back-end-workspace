package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kh.mybatis.model.dto.SearchDTO;
import com.kh.mybatis.model.vo.Member;

@Mapper
public interface MemberMapper {
	void register(Member member);
	List<Member> allMember();
	Member login(Member member);
	void update(Member member);
	List<Member> search(SearchDTO dto);
	void delete(List<String> idList);
}



