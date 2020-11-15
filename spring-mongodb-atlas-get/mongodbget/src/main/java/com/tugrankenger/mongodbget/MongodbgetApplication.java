package com.tugrankenger.mongodbget;

import com.tugrankenger.mongodbget.repository.LostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MongodbgetApplication implements CommandLineRunner{

	@Autowired
	private LostRepository lostRepository;
	public static void main(String[] args) {
		SpringApplication.run(MongodbgetApplication.class, args);
	}

	@Override
	public void run(String...strings) throws Exception{
		System.out.println(lostRepository.findAll());
	}

}
