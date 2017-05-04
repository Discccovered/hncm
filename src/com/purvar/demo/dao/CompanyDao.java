package com.purvar.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.purvar.demo.model.Company;
import com.purvar.demo.model.PageObject;
import com.purvar.demo.model.base.BaseArea;
import com.purvar.demo.model.base.BaseCompany;
import com.purvar.demo.model.base.BaseCompanyType;

@Repository
public interface CompanyDao {
//	@Select("SELECT *	 FROM t_users 	 	 limit #{pageSize} offset #{page}")
	List<Company> getCompanyList(PageObject pageObject);
	
	@Select("select count (companyid) from company")
	long getCompanyNum();
	
	@Select("SELECT c.*,ct.*,a1.name as provincename	,a2.name as cityname,a3.name as courtyname FROM company c left join companytype ct on c.companytype=ct.type left join area a1 on a1.code=c.province left join area a2 on a2.code=c.city left join area a3 on a3.code=c.courty where companyid=#{id} 	 ")
	Company getCompany(String id);
	
	@Select("select type,typename from companytype")
	List<BaseCompanyType> getTypeList();
	
	@Select("select * from area where supercity=#{code}")
	List<BaseArea> getAreaList(String code);

	@Update("UPDATE company SET  companyname=#{companyname}, companytype=#{companytype}, leagalperson=#{leagalperson}, contactphone=#{contactphone}, registerfund=#{registerfund}, registertime=#{registertime}, province=#{province}, city=#{city}, courty=#{courty}, address=#{address}, description=#{description} WHERE (companyid=#{companyid});")
	void updateCompany(BaseCompany company);
}
