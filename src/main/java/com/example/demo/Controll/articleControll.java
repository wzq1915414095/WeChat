package com.example.demo.Controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.articleDao;
import com.example.demo.pojo.article;

@RestController
public class articleControll {

	@Autowired
	articleDao articleDao;
	
	@RequestMapping("articles")
	@Cacheable(value = "articles")
	public List<article> articles(){
		return articleDao.findByPid(0);
	}
	
	@RequestMapping("articledetail")
	@Cacheable(value = "articles")
	public List<article> articledetail(int rootid){
		return articleDao.findByRootid(rootid);
	}
}
