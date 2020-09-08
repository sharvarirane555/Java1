pipeline {
	agent any
	stages {
		stage ("Compile"){
			steps {
				withMaven(maven : 'Maven1') {
					bat 'mvn clean compile'
				}
			}
		}
		
		stage ("Test"){
			steps {
				withMaven(maven : 'Maven1') {
					bat 'mvn test'
				}
			}
		}
		
		stage ("Install"){
			steps {
				withMaven(maven : 'Maven1') {
					bat 'mvn install'
				}
			}
		}
	}
}
