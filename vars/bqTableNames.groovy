
def call(Map config) {
    node {
        return config.table1 + 'and' config.table2
    }
}