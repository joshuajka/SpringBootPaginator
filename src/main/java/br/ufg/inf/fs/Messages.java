package br.ufg.inf.fs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class Messages {

	public static Properties props = load();
	
	private static Properties load() {
		Properties props = new Properties();
		try {
			FileInputStream fs = new FileInputStream("src/main/resources/messages.properties");
			props.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return props;
	}
	
	public static String get(String key) {
		System.out.println(key);
		System.out.println(props);
		return props.getProperty(key);
	}
	
}
