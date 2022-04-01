package com.LibraryDuplicate.lib;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.LibraryDuplicate.lib.Entity.LibDup;
import com.LibraryDuplicate.lib.repository.LibDupRepository;


@SpringBootApplication
public class LibApplication implements CommandLineRunner{

	@Autowired
	LibDupRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(LibApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		LibDup ld1 = new LibDup("hello world", "suh436","suh",436,"Suhrudh");
//		LibDup ld2 = new LibDup("new world", "suh346","suh",346,"Suhrudh");
//		
//		repository.libdup.addAll(Arrays.asList(ld1, ld2));
		
	}

	

}
