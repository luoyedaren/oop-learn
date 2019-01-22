package com.github.luoyedaren.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/22 0022. - 星期二
 * nickName louyedaren
 */
@Data
@Builder
public class ResultModel {
	private boolean success = true;
	private String msg;
	private Object data;


}
