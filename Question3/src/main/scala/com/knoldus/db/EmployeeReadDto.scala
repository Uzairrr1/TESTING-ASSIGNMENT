package com.knoldus.db

import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class EmployeeReadDto {

  val lokeshEmployee: Employee = Employee("Mohd","Uzair",21,15000,"Intern","knoldus","mohd.uzair@knoldus.com")
  val rahulEmployee: Employee = Employee("Chiranjeeve","Kumar",28,15000,"Software Engineer","Knoldus","chiranjeeve.kumar@philips.com")

  val employees: HashMap[String, Employee] = HashMap("Uzair" -> lokeshEmployee, "Chiranjeeve" -> chiranjeeveEmployee)
  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)

}
