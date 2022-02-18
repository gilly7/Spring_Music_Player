package com.musicplayerbackend.app;

import com.musicplayerbackend.app.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicPlayerBackendApplication {
	
	
	@Autowired
	
	private static SongRepository songRepository;

	public static void main(String[] args) {
		SpringApplication.run(MusicPlayerBackendApplication.class, args);
		
			}

}
