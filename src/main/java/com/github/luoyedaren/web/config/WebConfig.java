package com.github.luoyedaren.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * project learn-oop
 *
 * @author chenghai on 2019/1/24 0024. - 星期四
 * nickName louyedaren
 * 视图解析器
 * 如果增加高级功能，则加 @EnableWebMvc 实现 WebMvcConfigurer 接口
 * 一般的配置  官方建议 继承 WebMvcConfigurationSupport
 */
//@Configuration
//@ComponentScan(basePackageClasses = WebConfig.class)
//public class WebConfig extends WebMvcConfigurationSupport {
//
//
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/views/").addResourceLocations("/","classpath:/views/");
//
//	}
//}
