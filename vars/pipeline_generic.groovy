def call() {

pipeline
{
    agent any
    stages
    {
        stage('Novatos')
        {
            steps
            {
            	sh '''
                echo "compilmos nuestra primera imagen en un pipeline"
                docker build -t "apache:01" . 
                '''
            }
        }
    }
}

}
