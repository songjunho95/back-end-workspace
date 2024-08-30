package mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.javassist.compiler.ast.Member;

@Mapper
public interface MemberMapper {

	Member idCheck(String id);
	void register(Member vo);
	
	
}
