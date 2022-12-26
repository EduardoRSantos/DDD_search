package exercicio_ddd;

public class DDD {
    private int ddd;
    private String estado;
 
    public DDD(int ddd, String estado) {
        this.ddd = ddd;
        this.estado = estado;
    }
    public DDD() {

    }   

    public int getDdd() {
        return ddd;
    }

    public String getEstado() {
        return estado;
    }
}
