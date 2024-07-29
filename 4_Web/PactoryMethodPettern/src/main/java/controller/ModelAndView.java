package controller;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Seteer
public class ModelAndView {
	
	private String path;
	private boolean isRedirect;
	
	// path만 가지는 생성자
	public ModelAndView(String path) {
		this.path = path;
		this.isRedirect = false;
	}
	
	
}
