package TechGrocery.Ecommerce.application.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "TechGroceryPublic")
public class Cliente {
    @Id
    String sEmail;
    String sSenha;
    String sCpf;
    String sTelefone;

    public Cliente(String sEmail, String sSenha,  String sCpf, String sTelefone) {
        this.sEmail = sEmail;
        this.sSenha = sSenha;
        this.sCpf = sCpf;
        this.sTelefone = sTelefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "sEmail='" + sEmail + '\'' +
                ", sSenha='" + sSenha + '\'' +
                ", sCpf='" + sCpf + '\'' +
                ", sTelefone='" + sTelefone + '\'' +
                '}';
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public void setsSenha(String sSenha) {
        this.sSenha = sSenha;
    }

    public void setsCpf(String sCpf) {
        this.sCpf = sCpf;
    }

    public void setsTelefone(String sTelefone) {
        this.sTelefone = sTelefone;
    }

    public String getsEmail() {
        return sEmail;
    }

    public String getsSenha() {
        return sSenha;
    }

    public String getsCpf() {
        return sCpf;
    }

    public String getsTelefone() {
        return sTelefone;
    }
}