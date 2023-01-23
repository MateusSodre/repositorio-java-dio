public class MinhaClasse {

    public static void main (String [] args) {
      // teste aula anatomia das classes -3
        String primeiroNome = "Mateus";
        String segundoNome = "Sodre";

        String  nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

        }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat("").concat(segundoNome);
    }


    
}
