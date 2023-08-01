import java.util.*;

public class Vouchers {
    Set<String> itens = new HashSet<>();

    public Vouchers(){
        itens.add("Etec-Teste");
        Random gerador = new Random();
        for (int i = 0 ; i < 20 ; i++){
            String chave = "Etec" + gerador.nextInt(30);
            itens.add(chave);
        }
    }

    void validar(String item){
        var result = itens.stream().filter(e  -> item.equalsIgnoreCase(e)).findAny();
        if (result.isPresent()){
            System.out.println("Cupom Válido");
        }else{
            System.out.println("Cupom Inválido");
        }
    }

    void exibir(){
        itens.forEach(e -> System.out.println(e));
    }

}
