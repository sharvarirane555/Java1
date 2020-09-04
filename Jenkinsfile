node {
        stage('SCM Checkout'){
                git 'https://github.com/sharvarirane555/Java1'
        }
        stage('Compile-Package'){
		def mvn_version = 'Maven1'
                withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
                        sh "mvn clean package"
                }
        }  
}

