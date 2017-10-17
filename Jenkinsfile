pipeline {
    agent {
        label 'master' /* 执行节点 */
    }
    stages {
     def mvnHome = tool 'M3'
     env.PATH = "${mvnHome}/bin:${env.PATH}"
        stage('maven package') {
            steps {
               sh 'mvn clean package'
            }
        }

    }


}
