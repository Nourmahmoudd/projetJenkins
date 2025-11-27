pipeline {
    agent any
    tools {
        maven 'M2'  // Si Maven est configuré dans Jenkins
    }
    
    stages {
        stage('Checkout Git') {
            steps {
                echo '🎯 Récupération du code depuis Git...'
                checkout scm
            }
        }
        
        stage('Compilation') {
            steps {
                echo '🔨 Compilation du projet...'
                sh 'mvn clean compile'
            }
        }
        
        stage('Tests') {
            steps {
                echo '🧪 Exécution des tests...'
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        
        stage('Package') {
            steps {
                echo '📦 Création du JAR...'
                sh 'mvn package -DskipTests'
            }
        }
    }
    
    post {
        always {
            echo '✅ Pipeline terminé - voir logs pour détails'
        }
        success {
            echo '🎉 SUCCÈS : Tout est OK!'
        }
        failure {
            echo '❌ ÉCHEC : Vérifier les logs'
        }
    }
}