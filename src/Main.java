public class Main {
    public static void main (String[]arg){
        try{
            char carattere ='A';
            verificaNumero(carattere);
            System.out.println("é un numero");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void verificaNumero(char carattere) throws Exception {
        if (carattere >= '0' && carattere <= '9') {
            System.out.println("Il carattere è un numero.");
        } else {
            throw new Exception("Il carattere non è un numero.");
        }
    }
}