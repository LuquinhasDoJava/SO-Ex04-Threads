package controller;

import java.util.Random;

public class ThreadsSapo extends Thread {
	int sapo;
	int chegada =  1000;
	int disPercorrida = 0;
	
	public ThreadsSapo(int x) {
		sapo = x;
	}
	public void run() {
		int salto;
		Random random = new Random();
		do {
			salto = random.nextInt(0,10);
			disPercorrida += salto;
			System.out.println("Sapo "+sapo+" saltou:"+salto+" Distancia total percorrida de:"+disPercorrida+" metros");
		}while(disPercorrida<chegada);
		try {
			ThreadsSapo.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Sapo: "+sapo+" terminou");
	}

}
