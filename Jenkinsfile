pipeline {
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'

		dir('PracticaArduino/Arduino') {
			sh 'make -f Makefile-Linux.mk' 
		}

		dir('simple') {
			sh 'mvn verify'
			sh 'mvn site'
		}

		dir('PracticaAndroid') {
			sh './gradlew tasks'
			sh './gradlew check'
		}
            }
        }
    }
}
