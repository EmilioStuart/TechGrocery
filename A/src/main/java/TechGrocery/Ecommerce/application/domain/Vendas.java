package TechGrocery.Ecommerce.application.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.LinkedList;

@Document(collection = "TechGroceryVendas")
public class Vendas {
    @Id
    int idVenda;
    LinkedList<Produto> itensVenda;
    int idCliente;
    Date dataVenda;
    double total;

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public LinkedList<Produto> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(LinkedList<Produto> itensVenda) {
        this.itensVenda = itensVenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    @Override
    public String toString() {
        return "Vendas{" +
                "idVenda=" + idVenda +
                ", itensVenda=" + itensVenda +
                ", idCliente=" + idCliente +
                ", dataVenda=" + dataVenda +
                ", total=" + total +
                '}';
    }
}
