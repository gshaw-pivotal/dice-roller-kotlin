package gs.dice.diceroller

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.context.embedded.LocalServerPort
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.Matchers.containsString
import org.junit.Assert.assertThat
import org.springframework.beans.factory.annotation.Autowired

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DiceRollerApplicationTest {

    @Autowired
    private lateinit var restTemplate: TestRestTemplate

    @Test
    fun checkApplicationStartedAndIsHealthy() {
        val response = restTemplate.getForEntity("/health", String::class.java)

        assertThat<HttpStatus>(response.statusCode, equalTo<HttpStatus>(HttpStatus.OK))
        assertThat<String>(response.body, containsString("UP"))
    }
}
