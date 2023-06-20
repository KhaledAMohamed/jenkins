pipeline {
  agent any
  
  parameters {
    string(name: 'env', defaultValue: 'depl', description: '')
    booleanParam(name: 'test', defaultValue: false, description: '?')
  }
  
  environment {
    BUILD_NUMBER = "${env.BUILD_NUMBER}"
  }
  
  stages {
    stage('Test') {
      when {
        expression {
          params.test == true
        }
      }
      steps {
        echo 'run test stage.'
        
      }
    }
    
    stage('dep') {
      when {
        expression {
          params.env == 'depl'
        }
      }
      steps {
        echo "Deploying to ${params.env} environment..."
        
      }
    }
  }
}
