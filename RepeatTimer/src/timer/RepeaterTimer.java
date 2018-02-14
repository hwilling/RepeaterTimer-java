package timer;

import java.util.Timer;
import java.util.TimerTask;

public class RepeaterTimer {
	
	private int initialTime;
	private int iterateTime;
	
	//constructor for our timer
	RepeaterTimer(int intialTime, int iterateTime){
		this.initialTime = intialTime;
		this.iterateTime = iterateTime;
	}
	
	//function to start our timer
	public void startTimer(){
		Timer timer = new Timer();
		TimerTask task = new TimerTask(){
			@Override
			public void run() {
				//executed by timer
				//TODO switch to play random audio files
				System.out.println("Hello World");
			}
		};
		
		//start timer after intialTime and repeat the task after an amount of time specified by iterateTime
		timer.schedule(task, initialTime, iterateTime);
	}
}
