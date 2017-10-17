
node{
  stage ('Create Virtualenv') {
    def mvnHome = tool 'M3'
    env.PATH = "${mvnHome}/bin:${env.PATH}"
    sh 'mvn clean package'
  }


}
