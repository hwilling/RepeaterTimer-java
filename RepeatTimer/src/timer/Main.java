package timer;

public class Main {
	public static void main(String args[]){
		int intialTime = 100;
		int repeatTimer = 100;
		RepeaterTimer repeaterTimer = new RepeaterTimer(intialTime, repeatTimer);
		repeaterTimer.startTimer();
	}
}
