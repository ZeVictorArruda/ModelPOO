public class Main {
    public static void main(String[] args) {
        Engenheiro eng = new Engenheiro();
        Secretario sec = new Secretario();
        Motorista mot = new Motorista();
        Gerente ger = new Gerente();

        eng.setNome("Renato");
        eng.setCodigo(1);
        eng.setEndereco("Rua tal");
        eng.setCrea("1234");

        sec.setNome("Lucas");
        sec.setCodigo(2);
        sec.setEndereco("Rua tal");
        sec.setIdiomaFalado("inglês");

        mot.setNome("João");
        mot.setCodigo(3);
        mot.setEndereco("Rua tal");
        mot.setNumeroCNH("3334");

        ger.setNome("Matheus");
        ger.setCodigo(4);
        ger.setEndereco("Rua tal");
        ger.setDepartamento("RH");

        System.out.println(eng);
        System.out.println(eng.getClass());
        System.out.println(sec);
        System.out.println("Autentica: " + sec.autentica());
        System.out.println(mot);
        System.out.println(ger);
        System.out.println("Autentica: " + sec.autentica());

    }
}