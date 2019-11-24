package com.personal.mock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@MapperScan(basePackages = "com.personal.mock.dao")
@EnableZuulProxy
public class MockApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockApplication.class, args);
	}
//	@Bean
//	public EmbeddedServletContainerFactory servletContainer(){
//		TomcatEmbeddedServletContainerFactory tomcat=new TomcatEmbeddedServletContainerFactory(){
//			@Override
//			protected void postProcessContext(Context context) {
//				SecurityConstraint securityConstraint=new SecurityConstraint();
//				securityConstraint.setUserConstraint("CONFIDENTIAL");//confidential
//				SecurityCollection collection=new SecurityCollection();
//				collection.addPattern("/*");
//				securityConstraint.addCollection(collection);
//				context.addConstraint(securityConstraint);
//			}
//		};
//		tomcat.addAdditionalTomcatConnectors(httpConnector());
//		return tomcat;
//	}
//
//	@Bean
//	public Connector httpConnector(){
//		Connector connector=new Connector("org.apache.coyote.http11.Http11NioProtocol");
//		connector.setScheme("http");
//		connector.setPort(8080);
//		connector.setSecure(true);
//		connector.setRedirectPort(8443);
//		return connector;
//	}


	//springboot 2.x版本写法
//	@Bean
//	public ServletWebServerFactory servletContainer() {
//		TomcatServletWebServerFactor tomcat = new TomcatServletWebServerFactory();
//		tomcat.addAdditionalTomcatConnectors(createHTTPConnector());
//		return tomcat;
//	}
//
//
//	private Connector createHTTPConnector() {
//		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//		//同时启用http（8080）、https（8443）两个端口
//		connector.setScheme("http");
//		connector.setSecure(false);
//		connector.setPort(8080);
//		connector.setRedirectPort(8443);
//		return connector;
//	}


}
