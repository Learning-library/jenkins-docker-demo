
node{
  stage ('Create Virtualenv') {
    def mvnHome = tool 'maven'
    env.PATH = "${mvnHome}/bin:${env.PATH}"
    sh 'mvn clean package'
  }


}
