package com.github.luoyedaren;

import com.github.luoyedaren.LearnOopApplication;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LearnOopApplication.class)
public class SpringBootBaseTest {

	@Test
	public void contextLoads() {
	}

	@Test
	public void classpath() {
		String path = Test.class.getResource("/").toString();
		System.out.println("path = " + path);
	}
}

