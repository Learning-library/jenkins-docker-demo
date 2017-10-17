pipeline {

    env.PATH = "${tool 'maven'}/bin:${env.PATH}"

    agent {
        label 'master' /* 执行节点 */
    }
    stages {
        stage('maven package') {
            steps {
               sh 'mvn clean package'
            }
        }

    }


}
