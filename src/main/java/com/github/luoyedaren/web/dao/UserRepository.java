package com.github.luoyedaren.web.dao;

import com.github.luoyedaren.web.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/21 0021. - 星期一
 * nickName louyedaren
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
