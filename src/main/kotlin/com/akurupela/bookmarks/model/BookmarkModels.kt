package com.akurupela.bookmarks.model

import java.util.UUID

data class BookmarkCategory(
    var id: String = UUID.randomUUID().toString(),
    var name: String = "General",
    var colorHex: String = "#4A90E2",
    var iconId: String = "bookmark",
    var order: Int = 0,
)

object HighlightMode {
    const val LINE = "LINE"
    const val SELECTION = "SELECTION"
}

object BookmarkKind {
    const val BOOKMARK = "BOOKMARK"
    const val HIGHLIGHT = "HIGHLIGHT"
}

data class CodeBookmark(
    var id: String = UUID.randomUUID().toString(),
    var kind: String = BookmarkKind.BOOKMARK,
    var categoryId: String = "",
    var fileUrl: String = "",
    var line: Int = 0,
    var offset: Int = 0,
    var endOffset: Int = 0,
    var highlightMode: String = HighlightMode.LINE,
    var mnemonic: String? = null,
    var label: String = "",
    var description: String = "",
    var tags: MutableList<String> = mutableListOf(),
)

data class BookmarkState(
    var categories: MutableList<BookmarkCategory> = mutableListOf(),
    var bookmarks: MutableList<CodeBookmark> = mutableListOf(),
)
