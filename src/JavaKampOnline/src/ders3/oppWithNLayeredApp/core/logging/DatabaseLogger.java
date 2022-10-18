package ders3.oppWithNLayeredApp.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanina loglandi : " +data);
		
		
	}

}
