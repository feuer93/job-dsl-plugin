package javaposse.jobdsl.dsl.helpers.wrapper

import javaposse.jobdsl.dsl.Context

/**
 * DSL context for Custom Tools Plugin
 * (https://wiki.jenkins-ci.org/display/JENKINS/Custom+Tools+Plugin).
 */
class CustomToolsContext implements Context {
    boolean skipMasterInstallation = false
    boolean convertHomesToUppercase = false

    void skipMasterInstallation(boolean skipMasterInstallation = true) {
        this.skipMasterInstallation = skipMasterInstallation
    }

    void convertHomesToUppercase(boolean convertHomesToUppercase = true) {
        this.convertHomesToUppercase = convertHomesToUppercase
    }

}
