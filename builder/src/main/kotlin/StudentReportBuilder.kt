class StudentReportBuilder(): ReportBuilder() {
    override fun build(): Report {
        val report = Report()
        report.name = "Teacher report"
        report.text = "No report here"
        report.contents = listOf("report")
        return report
    }
}