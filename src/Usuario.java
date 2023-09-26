public class Usuario {
    private String nome;
    private String ra;

    public Usuario(String nome, String ra){
        this.nome = nome;
        this.ra = ra;
    }

    public String getRa(){
        return ra;
    }

    private String[] cadastrados = {"001", "002", "003", "004", "005"};

    public String verificarDado(String ra){
        for (String ra : cadastrados){
            if (ra.equals(cadastrados)){
                return true;
            }
        }
        return false;
    }
}
