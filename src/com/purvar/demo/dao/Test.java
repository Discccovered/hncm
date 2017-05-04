package com.purvar.demo.dao;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.purvar.demo.model.PageObject;
import com.purvar.demo.service.CompanyService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-*.xml")
public class Test {

	@Autowired
	CompanyService companyService;
	
	@org.junit.Test
	public void testCompanyDao(){
		assertNotNull(companyService);
		PageObject pageObject = new PageObject();
		pageObject.setPage(1);
		pageObject.setPageSize(10);
		companyService.getCompanyList(pageObject);
	}
}
