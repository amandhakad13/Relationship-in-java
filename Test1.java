class Device {
	String deviceName;
	
	Device(String deviceName) {
		this.deviceName = deviceName;
	}
}

class Mobile extends Device {
	
	Mobile(String deviceName) {
		super(deviceName);
	}
	
	public String toString() {
		return "Divice name = "+deviceName;
	}
}

class Test1 {
	public static void main(String[] args) {
		Mobile t = new Mobile("Realme C11");
		
		System.out.println(t.toString());
	}
}