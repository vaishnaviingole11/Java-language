class Time{
	int hour;
	int minute;
	int seconds;
	Time() {
		this.hour = 0;
		this.minute = 0;
		this.seconds = 0;
	}
	Time(int hour, int minute, int seconds) {
		this.hour = hour;
		this.minute = minute;
		this.seconds = seconds;
	}
	
	void add(Time t) {
		Time temp;
		temp=new Time();
		
		temp.hour=this.hour+t.hour;
		temp.minute=this.minute+t.minute;
		temp.seconds=this.seconds+t.seconds;
	}
	
	
}
class Test {
       public static void main(String[] args) {
		Time t1;
		t1=new Time(2,15,52);
		
		Time t2;
		t2=new Time(3,10,12);
		
		
		t1.add(t2);
	}
}