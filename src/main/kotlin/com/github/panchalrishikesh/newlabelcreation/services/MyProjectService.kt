package com.github.panchalrishikesh.newlabelcreation.services

import com.github.panchalrishikesh.newlabelcreation.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
