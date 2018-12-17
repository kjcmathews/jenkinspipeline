node {
   def mvnHome
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
     // git 'https://github.com/jglick/simple-maven-project-with-tests.git'
     
    // sh 'export M2_HOME="/opt/maven/"'
     //sh 'export M2=$M2_HOME/bin'
     //sh 'export PATH=$M2:$PATH'
     
     //env.M2_HOME = sh(script: 'export M2_HOME="/opt/maven/"', returnStdout: true).trim()
//echo env.M2_HOME
     
      git branch: 'test_env', credentialsId: '0f057cb0-69ef-4591-99d0-81b5ae1b25a7', url: 'https://github.com/kjcmathews/jenkinspipeline.git'

   }
   stage('Build') {
      // Run the maven build
      if (isUnix()) {
                // Get the Maven tool.
          // ** NOTE: This 'M3' Maven tool must be configured
          // **       in the global configuration.           
         sh "mvn clean install"
         sh "mvn -Dmaven.test.failure.ignore clean package"
      } else {
         bat(/mvn -Dmaven.test.failure.ignore clean package/)
      }
   }
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
}
