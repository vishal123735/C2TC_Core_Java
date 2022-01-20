package prince;
class bicycle {
	int gear;
	int speed;
	public bicycle(int gear, int speed) {
		
		this.gear = gear;
		this.speed = speed;
	}
			void applyBreak(int decrement)
			{
				speed-=decrement;
			}
			void speedup(int increment) 
			{
			speed+=increment;	
			}
			@Override
			public String toString() {
				return "bicycle [gear=" + gear + ", speed=" + speed + "]";
			}
			
	
}
class MountainBike extends bicycle
{
	int seatHeight;

	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
	}
	void adjustHeight(int value)
	{
		seatHeight=value;
	}
	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + ", gear=" + gear + ", speed=" + speed + "]";
	}
	class PulsarBike extends MountainBike
	{
		int bikeWeight;

		public PulsarBike(int gear, int speed, int seatHeight, int bikeWeight) {
			super(gear, speed, seatHeight);
			this.bikeWeight = bikeWeight;
		}
		void takeWeight(int value)
		{
			bikeWeight=value;
		}
		@Override
		public String toString() {
			return "PulsarBike [bikeWeight=" + bikeWeight + ", seatHeight=" + seatHeight + ", gear=" + gear + ", speed="
					+ speed + "]";
		}
		
	}
	
	
}

public class InheritanceDemo {

	public static void main(String[] args) {
		MountainBike bike=new MountainBike(5,160,10);
		bike.speedup(10);
		bike.applyBreak(5);
		
		System.out.println(bike.toString());
		
	}

}
