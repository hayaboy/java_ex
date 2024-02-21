package jungsuk.ch06;

public class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	void turnOnOff() {
		this.isPowerOn = !this.isPowerOn ? false : true; 
		
	}

	void volumeUp() {
		if(volume < MAX_VOLUME) {
			this.volume++;
		}
	
	}

	void volumeDown() {
		if(volume > MIN_VOLUME) {
			this.volume--;
		}
	}

	void channelUp() {
		
		
		if(this.channel==MAX_CHANNEL) {
			this.channel=MIN_CHANNEL;
		}
		this.channel++;
		
	}

	void channelDown() {
				
		if(this.channel==MIN_CHANNEL) {
			this.channel=MAX_CHANNEL;
		}
		this.channel--;
	}

}
