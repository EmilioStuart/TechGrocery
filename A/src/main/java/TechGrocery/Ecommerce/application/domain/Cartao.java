package TechGrocery.Ecommerce.application.domain;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document(collection = "TechGroceryCards")
public class Cartao {
    @Id
    String sNumeroCartao;
    String sEmailCliente;
    String sNomeCartao;
    Date dtValidade;
    String sTipo;
    String sCvv;

    public Cartao(String sNomeCartao, String sEmailCliente, String sNumeroCartao, Date dtValidade, String sCvv) {
        this.sNomeCartao = sNomeCartao;
        this.sEmailCliente = sEmailCliente;
        this.sNumeroCartao = sNumeroCartao;
        this.dtValidade = dtValidade;
        this.sCvv = sCvv;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "sNomeCartao='" + sNomeCartao + '\'' +
                ", sEmailCliente='" + sEmailCliente + '\'' +
                ", sNumeroCartao='" + sNumeroCartao + '\'' +
                ", dtValidade=" + dtValidade +
                ", sTipo='" + sTipo + '\'' +
                ", sCvv='" + sCvv + '\'' +
                '}';
    }

    public String getsNumeroCartao() {
        return sNumeroCartao;
    }

    public void setsNumeroCartao(String sNumeroCartao) {
        this.sNumeroCartao = sNumeroCartao;
    }

    public String getsEmailCliente() {
        return sEmailCliente;
    }

    public void setsEmailCliente(String sEmailCliente) {
        this.sEmailCliente = sEmailCliente;
    }

    public String getsNomeCartao() {
        return sNomeCartao;
    }

    public void setsNomeCartao(String sNomeCartao) {
        this.sNomeCartao = sNomeCartao;
    }

    public Date getDtValidade() {
        return dtValidade;
    }

    public void setDtValidade(Date dtValidade) {
        this.dtValidade = dtValidade;
    }

    public String getsTipo() {
        return sTipo;
    }

    public void setsTipo(String sTipo) {
        this.sTipo = sTipo;
    }

    public String getsCvv() {
        return sCvv;
    }

    public void setsCvv(String sCvv) {
        this.sCvv = sCvv;
    }
}
