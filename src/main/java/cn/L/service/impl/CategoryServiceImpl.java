package cn.L.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.L.mapper.CategoryMapper;
import cn.L.pojo.Category;
import cn.L.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService{
	@Autowired
	CategoryMapper categoryMapper;
	
	
	public List<Category> list(){
		return categoryMapper.list();
	}


}
