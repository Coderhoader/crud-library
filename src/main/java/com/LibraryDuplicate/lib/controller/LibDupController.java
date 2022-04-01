package com.LibraryDuplicate.lib.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.LibraryDuplicate.lib.Entity.LibDup;
import com.LibraryDuplicate.lib.service.libService;


@RestController
@RequestMapping("/lib")
public class LibDupController {

	@Autowired
	libService libserv;
	
	
	  
	  @GetMapping("/retrieve")
	  public List<LibDup> getAll(){
		  return libserv.getAll();
	  }
	  
	  
	  @PostMapping("/add")
	  public String add(@RequestBody LibDup dup){
		  return libserv.add(dup);
	  }
	  
//	  @PutMapping("/edit")
//	  public String edit(@RequestBody LibDup dup){
//		  return libserv.edit(dup);
//	  }	  
	  
	  @PutMapping("/update/{id}")
	  public String update(@PathVariable String id ,@RequestBody LibDup dup){
		  return libserv.update(id,dup);
	  }
	  
	  
	  @DeleteMapping("/delete")
	  public String delete(@RequestParam String dupno){
		  return libserv.delete(dupno);
	  }
	  
	  
	  
}

