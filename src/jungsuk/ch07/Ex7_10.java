package jungsuk.ch07;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	private int prevChannel;

	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
			return;
		prevChannel = this.channel;
		System.out.println("이전채널"+prevChannel);
		this.channel = channel;
		System.out.println("현재채널"+ this.channel);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if (volume > MAX_VOLUME || volume < MIN_VOLUME)
			return;

		this.volume = volume;
	}

	void gotoPrevChannel() {
		setChannel(prevChannel);
	}
}

public class Ex7_10 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());

	}

}
