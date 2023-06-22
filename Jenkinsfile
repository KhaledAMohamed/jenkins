@Library('jenkins-shared-library.groovy:master') _

pipeline {
  agent any
  stages {
    stage('Print welcome message') {
      steps {
        script {
          printWelcomeMessage() // Call the method from the shared library
        }
      }
    }
  }
}
