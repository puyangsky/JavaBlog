package com.puyangsky.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

	@Test
	public void contextLoads() {
        IntStream stream = IntStream.rangeClosed(1, 5);
        System.out.println(stream.boxed().collect(Collectors.toList()));
    }

}
