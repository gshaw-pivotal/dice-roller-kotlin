package gs.dice.diceroller

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class DiceRollerApplication

fun main(args: Array<String>) {
    SpringApplication.run(DiceRollerApplication::class.java, *args)
}
