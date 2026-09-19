package com.akurupela.bookmarks.ui

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import javax.swing.JComponent
import javax.swing.JPanel

/** Public stub dialog. */
class AddHighlightDialog(project: Project) : DialogWrapper(project) {
    init {
        title = "Highlight Code"
        init()
    }

    override fun createCenterPanel(): JComponent {
        // TODO: implement (full source is private)
        return JPanel()
    }
}
