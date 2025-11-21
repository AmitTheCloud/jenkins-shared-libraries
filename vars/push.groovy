def call(String dockerHubUser, String Project, String ImageTag){
withCredentials([usernamePassword(
                    credentialsId: "dockerHubcred",
                    passwordVariable: "dockerHubPass",
                    usernameVariable: "dockerHubUser"
                )]) {
                    sh "docker login -u "$dockerHubUser" -p "$dockerHubPass"
                    sh "docker tag notes-app:latest ${dockerHubUser}/notes-app:latest"
                    sh "docker push ${dockerHubUser}/notes-app:latest"
                }
}
