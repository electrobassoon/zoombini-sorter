
public class Zoombini {

	public enum Hair{
		CURLY, STRAIGHT, PONYTAIL, HAT, SPIKY
	}
	
	public enum Eye{
		SINGLE, OPEN, DROOPY, GLASSES, SUNGLASSES
	}
	public enum Nose{
		ORANGE, WHITE, GREEN, BLUE, PURPLE
	}
	public enum Feet{
		PINK, GREEN, WHEELS, SPRING, FLYER
	}
	private Hair hair;
	private Eye eye;
	private Nose nose;
	private Feet feet;
	
	public Zoombini(){	
	}
	
	public Zoombini(Hair hairType, Eye eyeType, Nose noseType, Feet feetType){
		hair = hairType;
		eye = eyeType;
		nose = noseType;
		feet = feetType;
		
	}
	public Hair getHair() {
		return hair;
	}
	public void setHair(Hair hairType) {
		this.hair = hairType;
	}
	public Eye getEye() {
		return eye;
	}
	public void setEye(Eye eyeType){
		this.eye = eyeType;
	}
	public Nose getNose() {
		return nose;
	}
	public void setNose(Nose noseType){
		this.nose = noseType;
	}
	public Feet getFeet(){
		return feet;
	}
	public void setFeet(Feet feetType){
		this.feet = feetType;
	}
}
