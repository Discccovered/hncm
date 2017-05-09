package com.purvar.demo.action;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.purvar.demo.action.base.BaseAction;
import com.purvar.demo.model.Company;
import com.purvar.demo.model.PageObject;
import com.purvar.demo.model.base.BaseArea;
import com.purvar.demo.model.base.BaseCompany;
import com.purvar.demo.model.base.BaseCompanyType;
import com.purvar.demo.service.CompanyService;

@Controller
@Scope("prototype")
public class CompanyAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private CompanyService companyService;
	/**
	 * @throws Exception
	 * 
	 */

	private BaseCompany company;
	private String page;
	private String rows;
	private String companyid;
	private String code;

	public void getCompanyList() throws Exception {
		HashMap<String, Object> map = new HashMap<String, Object>();
		int pagenum = 1;
		int rownum = 10;
		if (page != null) {
			pagenum = Integer.parseInt(page);
		}
		if (rows != null) {
			rownum = Integer.parseInt(rows);
		}
		PageObject pageObject = new PageObject();
		pageObject.setPage((pagenum - 1) * rownum);
		pageObject.setPageSize(rownum);
		List<Company> companyList = companyService.getCompanyList(pageObject);
		long rowNum = companyService.getCompanyNum();
		map.put("rowNum", rowNum);
		map.put("data", companyList);
		map.put("status", "1");
		writeJSON(map);
	}

	public void getCompanyById() throws Exception {
		try {
			HashMap<String, Object> map = new HashMap<String, Object>();
			Company company = companyService.getCompanyById(companyid);
			map.put("company", company);
			writeJSON(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void getCompanyConfig() throws Exception {
		HashMap<String, Object> map = new HashMap<String, Object>();
		List<BaseCompanyType> typeList = companyService.getTypeList();
		List<BaseArea> areaList = companyService.getAreaList(code);
		map.put("typeList", typeList);
		map.put("areaList", areaList);
		writeJSON(map);
	}

	public void getTypeList() throws Exception {
		List<BaseCompanyType> typeList = companyService.getTypeList();
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("typeList", typeList);
		writeJSON(map);
	}

	public void getArea() throws Exception {
		List<BaseArea> areaList = companyService.getAreaList(code);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("areaList", areaList);
		writeJSON(map);
	}
	
	public void updateCompany() throws Exception{
		HashMap<String, Object> map = new HashMap<String, Object>();
		try {
			companyService.updataCompany(company);
			map.put("status", "1");
		} catch (Exception e) {
			e.printStackTrace();
			map.put("status", "0");
		}
		writeJSON(map);
	}
	
	public void insertCompany() throws Exception{
		HashMap<String, Object> map = new HashMap<String, Object>();
		try {
			companyService.insertCompany(company);
			map.put("status", "1");
		} catch (Exception e) {
			e.printStackTrace();
			map.put("status", "0");
		}
		writeJSON(map);
	}
	
	public void deleteOneRecord() throws Exception{
		HashMap<String, Object> map = new HashMap<String, Object>();
		try {
			companyService.deleteOneRecord(companyid);
			map.put("status", "1");
		} catch (Exception e) {
			map.put("status", "0");
		}
		writeJSON(map);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getRows() {
		return rows;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}

	public String getCompanyid() {
		return companyid;
	}

	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}

	public BaseCompany getCompany() {
		return company;
	}

	public void setCompany(BaseCompany company) {
		this.company = company;
	}

}
