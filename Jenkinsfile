pipeline {
    agent any
  tools{
    maven "mvn"
   }
    stages {
        stage('GitCheckOut') {
            steps {
                git branch: 'main', url: 'https://github.com/RAMARJUN397/BankingApplication.git'
            }
        }
        stage('Compilation') {
            steps {
                sh 'mvn compile'
            }
        }
        stage('UnitTesting') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Continuous Integration') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Docker Build and Publish') {
            steps {
               script{
                   // This step should not normally be used in your script. Consult the inline help for details.
                withDockerRegistry(credentialsId: 'DockerHub_Pipes', toolName: 'Docker',
                url: 'https://index.docker.io/v1/') {
                    sh "docker build -t ak397/arjunimage:latest ."
                    sh "docker push ak397/arjunimage:latest"
   
                    }
               }
            }
        }
    }
}
