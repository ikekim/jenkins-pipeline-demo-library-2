
def call(Map configfile) {
    def buildOptions = 'vars.yaml'
    node {
        def tmpInfo = readYaml file: "${buildOptions}"
        propertyInfo << tmpInfo

        println "print config ${propertyInfo.project_name}"
    }
} 