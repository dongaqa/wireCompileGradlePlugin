package com.dong.wireCompiler

import org.gradle.api.Plugin
import org.gradle.api.Project


class WireCompilerPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        def tadk = project.task('dellog', {
        })
        tadk.group = "dongPlugin"
    }
}
