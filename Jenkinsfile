node {
    stage('Checkout') {
        git 'https://github.com/gaelgalu/teamgeso_backend.git'
    }
    
    stage('Compile-Package') {
        def mvnHome = tool name: 'MAVEN 3.6.1', type: 'maven'
        sh "${mvnHome}/bin/mvn dependency:tree"
        sh "${mvnHome}/bin/mvn clean package"
    }
}