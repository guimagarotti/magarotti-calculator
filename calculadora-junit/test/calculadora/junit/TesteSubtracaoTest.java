package calculadora.junit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author guima
 * @version 1.2
 * @since Release 1.2 da aplicação - 12/11/2023
 * 
 *  Esta classe representa a realização de testes com JUnit na classe Subtracao.
 */
public class TesteSubtracaoTest {
	/**
	 * Método responsável por realizar o teste da operação de subtração, 
	 * instanciando a classe Subtracao, chamando seu método e passando os parâmetros 
	 * necessários para armazenar o valor da operação. Posteriormente, utilizando uma
	 * variável de referência, realiza o teste da classe com o assertEquals. 
	 * 	 
	 * @author guima 
	 * @return Mensagem de status de validação do resultado via console.
	 */
    @Test
    public void testeMetodoSubtracao() {
        Subtracao classeSubtracao = new Subtracao();

        Double num1 = 5.0;
    	Double num2 = 3.0;
    	
    	Double resultado = classeSubtracao.subtracao(num1, num2);
    	Double expected = 2.0;
    	
    	assertEquals(expected, resultado);
    }    
    
}
