package Object;

public class Main {

	public static void main(String[] args) {
		Point originOne = new Point(23,90);
		System.out.println(originOne.x);
	}
	
	public static class Point{
		int x=0;
		int y =0;
		
		public Point(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}

}
