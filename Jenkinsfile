pipeline {
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
        sh './gradlew tasks compileDebugAndroidTestSources'
            }
        }
    stage('Arduino') {
            steps {
        sh 'make'
            }       
        }
        stage('Maven') {
            steps {
        sh 'mvn compile'
                sh 'mvn test'
        sh 'mvn validate'
        sh 'mvn verify'
            }       
        }
    stage('Android') {
            steps {
                sh './gradlew task compileDebugAndroidTestSources'
        sh './gradlew task compileDebugSources'
        sh './gradlew task compileDebugUnitTestSources'
        sh './gradlew task compileReleaseSources'
        sh './gradlew task compileReleaseUnitTestSources'
            }       
        }

        stage('Deliver') {
            steps {
                sh './jenkins/scripts/deliver.sh'
            }
        }
    }
}
