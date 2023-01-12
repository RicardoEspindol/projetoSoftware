package umPontoOito;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour,minute,second);
	}

	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public Time nextSecond() {
		this.setSecond(this.getSecond()+1);
		if(this.getSecond()==60) {
			this.setSecond(0);
			this.setMinute(this.getMinute()+1);
			if(this.getMinute()==60) {
				this.setMinute(00);
				this.setHour(this.getHour()+1);
				if(this.getHour()==24) {
					this.setHour(00);
				}
			}
		}
		return this;
	}
	public Time previousSecond() {
		this.setSecond(this.getSecond()-1);
		if(this.getSecond()==-1) {
			this.setSecond(59);
			this.setMinute(this.getMinute()-1);
			if(this.getMinute()==-1) {
				this.setMinute(59);
				this.setHour(this.getHour()-1);
				if(this.getHour()==-1) {
					this.setHour(24);
				}
			}
		}
		return this;
	}
	
}
