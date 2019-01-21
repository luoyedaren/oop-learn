package com.github.luoyedaren.web.service.impl;

import com.github.luoyedaren.web.dao.UserRepository;
import com.github.luoyedaren.web.entity.UserEntity;
import com.github.luoyedaren.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/21 0021. - 星期一
 * nickName louyedaren
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserEntity getOne(int i) {
		return userRepository.getOne(i);
	}
}
