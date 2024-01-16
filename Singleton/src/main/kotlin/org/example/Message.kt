import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.time.LocalDateTime

@Serializable
class Message(val type: MessageType, val source: String, val messageDetail: String, @Serializable(with = JsonLocalDateTimeSerializer::class) val timestamp: LocalDateTime) {
    enum class MessageType{
        INF,
        WRN,
        ERR;
    }

    override fun toString(): String {
        val sb: StringBuilder = StringBuilder()
        sb.append("Type: ", type, "; ")
        sb.append("Source: ", source, "; ")
        sb.append("Message text: ", messageDetail, "; ")
        sb.append("Time: ", timestamp, ";")
        return sb.toString()
    }
}
