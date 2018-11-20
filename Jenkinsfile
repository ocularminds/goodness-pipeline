pipeline {
    agent { docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
                echo 'Building goodness pipeline...'
                step{if(isUnix()){
                    sh './gradlew clean build'
                } else {
                    bat 'gradlew clean build'
                }
                }
            }
        }
    }
}