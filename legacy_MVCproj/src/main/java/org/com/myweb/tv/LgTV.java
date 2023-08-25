package org.com.myweb.tv;

public class LgTV implements TV {
	private Speaker speaker;
	
	public LgTV() {
		// TODO Auto-generated constructor stub
	}
	
	public LgTV(Speaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	@Override
	public void turnOn() {
		System.out.println("LG TV 켜기");
	}

	@Override
	public void turnOff() {
		System.out.println("LG TV 끄기");
	}

	@Override
	public void volumeUp() {
		speaker.soundUp();
	}

	@Override
	public void volumeDown() {
		speaker.soundDown();
	}
}
