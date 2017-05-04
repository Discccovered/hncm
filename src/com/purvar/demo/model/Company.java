package com.purvar.demo.model;

import com.purvar.demo.model.base.BaseCompany;

public class Company extends BaseCompany {

	private String cityname;
	private String provincename;
	private String courtyname;
	private String typename;
	
	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getProvincename() {
		return provincename;
	}

	public void setProvincename(String provincename) {
		this.provincename = provincename;
	}

	@Override
	public String toString() {
		return "Company [companyid=" + getCompanyid() + ", companyname=" + getCompanyname() + ", companytype=" + getCompanytype()
				+ ", leagalperson=" + getLeagalperson() + ", contactphone=" + getContactphone() + ", registerfund=" + getRegisterfund()
				+ ", registertime=" + getRegistertime() + ", province=" + getProvince() + ", city=" + getCity() + ", courty=" + getCourty()
				+ ", address=" + getAddress() + ", description=" + getDescription() + "cityname=" + cityname + ", provincename=" + provincename + ", courtyname=" + courtyname
				+ ", typename=" + typename + "]";
	}

	public String getCourtyname() {
		return courtyname;
	}

	public void setCourtyname(String courtyname) {
		this.courtyname = courtyname;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

}
