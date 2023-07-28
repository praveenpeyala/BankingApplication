pipeline {
    agent any
  tools {
    maven "Maven"
   }
    stages {
        stage('GIT-checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/praveenpeyala/BankingApplication.git'
            }
        }
        stage('Compile-source_code') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Unit_testing-source_code') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Integration-source_code') {
            steps {
                sh 'mvn install'
            }
        }
        stage('Docker-image_build_&_publish') {
            steps {
                script{
                    // This step should not normally be used in your script. Consult the inline help for details.
                    withDockerRegistry(credentialsId: '5c62b3ad-192d-4d5d-b185-f5eedb3a7ce3', toolName: 'Docker', url: 'https://index.docker.io/v1/') 
                        {
                          sh 'docker build -t prvn369/bankapp-pipeline:latest .'
                          sh 'docker push prvn369/bankapp-pipeline:latest'
                        }
                    }
                }
            }
        }
    }
