package org.example

import LogJournal
import Message
import java.time.LocalDateTime
import kotlin.concurrent.thread

fun main() {
    thread {
        func1()
    }
    thread {
        func2()
    }
    val journal = LogJournal.getInstance()
    journal.writeMessage(Message(Message.MessageType.INF, "Main.kt", "OK", LocalDateTime.now()))
}

fun func1() {
    Thread.sleep(1_000)
    val journal = LogJournal.getInstance()
    journal.writeMessage(Message(Message.MessageType.INF, "Main.kt", "func1", LocalDateTime.now()))
}

fun func2() {
    Thread.sleep(1_000)
    val journal = LogJournal.getInstance()
    journal.writeMessage(Message(Message.MessageType.INF, "Main.kt", "func2", LocalDateTime.now()))

}