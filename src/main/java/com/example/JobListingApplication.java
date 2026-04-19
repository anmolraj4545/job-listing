//package com.example;
//
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@EnableSwagger2
//@SpringBootApplication
//public class JobListingApplication {
//
//
////	@Bean
////	public Docket api()
////	{
////		return new Docket(DocumentationType.SWAGGER_2).select()
////				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
////				.build().apiInfo(apiInfo()).useDefaultResponseMessages(false);
////	}
////
////	@Bean
////	public ApiInfo apiInfo()
////	{
////          final ApiInfoBuilder apiInfoBuilder=new ApiInfoBuilder();
////		  return apiInfoBuilder.build();
////	}
//
//
//	public static void main(String[] args) {
//		SpringApplication.run(JobListingApplication.class, args);
//	}
//
//}


package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobListingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobListingApplication.class, args);
	}
}
