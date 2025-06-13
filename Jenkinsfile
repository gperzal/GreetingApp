pipeline {
    agent any

    tools {
        maven 'Maven 3.9.10'
        jdk 'JDK21'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/gperzal/GreetingApp.git'
            }
        }

        stage('Compile') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {
        success {
            echo '✅ The build was successful.'
        }
        failure {
            echo '❌ The build failed.'
        }
    }
}
