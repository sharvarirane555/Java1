pipeline {
	agent any
	stages {
		stage ("Compile"){
			steps {
				withMaven(maven : 'Maven1') {
					sh 'mvn clean compile'
				}
			}
		}
		
		stage ("Test"){
			steps {
				withMaven(maven : 'Maven1') {
					sh 'mvn test'
				}
			}
		}
		
		stage ("Install"){
			steps {
				withMaven(maven : 'Maven1') {
					sh 'mvn install'
				}
			}
		}
	}
}
