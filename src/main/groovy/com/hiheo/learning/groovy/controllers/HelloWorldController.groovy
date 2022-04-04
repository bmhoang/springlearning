package com.hiheo.learning.groovy.controllers

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Api(tags = 'Hello World')
@RestController
class HelloWorldController {
  @ApiOperation(value = 'Just print Hello World message')
  @GetMapping('/hello')
  String hello() {
    'Hello World!'
  }
}
