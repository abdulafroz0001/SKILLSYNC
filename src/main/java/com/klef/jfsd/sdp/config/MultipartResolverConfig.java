package com.klef.jfsd.sdp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;

@Configuration
public class MultipartResolverConfig 
{
	 @Bean
	    public StandardServletMultipartResolver multipartResolver() {
	        return new StandardServletMultipartResolver();
	    }

}
