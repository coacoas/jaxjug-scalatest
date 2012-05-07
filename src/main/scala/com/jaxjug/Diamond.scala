package com.jaxjug

trait Person {
	def officeHours: String
}

trait Worker extends Person {
	override def officeHours: String = "9 to 5"
}

trait Student extends Person {
	override def officeHours: String = "7 to 3"
}

object StudentWorker extends Worker with Student

object TestStudentWorker extends App { 
	println (StudentWorker.officeHours)
}