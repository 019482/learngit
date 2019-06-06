package com.bonc.meta.controller;

import com.bonc.meta.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by malz on 2019/6/6.
 */
@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	@ResponseBody
	public String index() {
		return "Hello World";
	}

	@RequestMapping("/doGetControllerTwo")
	@ResponseBody
	public String doGetControllerTwo(String name,Integer age) {
		return "找到你了"+name+",都这么大了:"+age;
	}

	@Resource
	private UserDao userDao;

	@RequestMapping("/getAllUser")
	@ResponseBody
	public String getAllUser(){
		System.out.println(userDao.findAll());
		String ss = userDao.findAll().toString();
		return ss;
	}
}
