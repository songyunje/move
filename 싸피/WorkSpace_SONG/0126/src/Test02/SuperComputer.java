package Test02;

public class SuperComputer implements HdmiInput {
	
	
	private HdmiOutput device;
	
	// ex
//	private Monitor device2;
	
	@Override
	public void setOutput(HdmiOutput device) {
		this.device = device;
		
	}

	@Override
	public void show() {
		System.out.print("슈퍼컴퓨터의 화면을 ");
		device.output();
		
	}
	

}
