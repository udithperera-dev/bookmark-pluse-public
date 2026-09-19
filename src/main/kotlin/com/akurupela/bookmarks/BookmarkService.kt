package com.akurupela.bookmarks

import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.openapi.components.Service
import com.intellij.openapi.components.State
import com.intellij.openapi.components.Storage
import com.intellij.openapi.components.StoragePathMacros
import com.intellij.openapi.project.Project
import com.akurupela.bookmarks.model.BookmarkState

@Service(Service.Level.PROJECT)
@State(name = "BookmarkPlus", storages = [Storage(StoragePathMacros.WORKSPACE_FILE)])
class BookmarkService(private val project: Project) : PersistentStateComponent<BookmarkState> {
    private var state = BookmarkState()

    override fun getState(): BookmarkState = state

    override fun loadState(state: BookmarkState) {
        // TODO: implement (full source is private)
        this.state = state
    }

    fun categories(): List<com.akurupela.bookmarks.model.BookmarkCategory> {
        // TODO: implement (full source is private)
        return emptyList()
    }

    fun bookmarks(): List<com.akurupela.bookmarks.model.CodeBookmark> {
        // TODO: implement (full source is private)
        return emptyList()
    }

    fun addBookmark(/* ... */): com.akurupela.bookmarks.model.CodeBookmark {
        // TODO: implement (full source is private)
        throw UnsupportedOperationException("private")
    }

    fun deleteBookmark(id: String) {
        // TODO: implement (full source is private)
    }

    fun navigateTo(id: String) {
        // TODO: implement (full source is private)
    }

    companion object {
        fun getInstance(project: Project): BookmarkService =
            project.getService(BookmarkService::class.java)
    }
}
