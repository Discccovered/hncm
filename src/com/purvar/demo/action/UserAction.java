/**
 * 
 */
package com.purvar.demo.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.purvar.demo.action.base.BaseAction;
import com.purvar.demo.model.PageObject;
import com.purvar.demo.model.User;
import com.purvar.demo.service.UserService;
import com.purvar.demo.util.GlobalGlossary;

/**
 * @author chengfan
 *
 */
@Controller
@Scope("prototype")
public class UserAction extends BaseAction {

	private static final long serialVersionUID = 4398583357767666616L;

	@Autowired
	private UserService userService;

	private String account;
	private String password;
	private String message;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	public void Login() throws Exception {
		Map<String, Object> respMap = new HashMap<>();
		try {
			User user = new User();
			user.setAccount(account);
			user.setPwd(password);
			System.out.println(user);
			String res = userService.login(user);
			this.message = account + " login :" + res;
			respMap.put("res", res);
		} catch (Exception e) {
			respMap.put("status", "0");
			respMap.put("message", "");
			logger.error(e);
		}
		writeJSON(respMap);
	}

	/**
	 * get all user list
	 * 
	 * @throws Exception
	 */
	public void getUserList() throws Exception {
		Map<String, Object> respMap = new HashMap<String, Object>();
		try {

			String page = this.request.getParameter("page");
			String pageSize = this.request.getParameter("rows");
			if (page == null || "".equals(page))
				page = "1";
			if (pageSize == null || "".equals(pageSize))
				pageSize = "10";

			PageObject pageObj = new PageObject();
			pageObj.setPage(Integer.parseInt(page) - 1);
			pageObj.setPageSize(Integer.parseInt(pageSize));
			// 查询订单详情信息
			List<User> userList = this.userService.getUserList(pageObj);
			respMap.put("status", "1");
			respMap.put("message", "获得成功！");
			respMap.put("data", userList);

		} catch (Exception e) {
			respMap.put("status", "0");
			respMap.put("message", "获得订单详情失败！");
			logger.error(e);
		}

		writeJSON(respMap);
	}

}
