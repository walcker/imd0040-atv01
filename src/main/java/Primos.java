public class Primos {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Você deve passar um parâmetro.");
            System.exit(0);
        }
        int qnt = Integer.parseInt(args[0]); //Converte para número a entrada
        //TODO imprimir N primos
        for (int i = 1; i <= qnt; i++) {
            int aux = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) ++aux; //Incrementa a variável AUX caso encontre uma divisão sem resto.
            }
            if (aux == 2) {  //Se no final AUX for igual a 2 é porque o número foi dividido por 1 e ele mesmo,
                // portanto é primo.
                System.out.println(i);
            }
        }
    }
}
