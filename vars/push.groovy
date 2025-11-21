def call(String dockerHubUser, String Project, String ImageTag){
withCredentials([usernamePassword(
                    credentialsId: "dockerHubcred",
                    passwordVariable: "dockerHubPass",
                    usernameVariable: "dockerHubUser"
                )]) {
                    sh "docker login -u "${dockerHubUser}" -p "${dockerHubPass}"
                    sh "docker tag notes-app:latest ${dockerHubUser}/notes-app:${ImageTag}"
                    sh "docker push ${dockerHubUser}/${Project}:${ImageTag}"
                }
}
