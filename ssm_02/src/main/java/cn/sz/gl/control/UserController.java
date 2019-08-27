package cn.sz.gl.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.sz.gl.pojo.Users;
import cn.sz.gl.service.IUserService;

@Controller
@RequestMapping("/uc")
public class UserController {

	@Autowired
	private IUserService userServiceImpl;
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String islogin(Users u,HttpServletRequest request){
		Users users = userServiceImpl.islogin(u);
		if(users!=null){
			request.getSession().setAttribute("myusers", users);
			return "suc";
		}
		return "login";
	}
}
