package org.dylan


def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def setEnv(script, envString) {
        //${script.env.TEST = envString}
        echo "${script.env.TEST}"
      }

/*class TestFuncs {

    /*static def setEnv(script, envString) {
        ${script.env.TEST = envString}
      }
    //def steps
    def steps
    Utilities(steps) {this.steps = steps}

    def multiply(int a, int b) {
        return  a * b
    }
}*/