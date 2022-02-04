
def call(Map configfile) {
    def buildOptions = 'vars.yml'
    node {
        def tmpInfo = readYaml file: "${buildOptions}"
        propertyInfo << tmpInfo

        println "print config ${propertyInfo.project_name}"
    }
} 