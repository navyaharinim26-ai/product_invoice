
pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Archive Artifacts') {
            steps {
                bat 'mvn package -DskipTests'
                archiveArtifacts artifacts: 'target/*.jar',
                                 allowEmptyArchive: false
            }
        }
    }
}
