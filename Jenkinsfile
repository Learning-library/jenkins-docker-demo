pipeline{
    agent{
            label 'master'
    }
    tools{
        jdk 'jdk8'
        maven 'maven'
    }
    stages{
        stage('maven clean'){
            steps{
                sh 'java -version'
                sh 'mvn clean'
            }
        }
        stage('maven package'){
            steps{
                sh 'mvn package'
            }
        }

    }
}