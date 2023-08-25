package org.com.myweb;

import org.com.myweb.tv.TV;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvMain {
	public static void main(String[] args) {
		// DI <---> Look up
		// Look up = 컨테이너에 생성된 빈을 찾아 온다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");

        TV tv = (TV)factory.getBean("tv");
        tv.turnOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.turnOff();
	}
}
