pipeline{
    agent none
    tools{
        jdk 'jdk8'
        maven 'maven'
    }
    stages{
        stage('maven clean'){
            steps{
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