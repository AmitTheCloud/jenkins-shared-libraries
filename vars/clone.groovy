def call(string url, string branch){
  echo "Clonig the repo from GitHub"
  git url: "${url}", branch: "${branch}"
}
