
package churrasco;

public class TesteChurrasco {

    public static void main(String[] args) {

                Pessoa p = new Pessoa();
		p.nome = "Ana";
		p.idade = 55;
		p.sexo = "f";
		p.vegetariana = false;

                		
                QtdeCarne v = new QtdeCarne();
		v.VerificarConsumo (p.idade, p.vegetariana);
    }

}
