pipeline{
   agent any 
   stages{
     stage ('Compile Stage'){
       steps{
          withMaven(maven :'Meera')
           sh 'mvn clean compile'
          }
     }
   stage ('Compile Stage'){
       steps{
          withMaven(maven :'Meera')
           sh 'mvn test'
          }
       }
   }
   

}