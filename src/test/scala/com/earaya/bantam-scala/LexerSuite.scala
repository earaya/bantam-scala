package com.earaya.bantamscala

import org.scalatest.FunSuite

class LexerSuite extends FunSuite {
    test("lexer returns EOF tokens at end") {
        val lexer = new Lexer("")
        assert(lexer.next() === EofToken())
    }
}