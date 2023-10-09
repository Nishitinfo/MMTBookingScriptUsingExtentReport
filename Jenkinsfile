pipeline {
    agent any
environment {
        GITHUB_TOKEN = credentials('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')
    }
    stages {
        
      stage('Build and Test') {
    steps {
        // Use 'bat' for Windows command execution
        bat 'mvn clean test'
    }
     }
       
    }
}
