
def getConfigFileProperties(configFile) {
    yaml_container_props = null
    if (fileExists("${configFile}")) {
        yaml_container_props = readYaml file: "${configFile}"
    }
    else {
        sh "echo No file ${configFile} exists && exit 1"
    }
    yaml_container_props
}