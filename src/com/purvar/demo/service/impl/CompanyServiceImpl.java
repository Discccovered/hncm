package com.purvar.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.purvar.demo.dao.CompanyDao;
import com.purvar.demo.model.Company;
import com.purvar.demo.model.PageObject;
import com.purvar.demo.model.base.BaseArea;
import com.purvar.demo.model.base.BaseCompany;
import com.purvar.demo.model.base.BaseCompanyType;
import com.purvar.demo.service.CompanyService;

@Service("companyService")
@Transactional
public class CompanyServiceImpl implements CompanyService {
	
	@Resource
	CompanyDao company;
	
	@Override
	public List<Company> getCompanyList(PageObject pageObject) {
		return company.getCompanyList(pageObject);
	}

	public long getCompanyNum(){
		return company.getCompanyNum();
	}
	
	public Company getCompanyById(String id){
		return company.getCompany(id);
	}

	public List<BaseCompanyType> getTypeList() {
		return company.getTypeList();
	}

	@Override
	public List<BaseArea> getAreaList(String code) {
		return company.getAreaList(code);
	}

	@Override
	public void updataCompany(BaseCompany company) {
		this.company.updateCompany(company);
	}
	
}