pipeline {
    agent any //{ docker { image 'maven:3.3.3' } }
    stages {
        stage('build') {
            steps {
               sh './gradlew clean build'
            }
        }
        
        stage('Test') {
            steps{
                echo 'testing project..'
               //junit '**/target/*.xml'
            }
        }
        
        stage('Deploy'){
            when {
                expression {
                    currentBuild.result == null || currentBuild.result == 'SUCCESS'
                }
            }
            steps {
               echo 'deploying to the provisioned server'
            }
        }
        
        stage('Complete') {
          steps {
             echo "Build ${env.BUILD_ID} for Job ${env.JOB_NAME} completed."
          }
        }
    }
}