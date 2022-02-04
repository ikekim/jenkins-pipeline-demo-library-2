
def call(configfile)
    if (fileexists("${configfile}")) {
        yml_tables_properties = readYaml file: "${configfile}"
    }
    else {
        sh "echo no files${configfile} exists && exit 1"
    }

    sh "echo yml_table_properties["project_name"]