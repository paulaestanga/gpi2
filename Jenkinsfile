pipeline {
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'

		dir('MyArduinoProject') {
			sh 'make -f Makefile-Linux.mk' 
		}

		dir('simple') {
			sh 'mvn verify'
			sh 'mvn site'
		}

		dir('AndroidStudioProjects/MyApplication') {
			sh './gradlew tasks'
			sh './gradlew check'
		}
            }
        }
    }
}
