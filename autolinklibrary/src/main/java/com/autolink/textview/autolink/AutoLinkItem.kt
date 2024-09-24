package com.autolink.textview.autolink

data class AutoLinkItem(var startPoint: Int,
                        var endPoint: Int,
                        val originalText: String,
                        val transformedText: String,
                        val mode: Mode
)
