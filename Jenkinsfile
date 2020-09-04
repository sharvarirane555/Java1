node {
   def mvnHome = tool name: 'Maven1', type: 'maven'
   stage('SCM Checkout'){
   git 'https://github.com/sharvarirane555/Java1'
        }
        stage('Compile-Package'){
	sh "${mvnHome}\bin\mvn package"
        }  
}

