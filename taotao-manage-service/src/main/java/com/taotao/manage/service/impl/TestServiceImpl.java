package com.taotao.manage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.manage.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	//注入mapper
	@Autowired
	private TestService testService;

	@Override
	public String queryCurrentDate() {
		
		return testService.queryCurrentDate();
	}
	

}
