package com.exemplo.threadlab;

public class ThreadLab extends Thread {
	public ThreadLab(String a) {
		super(a);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			metodoAuxiliar();
		}
	}

	private synchronized void metodoAuxiliar() {
		System.out.println(Thread.currentThread().getName());
	}

}

/*
 * System.out.println(getName()); try { Thread.sleep(500); } catch
 * (InterruptedException e) { e.printStackTrace(); }
 */