package student.manager

class EnrolledStudent {
    Date dateCreated
    enum EnrollmentStatus {
      ENROLLED, COMPLETED, DROPPED
    }
    EnrollmentStatus status
    static belongsTo = [student: Student, course:Course]
    static constraints = {
    }
    static mapping = {
       autoTimestamp true
    }
}
