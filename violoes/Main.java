public class Main {
    public static void main(String[] args) {
        try {

            ViolaoClássico violaoClássicoPrototype = new ViolaoClássico();
            ViolaoClássico violaoClássicoClone = violaoClássicoPrototype.clone();
            violaoClássicoClone.setNumeroCordas(6);

            System.out.println("Tipo de violão: Clássico");
            System.out.println("Número de cordas: " + violaoClássicoClone.getNumeroCordas());


            ViolaoFolk violaoFolkPrototype = new ViolaoFolk();
            ViolaoFolk violaoFolkClone = violaoFolkPrototype.clone();
            violaoFolkClone.setNumeroCordas(6);

            System.out.println("Tipo de violão: Folk");
            System.out.println("Número de cordas: " + violaoFolkClone.getNumeroCordas());

            ViolaoZero violaoZeroPrototype = new ViolaoZero();
            ViolaoZero violaoZeroClone = violaoZeroPrototype.clone();
            violaoZeroClone.setNumeroCordas(6);

            System.out.println("Tipo de violão: Zero");
            System.out.println("Número de cordas: " + violaoZeroClone.getNumeroCordas());

   
            ViolaoDuploZero violaoDuploZeroPrototype = new ViolaoDuploZero();
            ViolaoDuploZero violaoDuploZeroClone = violaoDuploZeroPrototype.clone();
            violaoDuploZeroClone.setNumeroCordas(6);

            System.out.println("Tipo de violão: Duplo Zero");
            System.out.println("Número de cordas: " + violaoDuploZeroClone.getNumeroCordas());

   
            ViolaoTriploZero violaoTriploZeroPrototype = new ViolaoTriploZero();
            ViolaoTriploZero violaoTriploZeroClone = violaoTriploZeroPrototype.clone();
            violaoTriploZeroClone.setNumeroCordas(6);

            System.out.println("Tipo de violão: Triplo Zero");
            System.out.println("Número de cordas: " + violaoTriploZeroClone.getNumeroCordas());


            Violao12Cordas violao12CordasPrototype = new Violao12Cordas();
            Violao12Cordas violao12CordasClone = violao12CordasPrototype.clone();
            violao12CordasClone.setNumeroCordas(12);

            System.out.println("Tipo de violão: 12 Cordas");
            System.out.println("Número de cordas: " + violao12CordasClone.getNumeroCordas());

  
            Violao7Cordas violao7CordasPrototype = new Violao7Cordas();
            Violao7Cordas violao7CordasClone = violao7CordasPrototype.clone();
            violao7CordasClone.setNumeroCordas(7);

            System.out.println("Tipo de violão: 7 Cordas");
            System.out.println("Número de cordas: " + violao7CordasClone.getNumeroCordas());


            ViolaoFlat violaoFlatPrototype = new ViolaoFlat();
            ViolaoFlat violaoFlatClone = violaoFlatPrototype.clone();
            violaoFlatClone.setNumeroCordas(6);

            System.out.println("Tipo de violão: Flat");
            System.out.println("Número de cordas: " + violaoFlatClone.getNumeroCordas());

 
            ViolaoJumbo violaoJumboPrototype = new ViolaoJumbo();
            ViolaoJumbo violaoJumboClone = violaoJumboPrototype.clone();
            violaoJumboClone.setNumeroCordas(6);

            System.out.println("Tipo de violão: Jumbo");
            System.out.println("Número de cordas: " + violaoJumboClone.getNumeroCordas());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
