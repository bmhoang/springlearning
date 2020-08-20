package com.hiheo.learning.groovy.controllers

import com.hiheo.learning.groovy.services.UtilsService
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
@Slf4j
class HelloWorldController {
  @Autowired UtilsService utilsService

  @GetMapping('/hello')
  String hello() {
    log.warn('testing ahihi')
    //sleep(3000)
    'Hello World!'
  }

  @GetMapping('/double/{number}')
  int getDouble(@PathVariable(name = 'number')Integer number) {
    utilsService.plus(utilsService.doubleNumber(number),23421)
  }
}
