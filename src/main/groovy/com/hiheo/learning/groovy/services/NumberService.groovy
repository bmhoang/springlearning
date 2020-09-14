package com.hiheo.learning.groovy.services

import org.springframework.stereotype.Service

@Service
class NumberService {
  Random random = new Random()
  int randomInt(int max = 10) {
    random.nextInt(max)
  }
}
