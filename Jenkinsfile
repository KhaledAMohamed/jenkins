@Library('jenkins-shared-library') // Replace 'my-shared-library' with the name you provided in the Jenkins configuration
pipeline {
  agent any
  stages {
    stage('Print welcome message') {
      steps {
        printWelcomeMessage() // Call the method from the shared library
      }
    }
  }
}
