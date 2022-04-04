package com.hiheo.learning.groovy.configurations

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.service.Tag
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket

@Configuration
class SwaggerConfiguration {
  public static final String HELLO_WORLD = 'Hello World'
  @Bean
  Docket api() {
    new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
        .select()
        .apis(RequestHandlerSelectors.basePackage('com.hiheo.learning.groovy.controller'))
        .paths(PathSelectors.any())
        .build()
        .tags(new Tag(HELLO_WORLD, 'Demo hello world api'))
  }

  static ApiInfo apiInfo() {
    new ApiInfo(
        'Hoang Bui API',
        'Demo swagger for Hoang Bui API',
        '1.2',
        'https://hiheo.com',
        new Contact('Hoang Bui', 'https://hiheo.com', 'bmhoang@outlook.com'),
        'No License',
        '#',
        Collections.emptyList())
  }
}
