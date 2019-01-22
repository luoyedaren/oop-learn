package com.github.luoyedaren.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
