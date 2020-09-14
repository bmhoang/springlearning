package com.hiheo.learning.groovy.controllers

import com.hiheo.learning.groovy.services.NumberService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
  @Autowired NumberService numberService

  @GetMapping('/hello')
  String hello() {
    sleep(numberService.randomInt(5) * 1000)
    'Hello World!'
  }
}
