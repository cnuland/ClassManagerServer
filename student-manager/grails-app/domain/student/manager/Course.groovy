package student.manager
import java.sql.Timestamp

class Course {
    String name
    String title
    Timestamp time  
  
    // This system only offers classes on M-W-F, T-Th, and an extended once
    // a week class on Friday only 
    enum Days {
      MWF, TTHR, FRI
    }
    Days daysActive
    
     //The semester the class takes place 
    enum Semester {
      SPRING, FALL, SUMMER
    }
    Semester semester
    //The year the class took place
    Integer year
    //Is the class currently taking place, this could show if the class has been canceled
    Boolean isCurrent
    //Setting this up to only have one faculty member but a better approach
    //would be a many to many relationship to take into account more than one
    //faculty member, or possibly a TA?
     
    static belongsTo = Faculty
    // A class can have many enrolled students 
    static hasMany = [students: EnrolledStudent]
    static constraints = {}
    static mapping = {
         id column: "id", generator: "assigned"
         version: false
        }
     
}
