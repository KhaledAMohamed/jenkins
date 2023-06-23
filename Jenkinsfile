@Library('jenkins') _
pipeline {
    agent any

    stages {
        stage('Example') {
            steps {
                script {
                    helloWorld() // Assuming `helloWorld()` is defined in the shared library
                }
            }
        }
    }
}
