package com.akurupela.bookmarks.ui

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.DialogWrapper
import javax.swing.JComponent
import javax.swing.JPanel

/** Public stub dialog. */
class AddBookmarkDialog(project: Project) : DialogWrapper(project) {
    init {
        title = "Add Code Bookmark"
        init()
    }

    override fun createCenterPanel(): JComponent {
        // TODO: implement (full source is private)
        return JPanel()
    }
}
