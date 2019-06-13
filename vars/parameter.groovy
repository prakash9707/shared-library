
def call(Map pipelineParams){
node{
  stage('hello'){
    def PUBLIC_FOLDER_PATH = "hello"
    Date date = new Date()
    String datePart = date.format("dd/MM/yyyy")
    String timePart = date.format("HH:mm:ss")
    int a = 10;
    echo a
    echo datePart
    echo timePart
   def VERSION_CONTENT = 'Build Id - ' + '\n' + 'Build Triggered By - ' + '\n' + 'Application URL - ' + '\n' + 'Date of build - ' + datePart + '\n' + 'time of build - ' + timePart + '\n' 
    
   writeFile file: "${PUBLIC_FOLDER_PATH}/Version.txt", text: VERSION_CONTENT 
  }
}
}
