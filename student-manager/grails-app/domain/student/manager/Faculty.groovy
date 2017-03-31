package student.manager

class Faculty {
    String firstName
    String lastName
     //What type of status do they hold at the school  
    enum Status {
      ASSOCIATE, FULL, DISTINGUISHED
      }
    Status status    
    
    Integer yearHired
    
    //TODO eventually a helper function to get all of the students that the
    //professor has taught would be helpful

    static hasMany = [courses: Course]
    static mapping = {
      id column: "id", generator: "assigned"
      version: false
      }
    static constraints = {
    }
}
