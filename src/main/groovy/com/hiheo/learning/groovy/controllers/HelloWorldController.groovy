package com.hiheo.learning.groovy.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Hello World Controller
 */
@RestController
class HelloWorldController {
  @GetMapping('/hello')
  String hello() {
    'Hello World!'
  }
}
