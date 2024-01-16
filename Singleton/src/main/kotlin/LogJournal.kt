import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.*

class LogJournal private constructor() {
    companion object{
        private var Instance: LogJournal? = null

        private var TextFileLocation = "log.txt"
        private var JSONFileLocation = "log.json"
        fun getInstance(): LogJournal{
            if (Instance == null){
                Instance = LogJournal()
            }

            return LogJournal()
        }
    }

    fun writeMessage(msg: Message): Unit {
        writeToFile(JSONFileLocation, Json.encodeToString(msg))
        writeToFile(TextFileLocation, msg.toString())
    }

    private fun writeToFile(fileName: String, data: String): Unit{
        val file = File(JSONFileLocation)
        file.createNewFile()
        try {
            FileWriter(fileName, true).use {
                it.write("\n")
                it.write(data)
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}