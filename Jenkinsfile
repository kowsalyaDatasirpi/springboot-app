pipeline { 
    environment { 
        registry = "kowsalya1809/kss" 
        registryCredential = 'kowsalya-dockerhub' 
        dockerImage = '' 
    }
    agent any 
 // triggers{
 //       cron('45 9 * * *')
 //   }
    stages { 
      stage('Build') {
         steps {
            sh 'java -version'
            sh 'chmod +x gradlew'
           sh "./gradlew assemble" 
       }
    }
        stage('Test') {
            steps {
                sh './gradlew test'
                sh 'printenv'
            }
            
                post {
             failure {	        
        
            echo 'sending email notification from jenkins'	        	        
        
            step([$class: 'Mailer',	        
        
      notifyEveryUnstableBuild: true,	        
        
      recipients: emailextrecipients([[$class: 'CulpritsRecipientProvider'],	        
        
       [$class: 'RequesterRecipientProvider']])])
                                     
  }
}
        }
        
        
//        stage('Building our image') { 
//            steps {
//                  script { 
//                    dockerImage = docker.build registry + ":$BUILD_NUMBER" 
//                }
//            } 
//        }
     stage('SonarQube analysis') {
          steps {
                 withSonarQubeEnv('sonarqube') {
                     sh "./gradlew sonarqube \
                        -Dsonar.projectKey=demo-sb-app \
                        -Dsonar.host.url=https://sonarqube.trojanae.com \
                        -Dsonar.login=fe7ecd4cf0547132ec9093ea8ed9a45808380abc"
                 }
            }
       } 
        
//     stage("Quality Gate") {
//          steps {
//             timeout(time: 1, unit: 'MINUTES') {
//                 waitForQualityGate abortPipeline: true
//             }         
//          }
//         }
    
    
//    stage('pushes our image') { 
//        steps { 
//            script { 
//                docker.withRegistry( '', registryCredential ) { 
//                        dockerImage.push() 
//                    }
//                } 
//            }
//       
//        }  
        
    }

    
}
