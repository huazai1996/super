package org.springmvc.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springmvc.join.User;

@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/index")
	public ModelAndView index() throws Exception{
		System.out.println("����������,����");
		ModelAndView modelAndView = new ModelAndView("welcome");
		modelAndView.addObject("info", "����������?");
		return modelAndView;
	}
	
	@RequestMapping("view")
	public String view(Integer id, ModelMap modelMap) throws Exception{
		User user = new User();
		user.setId(5);
		user.setName("����");
		user.setHobbies(new String[] {"����","��ɽ"});
		user.setBirthday(new Date());
		user.setMarried(true);
		
		modelMap.put("user", user);
		return "welcome";
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login(String name,String pwd,HttpSession session) throws Exception{
		if (name.equals("haha")&&pwd.equals("aa")) {
			session.setAttribute("login_uer", name);
			return "redirect:/hehe.jsp";
		}
		return "view";
	}
	
	@RequestMapping("/regist")
	public String regist(User user) throws Exception{
		System.out.println(user);
		return "redirect:/user/index";
	}
}
