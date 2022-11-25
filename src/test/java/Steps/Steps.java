package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	Metodos m = new Metodos();
	
	Elementos e = new Elementos();
	
	
	
	@Given("que o usuario acesse a url {string}")
	public void que_o_usuario_acesse_a_url(String url) {
	   m.abrirNavegador(url);
	}

	@Given("selecionar o botao abrir conta")
	public void selecionar_o_botao_abrir_conta() {
	    m.clicar(e.getBtnAbrirConta());
	}

	@Given("selecionar o botao abrir conta para voce")
	public void selecionar_o_botao_abrir_conta_para_voce() {
	    m.clicar(e.getBtnAbrirContaParaVoce());
	    
	}

	@When("preencher o formulario de abertura de conta")
	public void preencher_o_formulario_de_abertura_de_conta() {
		m.preencher(e.getCampoNome(), "Daniela");
		m.preencher(e.getCampoTelefone(), "11111111111");
		m.preencher(e.getCampoEmail(), "teste@teste.com.br");
		m.preencher(e.getCampoCpf(), "47399529809");
	   
	
	}		   
			   @When("selecionar o botao quero ser cliente")
	public void selecionar_o_botao_quero_ser_cliente() {
		m.clicar(e.getBtnQueroSerCliente());
	}


   @Then("sera exibido o texto falta pouco")
	public void sera_exibido_o_texto_falta_pouco() {
	}
 
   
   // PESSOA JURIDICA
   
   
   @Given("selecionar o botao abrir conta para sua empresa")
   public void selecionar_o_botao_abrir_conta_para_sua_empresa() {
      m.clicar(e.getAbrirContaParaSuaEmpresa());
   }

   @Given("selecionar o botao pessoa unica")
   public void selecionar_o_botao_pessoa_unica() {
	   
      
   }

   @Then("selecionar o botao enviar")
   public void selecionar_o_botao_enviar() {
      
   }
}
