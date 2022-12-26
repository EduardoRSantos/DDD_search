
package exercicio_ddd;

import java.util.ArrayList;
import java.util.List;

public class DDDFuncao {
    private List<DDD> list = new ArrayList<>();

    public DDDFuncao() {
    }
    public void add(DDD d){
        list.add(d);
    }
    public String achar( int ddd){
        String estado = null;
        for(DDD lista:list ){
            if(lista.getDdd() == ddd){
               estado = lista.getEstado();
            }         
        }      
        return  estado;
    }
    public void verificar(String estado){
        boolean res = false;
        for(DDD lista:list ){
            if(lista.getEstado().equals(estado)){
               res  = true;
            }         
        } 
        if(res == false){
            throw new RuntimeException("DDD não encontrado ou não existe.");       
        }
        
    }
    public void verificarSize(String vazio){
//        String v = "^[0-9]+$";
//        boolean resu;
//        resu = vazio.matches(v);
        if(vazio.length() != 2){
            throw new RuntimeException("DDD inválido, são apenas 2 digitos.");
        }
    }
}
