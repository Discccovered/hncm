package com.purvar.demo.service;

import java.util.List;

import com.purvar.demo.model.Company;
import com.purvar.demo.model.PageObject;
import com.purvar.demo.model.base.BaseArea;
import com.purvar.demo.model.base.BaseCompany;
import com.purvar.demo.model.base.BaseCompanyType;

public interface CompanyService {
	List<Company> getCompanyList(PageObject pageObject);
	
	long getCompanyNum();
	
	Company getCompanyById(String id);
	
	List<BaseCompanyType> getTypeList();
	
	List<BaseArea> getAreaList(String code);
	
	void updataCompany(BaseCompany company);
}
