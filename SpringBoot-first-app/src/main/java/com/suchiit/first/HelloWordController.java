package com.suchiit.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloWordController {
	
public String helloworld()
{
	return "HelloWorld!";
}
	
}
