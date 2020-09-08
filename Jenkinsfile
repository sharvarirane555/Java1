pipeline {
	agent any
	stages {
		stage ("Compile"){
			steps {
				withMaven(maven : 'Maven2') {
					bat "mvn clean compile" 
				}
			}
		}
		
		stage ("Test"){
			steps {
				withMaven(maven : 'Maven2') {
					bat "mvn test" 
				}
			}
		}
		
		stage ("Install"){
			steps {
				withMaven(maven : 'Maven2') {
					bat "mvn install" 
				}
			}
		}
		
		stage ("Deploy"){
			steps {
				withMaven(maven : 'Maven2') {
					bat "mvn deploy" 
				}
			}
		}
	}
}
