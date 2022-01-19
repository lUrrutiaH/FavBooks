package com.example.favbooks

var booklist = mutableListOf<Books>()

var BOOK_ID_DETAILS = "booksDetails"

class Books (
        var cover: Int,
        var author: String,
        var title: String,
        var description: String,
        var id: Int? = booklist.size
)
        