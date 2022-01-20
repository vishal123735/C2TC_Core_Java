package prince;

class Box {
	float width;
	float height;
	float depth;
	float calcVol() {
		return width*height*depth;
	}
}

public class BoxDemo {

	public static void main(String[] args) {
		Box box1=new Box();
		box1.width=3.4f;
		box1.height=2.2f;
		box1.depth=1.4f;
		float vol= box1.calcVol();
		System.out.println(" volume of b0x1 is " + vol);
		
		
		Box box2=new Box();
		box2.width=4.4f;
		box2.height=5.5f;
		box2.depth=6.6f;
		float vol2=box2.calcVol();
		System.out.println("volume of box2 is " + vol2);
		
				

	}

}
