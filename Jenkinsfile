
pipeline {
  agent any
  stages {
   
    stage ('Push'){
      steps {
        withCredentials[usernamePassword(
          credentialId: 'docker',
          usernameVariable: 'DOCKER_USERNAME',
          passwordVariable: 'DOCKER_PASSWORD'
        )]
        )]
      }
    }
}
}



pipeline {
    agent any
 
    stages {
         // Stage for checking out the source code from version control
       stage('Checkout') {
          steps {
             checkout scm
         }
       }
        stage('Build') {
            steps {
                // Build your Docker image
                sh 'docker build -t hello:2.0 .'
            }
        }
 
        stage('Push') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: 'docker',
                    usernameVariable: 'Username',
                    passwordVariable: 'Password'
                )]) {
                    // Log in to the Docker registry
                    script {
                        docker.withRegistry('', Username, Password) {
                            // Push the Docker image to the registry
                            sh 'docker push hello:2.0'
                        }
                    }
                }
            }
        }
    }
}