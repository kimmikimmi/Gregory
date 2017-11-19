package com.gregory.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Jaden
 * @since : 19/11/2017
 */
@RequestMapping("/hello")
@Slf4j
@RestController
public class HelloController {

	@ResponseBody
	@RequestMapping(value = {"/", ""}, method = RequestMethod.GET)
	public String hello() {
		log.info("hello world!");
		return "Hello World!";
	}
}
