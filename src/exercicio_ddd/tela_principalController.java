package exercicio_ddd;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class tela_principalController implements Initializable {
    @FXML
    private TextField txt_int;

    @FXML
    private Label lbl_resu;
    @FXML
    private Label lbl_erro;
    
    @FXML
    void acao(ActionEvent event) {
        try{
        int ddd;
        String estado, vazio;
        vazio = txt_int.getText();
        ddd = Integer.parseInt(vazio);
        DDDFuncao f = new DDDFuncao();
        f.add(new DDD(61,"Brasilia"));
        f.add(new DDD(71, "Salvador"));
        f.add(new DDD(11, "Sao paulo"));
        f.add(new DDD(21, "Rio de Janeiro"));
        f.add(new DDD(32, "Juiz de Fora"));
        f.add(new DDD(19, "Campinas"));
        f.add(new DDD(27, "Vitoria"));
        f.add(new DDD(31, " Belo Horizonte"));
        estado = f.achar(ddd);
        f.verificar(estado);
        f.verificarSize(vazio);
        lbl_erro.setText("");
        lbl_resu.setText("DDD: "+ txt_int.getText() + " Estado: " + estado);
        }catch(NumberFormatException e){
            lbl_resu.setText("");
            lbl_erro.setText("Caractere inválido!");
        }catch(RuntimeException e){
            lbl_resu.setText("");
            lbl_erro.setText(e.getMessage());
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}