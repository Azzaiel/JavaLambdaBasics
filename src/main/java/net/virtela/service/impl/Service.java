package net.virtela.service.impl;

public class Service {
	
	protected static final int ONE_SECCOND = 1_000;
	
	protected void delay(int seconds) {
		try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
