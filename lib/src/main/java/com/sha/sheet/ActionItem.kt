package com.sha.sheet


data class ActionItem @JvmOverloads constructor(
        var title: String,
        var style: Style = Style.DEFAULT,
        var isEnabled: Boolean = true,
        var tag: Int = 0,
        var action: () -> Unit
)

enum class Style {
    DEFAULT, DESTRUCTIVE
}