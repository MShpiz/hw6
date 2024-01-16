fun main() {
    val builder: ReportBuilder

    println("Введите: \n"+
            "1, чтобы создать отчёт студента, \n" +
            "2 - учителя,")
    val answer = readln()

    builder = when (answer) {
        "1" -> StudentReportBuilder()
        "2" -> TeacherReportBuilder()
        else -> throw Exception()
    }
    val result = builder.build()
    println(result.toString())
}