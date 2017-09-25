package de.pifrasso.controller

import de.pifrasso.model.User
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.Instant

/**
 * Our very first controller
 */
@RestController
class FirstController {
    /** The ultimate answer to life, the universe and everything */
    @RequestMapping("/answer")
    fun answer() = 42


    /** Get the details of a user */
    @RequestMapping("/user")
    fun getUser() : User {
        val user = User(
                username = "grahamcox",
                screenName = "Graham",
                email = "grahamcox@example.com",
                registered = Instant.now()
        )
        return user
    }

    /**
     * Perform some string manipulation on the given value
     * @param value The value to manipulate
     * @param operation The operation to perform
     */
    @RequestMapping("/string/{value}")
    fun manipulateString(@PathVariable("value") value: String,
                         @RequestParam(name = "operation", defaultValue = "none") operation: String) : String {
        return when (operation.toUpperCase()) {
            "REVERSE" -> value.reversed()
            "UPPER" -> value.toUpperCase()
            "LOWER" -> value.toLowerCase()
            else -> value
        }
    }
}