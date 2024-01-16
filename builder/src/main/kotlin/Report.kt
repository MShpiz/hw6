import kotlinx.serialization.Serializable

@Serializable
class Report(){
    var name: String? = null
    var annotation: String? = null
    var contents: List<String>? = null
    var text: String? = null
    var resources: List<String>? = null
    var applications: List<String>? = null
}