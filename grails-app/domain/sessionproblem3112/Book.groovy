package sessionproblem3112

class Book {

    String title

    static belongsTo = [author: Person]
    static constraints = {
    }
}
