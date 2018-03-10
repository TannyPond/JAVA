/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package churrasco;

/**
 *
 * @author Tanny_Pond
 */
public class QtdeCarne {
    double qtdCarne;
	
	void VerificarConsumo(int idade, boolean vegetariana) {
		
			if((vegetariana == true) || ((idade >= 0) && (idade < 4))) 
				System.out.println("Nao consome");
			else
				if((idade >3) && (idade <13)) 
					System.out.println("Consome 1 kg de carne");
				else 
					System.out.println("Consome 2 kg de carne");
	}
    
}
