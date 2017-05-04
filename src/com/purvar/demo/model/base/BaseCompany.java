package com.purvar.demo.model.base;

public class BaseCompany {
	private String companyid;
	private String companyname;
	private String companytype;
	private String leagalperson;
	private String contactphone;
	private double registerfund;
	private String registertime;
	private String province;
	private String city;
	private String courty;
	private String address;
	@Override
	public String toString() {
		return "Company [companyid=" + companyid + ", companyname=" + companyname + ", companytype=" + companytype
				+ ", leagalperson=" + leagalperson + ", contactphone=" + contactphone + ", registerfund=" + registerfund
				+ ", registertime=" + registertime + ", province=" + province + ", city=" + city + ", courty=" + courty
				+ ", address=" + address + ", description=" + description + "]";
	}

	private String description;

	public String getCompanyid() {
		return companyid;
	}

	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getCompanytype() {
		return companytype;
	}

	public void setCompanytype(String companytype) {
		this.companytype = companytype;
	}

	public String getLeagalperson() {
		return leagalperson;
	}

	public void setLeagalperson(String leagalperson) {
		this.leagalperson = leagalperson;
	}

	public String getContactphone() {
		return contactphone;
	}

	public void setContactphone(String contactphone) {
		this.contactphone = contactphone;
	}

	public double getRegisterfund() {
		return registerfund;
	}

	public void setRegisterfund(double registerfund) {
		this.registerfund = registerfund;
	}

	public String getRegistertime() {
		return registertime;
	}

	public void setRegistertime(String registertime) {
		this.registertime = registertime;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCourty() {
		return courty;
	}

	public void setCourty(String courty) {
		this.courty = courty;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
