package practice_8th_week.problem01;

public class Box {
	private int width;
	private int height;
	private int depth;
	
	public void setSize(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getDepth() {
		return depth;
	}	
	
	public int getVolume() {
		return width * height * depth;
	}
	
	public String getName() {
		return "Box["+width+","+height+","+depth+"]";
	}
	
	public boolean canPutIn(Box box) {
		return (this.width < box.getWidth() &&
				this.height < box.getHeight() &&
				this.depth < box.getDepth());
	}
}
