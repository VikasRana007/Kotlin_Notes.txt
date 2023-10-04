
import kotlin.random.Random
class Main {
//
//    class AgeFinder{
//        var first_person : Person = Students()
//        var second_person : Person = Teachers()
//        var third_person : Person = Admin()
//    }
//
//
//    fun main(args : Array<String>){
//        val first_person : Person = Students()
//        val second_person : Person = Teachers()
//        val third_person : Person = Admin()
//
//        first_person.age()
//        second_person.age()
//        third_person.age()
//    }
//
//}



    fun main(args : Array<String>) {

        // Create a sequence generator that will generate given sequence
        val postGenerator = generateSequence {
            Post(
                // postId is a 8 digit Long value
                postId = Random.nextLong(10000001, 88888888),
                caption =
                buildString {
                    // Repeat the same caption randomly about 1-5 times.
                    val randomValue = Random.nextInt(1, 5)
                    repeat(randomValue) {
                        append("Sample caption")
                        append(" ")
                    }
                },
                likesCount = Random.nextInt(100, 500),
                isLiked = Random.nextBoolean()
            )
        }

        // Generate sequence of posts and take 50 posts from it
        val posts = postGenerator.take(50)
        // Print each posts on console
        posts.forEach { println(it) }
    }
}