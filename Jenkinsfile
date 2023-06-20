pipeline {
  agent any
  
  parameters {
    string(name: 'ENVIRONMENT', defaultValue: 'development', description: 'Target environment')
    booleanParam(name: 'RUN_TESTS', defaultValue: true, description: 'Run tests?')
  }
  
  environment {
    GIT_BRANCH = "${env.BRANCH_NAME}"
    BUILD_NUMBER = "${env.BUILD_NUMBER}"
  }
  
  stages {
    stage('Build') {
      steps {
        echo 'Building...'
        // Add build steps here
      }
    }
    
    stage('Test') {
      when {
        expression {
          params.RUN_TESTS == true
        }
      }
      steps {
        echo 'Running tests...'
        // Add test steps here
      }
    }
    
    stage('Deploy') {
      when {
        expression {
          params.ENVIRONMENT == 'production'
        }
      }
      steps {
        echo "Deploying to ${params.ENVIRONMENT} environment..."
        // Add deployment steps here
      }
    }
  }
}
