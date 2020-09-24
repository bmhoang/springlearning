ruleset {
  description 'CodeNarc RuleSet for Main code'

  ruleset('rulesets/basic.xml')
  ruleset('rulesets/braces.xml')
  ruleset('rulesets/concurrency.xml')
  ruleset('rulesets/convention.xml') {
    exclude 'NoDef'
  }
  ruleset('rulesets/design.xml')
  ruleset('rulesets/dry.xml')
  ruleset('rulesets/exceptions.xml')
  ruleset('rulesets/formatting.xml') {
    exclude 'SpaceAroundMapEntryColon'
    exclude 'SpaceAfterClosingBrace' // accept for `}]`
    Indentation  {
      spacesPerIndentLevel = 2
    }
  }
  ruleset('rulesets/generic.xml')
  ruleset('rulesets/grails.xml')
  ruleset('rulesets/groovyism.xml')
  ruleset('rulesets/imports.xml') {
    MisorderedStaticImports {
      comesBefore = false
    }
    exclude 'NoWildcardImports'
  }
  ruleset('rulesets/jdbc.xml')
  ruleset('rulesets/junit.xml')
  ruleset('rulesets/logging.xml')
  ruleset('rulesets/naming.xml') {
    FactoryMethodName {
      regex = /(build.*|make.*)/
    }
  }
  ruleset('rulesets/security.xml')
  ruleset('rulesets/serialization.xml')
  ruleset('rulesets/size.xml') {
    exclude 'AbcComplexity' // DEPRECATED: Use the AbcMetric rule instead
    exclude 'CrapMetric' // This is broken
  }
  ruleset('rulesets/unnecessary.xml')
  ruleset('rulesets/unused.xml')
}