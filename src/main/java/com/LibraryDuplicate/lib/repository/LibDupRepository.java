package com.LibraryDuplicate.lib.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LibraryDuplicate.lib.Entity.LibDup;


@Repository
public interface LibDupRepository extends JpaRepository<LibDup, String> {

	

	


}
