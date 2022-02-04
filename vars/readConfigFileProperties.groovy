
def getConfigFileProperties(configFile) {
    yaml_container_props = null
    if (fileExists("${configFile}")) {
        yaml_container_props = readYaml file: "${configFile}"
        sh "echo file is ${configFile}"
    }
    else {
        sh "echo No file ${configFile} exists && exit 1"
    }
    def prj_name = yaml_container_props['project_name']

    sh 'echo project is $prj_name'
}