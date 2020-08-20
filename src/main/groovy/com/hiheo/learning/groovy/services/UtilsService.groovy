package com.hiheo.learning.groovy.services

import org.springframework.cloud.sleuth.annotation.NewSpan
import org.springframework.stereotype.Service

@Service
class UtilsService {

  @NewSpan(name = 'multiple2')
  int doubleNumber(int number) {
    plus(plus(number * 2, 1334324234), -1334324234)
  }

  @NewSpan(name = 'plus')
  int plus(int number, int numberPlus) {
    number + numberPlus
  }
}
