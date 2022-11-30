public class Secretario extends Funcionario implements Prioridade{

    private String idiomaFalado;

    public String getIdiomaFalado() {
        return idiomaFalado;
    }

    public void setIdiomaFalado(String idiomaFalado) {
        this.idiomaFalado = idiomaFalado;
    }

    @Override
    public boolean autentica() {
        if(idiomaFalado == "inglês"){
            return true;
        }
        return false;
    }
}
