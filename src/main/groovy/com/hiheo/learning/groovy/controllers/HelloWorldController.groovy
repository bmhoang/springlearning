package com.hiheo.learning.groovy.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
  @GetMapping('/hello')
  String hello() {
    sleep(1234)
    'Hello World!'
  }
}
