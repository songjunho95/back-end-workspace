package exam;

public class Rectangle {
	public int width;
	public int height;
	
	protected Rectangle(int width, int height) {
		
		this.width = width;
		this.height = height;
		
	}
	
	private void getWidth() {
		this.width = width;
	}
	
	private int setWidth(int width) {
		return width;
	}
	
	private void getHeight() {
		this.height = height;
		
	}
	
	private int setHeight(int height) {
		return height;
		
	}
	
	
}