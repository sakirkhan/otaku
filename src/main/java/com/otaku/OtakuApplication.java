package com.otaku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OtakuApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(OtakuApplication.class, args);
		} catch (Exception e){
			e.printStackTrace ();
		}
	}

}
