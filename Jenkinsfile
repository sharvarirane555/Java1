pipeline {
	agent any
	stages {
		def mvnTool = tool 'Maven1'
		stage ("Compile"){
			steps {
				withMaven(maven : 'Maven1') {
					sh "${mvnTool}/bin/mvn clean compile" 
				}
			}
		}
		
		stage ("Test"){
			steps {
				withMaven(maven : 'Maven1') {
					sh "${mvnTool}/bin/mvn test" 
				}
			}
		}
		
		stage ("Install"){
			steps {
				withMaven(maven : 'Maven1') {
					sh "${mvnTool}/bin/mvn install" 
				}
			}
		}
	}
}
