package de.pifrasso

import de.pifrasso.controller.FirstController
import de.pifrasso.controller.HelloController
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * The main entry point to the application
 */
@EnableAutoConfiguration
@Configuration
class Application{
    @Bean
    fun controller() = FirstController()
    @Bean
    fun controller2() = HelloController()
}

/**
 * Run the application
 * @param args The command line arguments
 */
fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}