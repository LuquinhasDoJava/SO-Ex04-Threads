package view;

import controller.ThreadsSapo;

public class Main {

	public static void main(String[] args) {
		
		for(int x = 0; x <5 ; x++) {
			ThreadsSapo threadsSapo = new ThreadsSapo(x);
			threadsSapo.start();
		}
	}

}
