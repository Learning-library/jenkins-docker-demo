
node {
  agent {
        label 'master' /* 执行节点 */
  }
  stage ('Checkout') {
    git 'https://github.com/changdaye/jenkins-docker-demo.git'
  }

  stage ('Create Virtualenv') {
    def mvnHome = tool 'M3'
    env.PATH = "${mvnHome}/bin:${env.PATH}"
    sh 'mvn clean package'
  }


}
