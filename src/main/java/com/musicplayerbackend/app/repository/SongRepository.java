package com.musicplayerbackend.app.repository;

import com.musicplayerbackend.app.model.Song;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SongRepository extends MongoRepository <Song, String>{
	
	//boolean existsSongByTitle(String title);

}
