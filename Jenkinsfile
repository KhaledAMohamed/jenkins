
pipeline {
    agent any
    environment {
    DOCKERHUB_CREDENTIALS = credentials('docker')
    }
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
                sh 'docker build -t hello1:2.0 .'
            }
        }
        stage('Login') {
            steps {
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
                echo 'Login Completed' 
       }
    }
        stage('Push') {
            steps {
              sh 'docker push hello1:2.0'
            }
            }
        }
    }
