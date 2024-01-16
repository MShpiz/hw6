import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
class Report(){
    var name: String? = null
    var annotation: String? = null
    var contents: List<String>? = null
    var text: String? = null
    var resources: List<String>? = null
    var applications: List<String>? = null

    override fun toString(): String {
        return Json.encodeToString(this)
    }
}