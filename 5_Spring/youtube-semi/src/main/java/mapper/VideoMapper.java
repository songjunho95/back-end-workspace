package mapper;


@Mapper
public interface VideoMapper {
	List<Video> allvideo();
	Video detail(int videoCode);
	
}
