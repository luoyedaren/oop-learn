package com.github.luoyedaren.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/22 0022. - 星期二
 * nickName louyedaren
 */
@RestController
public class TestController {
	@RequestMapping("/api/test")
	public Object test() {
		return "hello world";
	}

	@RequestMapping("/hi")
	public ModelAndView  home() {
		System.out.println("come in ");

		return new ModelAndView("test");
	}

	@RequestMapping("/classpath")
	public String classpath(){
		String path = Thread.currentThread().getContextClassLoader().getResource("/").getPath();
		System.out.println(path);
		return path;
	}

	public static void main(String[] args) {
		String path = TestController.class.getResource("/").toString();
		System.out.println("path = " + path);
	}

}
