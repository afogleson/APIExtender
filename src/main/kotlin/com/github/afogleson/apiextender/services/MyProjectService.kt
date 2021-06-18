package com.github.afogleson.apiextender.services

import com.github.afogleson.apiextender.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
