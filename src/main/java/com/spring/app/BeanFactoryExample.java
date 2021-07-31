package com.spring.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class BeanFactoryExample {

	public static void main(String[] args) {
		Resource config=new ClassPathResource("app_bean.xml");
		BeanFactory beanFactory=new XmlBeanFactory(config);

	}

}
