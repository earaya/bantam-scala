package com.earaya.bantamscala

import scala.collection.Iterator

class Lexer(text: String) extends Iterator[Token] {
    def hasNext: Boolean = true
    def next: Token = EofToken()
}