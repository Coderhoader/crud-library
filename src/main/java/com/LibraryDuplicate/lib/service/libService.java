package com.LibraryDuplicate.lib.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LibraryDuplicate.lib.Entity.LibDup;
import com.LibraryDuplicate.lib.repository.LibDupRepository;

@Service
public class libService {

	
	@Autowired
	LibDupRepository libRepository;
	
	
	public List<LibDup> libdup = new ArrayList<LibDup>();
	
	public List<LibDup> getAll() {
		
		return libRepository.findAll();
		
	}
	public String add(LibDup dup) {
		libRepository.save(dup);
		return "Successfully Added!";
	}
//	public String edit(LibDup dup) {
//		
//		libdup.stream().filter(l -> l.getId() == dup.getId()).forEach(l -> {
//			l.setBook_name(dup.getBook_name());
//			l.setId(dup.getId());
//			l.setIsbn(dup.getIsbn());
//			l.setAisle(dup.getAisle());
//			l.setAuthor(dup.getAuthor());
//		});
//		return "Successfully Updated!";
//	}
	public String delete(String dupno) {
		libRepository.deleteById(dupno);
		return "Successfully Deleted!";
	}
	public String update(String id, LibDup dup) {
		libRepository.save(dup);
		return "Successfully updated!!";
	}
	
	
	
	

}
