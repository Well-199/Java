package br.com.controlevendas.model;

public class Vendas {
    
    private int id;
    private Clientes cliente;
    private String data_venda;
    private Double total_venda;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }

    public Double getTotal_venda() {
        return total_venda;
    }

    public void setTotal_venda(Double total_venda) {
        this.total_venda = total_venda;
    }

}
