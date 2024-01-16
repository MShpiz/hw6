class TeacherReportBuilder(): ReportBuilder() {
    override fun build(): Report {
        val report = Report()
        report.name = "Teacher report"
        report.text = "Report report report"
        report.contents = listOf("annotation", "report", "resources")
        report.annotation = "annotation"
        report.resources = listOf("resource 1")
        return report
    }
}