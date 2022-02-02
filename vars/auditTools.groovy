def call() {
    node {
      sh '''
        pwd
        git version
      '''
    }
}