pipeline {
  agent any

  stages {
    stage('Echo Message') {
      steps {
        sh "echo 'Hello, Jenkins!'"
      }
    }
  }
}
