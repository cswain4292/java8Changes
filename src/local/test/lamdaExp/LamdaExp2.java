package local.test.lamdaExp;

interface CircleDrawable {
	public void draw(int size);
}

public class LamdaExp2 {
	public static void main(String[] args) {
		CircleDrawable cd = (size) -> {
			System.out.println("Drawing circle of size : "+ size);
		};
		
		cd.draw(10);
	}
}
