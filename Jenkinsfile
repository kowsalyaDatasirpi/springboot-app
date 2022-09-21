pipeline { 
    environment { 
        registry = "kowsalya1809/kss" 
        registryCredential = 'kowsalya-dockerhub' 
        dockerImage = '' 
    }
    agent any 
    stages { 
        stage('Building our image') { 
            steps {
                  script { 
                    dockerImage = docker.build registry + ":$BUILD_NUMBER" 
                }
            } 
        }
    stage('pushes our image') { 
        steps { 
            script { 
                docker.withRegistry( '', registryCredential ) { 
                        dockerImage.push() 
                    }
                } 
            }
        
        }  
        
    }
}
