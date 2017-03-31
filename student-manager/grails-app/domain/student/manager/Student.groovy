package student.manager

class Student {
    String firstName
    String lastName
    String email
    String phone 
    Float gpa // Current total GPA from accumulated semesters
    Integer totalCredits // Total overall completed credits
    Integer currentCredits // Credits for this current semester 
   
    // A student can be enrolled or completed many classes
    // The below relationship will show past classes and not just currently
    // enrolled classes
    static hasMany = [classes: EnrolledStudent]
    static mapping = {
        id column: "id", generator: "assigned"
        version: false
      }

    //TODO Create a helper function that loads the classes the student is
    //currently enroleld and excludes the completed courses
  
    // Shouldn't be any null fields, default the GPA to 0 at initialization
    static constraints = {}
}
