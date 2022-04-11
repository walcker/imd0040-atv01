public class Primos {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Você deve passar um parâmetro.");
            System.exit(0);
        }
        int qnt = Integer.parseInt(args[0]); //Converte para número a entrada
        //TODO imprimir N primos
        int aux2 = 0;
        for (int i = 1; ; i++) {
            int aux = 0;
            for (int j = 1; j <= i; j++) { // Um for dentro de outo para dividir todos os numeros
                // até o escolhido pelo argumento
                if (i % j == 0) ++aux; //Incrementa a variável AUX caso encontre uma divisão sem resto.
            }
            if (aux == 2) {  //Se no final AUX for igual a 2 é porque o número foi dividido por 1 e ele mesmo,
                // portanto é primo.
                System.out.println(i);
                ++aux2;

                }
            if(aux2 == qnt){
                break;
            }
        }
    }
}
