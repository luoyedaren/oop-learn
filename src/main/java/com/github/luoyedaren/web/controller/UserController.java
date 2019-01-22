package com.github.luoyedaren.web.controller;

import com.github.luoyedaren.learnoop.strategy.demo.userlogin.domain.User;
import com.github.luoyedaren.web.model.ResultModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/22 0022. - 星期二
 * nickName louyedaren
 */
@RestController
public class UserController {

	@RequestMapping("/api/user")
	public ResultModel getUser(User user) {
		return ResultModel.builder().success(true).msg("ok").build();
	}
}
