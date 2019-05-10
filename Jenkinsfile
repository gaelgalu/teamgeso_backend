node {
    stage('Checkout') {
        git 'https://github.com/l-pizarro/ci-backend'
    }
    
    stage('Compile-Package') {
        def mvnHome = tool name: 'MAVEN 3.6.1', type: 'maven'
        sh "${mvnHome}/bin/mvn clean package"
    }
}