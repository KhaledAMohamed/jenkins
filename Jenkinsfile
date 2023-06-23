@Library('jenkins') _
pipeline {
    agent any

    stages {
        stage('Example') {
            steps {
                script {
                    def groovyScript = libraryResource('jenkins-shared-library.groovy')
                    load groovyScript
                
                }
            }
        }
    }
}
