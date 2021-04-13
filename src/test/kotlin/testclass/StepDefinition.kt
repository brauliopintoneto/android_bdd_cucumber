package testclass

import io.cucumber.java.PendingException
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When


class StepDefinition {

    @Given("Dado que eu queira verificar se a soma X e Y e par")
    fun dado_que_eu_queira_verificar_se_a_soma_x_e_y_e_par() {
//        // Write code here that turns the phrase above into concrete actions
//        throw PendingException()
    }

    @When("quando eu digito o numero x {int}")
    fun quando_eu_digito_o_numero_x(int1: Int?) {
        // Write code here that turns the phrase above into concrete actions
//        throw PendingException()
    }

    @When("e digito o numero y {string}")
    fun e_digito_o_numero_y(string: String?) {
//        // Write code here that turns the phrase above into concrete actions
//        throw PendingException()
    }

    @Then("eu quero verificar se a soma e par")
    fun eu_quero_verificar_se_a_soma_e_par() {
//        // Write code here that turns the phrase above into concrete actions
//        throw PendingException()
    }

}