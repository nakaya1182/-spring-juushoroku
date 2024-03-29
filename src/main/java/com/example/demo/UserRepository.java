package com.example.demo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, String>{
	Page<User> findAll(Pageable pageable);
	Page<User> findByAddContaining(Pageable pageable,String searchWord);
	User findById(Integer id);
}

