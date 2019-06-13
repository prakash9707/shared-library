
def call(Map pipelineParams){
node{
  stage('hello'){
    def PUBLIC_FOLDER_PATH = "hello"
   def VERSION_CONTENT = 'Build Id - ' + '\n' + 'Build Triggered By - ' + '\n' + 'Application URL - ' + '\n' 
   writeFile file: "${PUBLIC_FOLDER_PATH}/Version.txt", text: VERSION_CONTENT 
  }
}
}
