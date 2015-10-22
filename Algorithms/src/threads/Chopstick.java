package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {
	
	Lock lock;
	
	public Chopstick(){
		lock=new ReentrantLock();
	}
	
	public boolean pickUp(){
		return lock.tryLock();
	}
	
	public void putDown(){
		lock.unlock();
	}
	

}
