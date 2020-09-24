package com.hiheo.learning.groovy

/**
 * Main test
 */
class SpringLearningApplicationTest extends GroovyTestCase {
  void testMain() {
    Random random = new Random()
    assert random.nextInt() % 2 != 0
  }
}
