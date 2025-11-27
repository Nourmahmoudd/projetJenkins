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
                sh 'mvn clean compile'
            }
        }
        
        stage('Tests') {
            steps {
                echo '🧪 Exécution des tests...'
                sh 'mvn test -Dmaven.test.failure.ignore=true'
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