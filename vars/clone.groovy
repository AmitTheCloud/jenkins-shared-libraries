def call(String url, String branch){
  echo "Clonig the repo from GitHub"
  git url: "${url}", branch: "${branch}"
}
