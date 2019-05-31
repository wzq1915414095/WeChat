package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.article;

public interface articleDao extends JpaRepository<article, Integer>{
			List<article> findByPid(int pid);
			
			List<article> findByRootid(int rootid);
			
}
