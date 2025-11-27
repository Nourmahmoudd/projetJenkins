pipeline {
    agent any
    
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
                bat 'mvn clean compile'
            }
        }
        
        stage('Tests') {
            steps {
                echo '🧪 Exécution des tests...'
                bat 'mvn test'
            }
        }
        
        stage('Package') {
            steps {
                echo '📦 Création du JAR...'
                bat 'mvn package -DskipTests'
            }
        }
    }
    
    post {
        always {
            echo '✅ Pipeline terminé'
        }
        success {
            echo '🎉 SUCCÈS : Build réussi!'
        }
        failure {
            echo '❌ ÉCHEC : Build échoué'
        }
    }
}