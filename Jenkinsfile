pipeline{
    agent{
            label 'master'
    }
    tools{
        jdk 'jdk8'
        maven 'maven'
    }
    stages{
        stage('清空'){
            steps{
                sh 'java -version'
                sh 'mvn clean'
            }
        }
        stage('打包'){
            steps{
                sh 'mvn package'
            }
        }
        stage('上传到私服'){
            steps{
                sh 'mvn deploy'
            }
        }
        stage('执行code review 操作'){
            steps{
                sh 'mvn sonar:sonar'
            }
        }
        stage('部署环境'){
            steps{
                sh 'chmod 777 ./jenkins-run.sh'
                sh './jenkins-run.sh'
            }
        }
        stage('发送通知邮件到相应人员'){
            steps{
                echo '发送通知邮件到相应人员'
            }
        }


    }
}