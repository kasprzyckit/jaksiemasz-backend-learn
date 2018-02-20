package data.domain

import Gender.Gender

abstract class AbstractEmployee(val firstName: String,
                                val lastName: String,
                                val role: String,
                                var email: Email,
                                val gender: Gender,
                                val country: String,
                                val university: String,
                                val supervisor: Manager) extends Employee {

  override def toString: String = firstName + " " + lastName + " (" + role +")"

  def name: String = firstName + " " + lastName
}
