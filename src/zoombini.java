
public class zoombini {

	private String hair;
	private String eye;
	private String nose;
	private String feet;
	
	public zoombini(){	
	}
	
	public zoombini(String hairType, String eyeType, String noseType, String feetType){
		hair = hairType;
		eye = eyeType;
		nose = noseType;
		feet = feetType;
		
	}
	public String getHair() {
		return hair;
	}
	public void setHair(String hairType) {
		this.hair = hairType;
	}
	public String getEye() {
		return eye;
	}
	public void setEye(String eyeType){
		this.eye = eyeType;
	}
	public String getNose() {
		return nose;
	}
	public void setNose(String noseType){
		this.nose = noseType;
	}
	public String getFeet(){
		return feet;
	}
	public void setFeet(String feetType){
		this.feet = feetType;
	}
}
