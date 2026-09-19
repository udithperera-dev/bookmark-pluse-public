package com.akurupela.bookmarks.ui

import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.SimpleToolWindowPanel
import com.intellij.ui.components.JBLabel
import javax.swing.SwingConstants

/**
 * Public incomplete UI scaffold for Bookmarks+.
 * Full layout, dialogs, and persistence wiring are private.
 */
class BookmarksPanel(private val project: Project) : SimpleToolWindowPanel(true, true) {
    init {
        setContent(
            JBLabel("Bookmarks+ — incomplete public source", SwingConstants.CENTER),
        )
        // TODO: implement (full source is private)
    }
}
