package br.com.controlevendas.view;

import br.com.controlevendas.dao.ItemVendaDao;
import br.com.controlevendas.dao.ProdutosDao;
import br.com.controlevendas.dao.VendasDao;
import br.com.controlevendas.model.Clientes;
import br.com.controlevendas.model.ItemVenda;
import br.com.controlevendas.model.Produtos;
import br.com.controlevendas.model.Vendas;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmPagamentos extends javax.swing.JFrame {
    
    Clientes cliente_id = new Clientes();
    DefaultTableModel carrinho;
    
    public FrmPagamentos() {
        initComponents();
        
        // Para os campos iniciarem preenchidos com um valor
        // é necessario setar aqui na inicialização da tela
        
        txtdinheiro.setText("0");
        txtcartao.setText("0");
        txtcheque.setText("0");
        txttroco.setText("0");
        
        // Inicia a aplicação no centro da tela
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtdinheiro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcartao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcheque = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttroco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        btnFinalizarVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela de Pagamentos");

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setToolTipText("");

        jLabel1.setBackground(new java.awt.Color(0, 102, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pagamentos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DINHEIRO:");

        txtdinheiro.setBackground(new java.awt.Color(255, 255, 255));
        txtdinheiro.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        txtdinheiro.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CARTÃO:");

        txtcartao.setBackground(new java.awt.Color(255, 255, 255));
        txtcartao.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        txtcartao.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CHEQUE:");

        txtcheque.setBackground(new java.awt.Color(255, 255, 255));
        txtcheque.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        txtcheque.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("TROCO:");

        txttroco.setEditable(false);
        txttroco.setBackground(new java.awt.Color(204, 204, 204));
        txttroco.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        txttroco.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("TOTAL:");

        txttotal.setEditable(false);
        txttotal.setBackground(new java.awt.Color(204, 204, 204));
        txttotal.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        txttotal.setForeground(new java.awt.Color(0, 0, 0));

        btnFinalizarVenda.setBackground(new java.awt.Color(153, 153, 153));
        btnFinalizarVenda.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        btnFinalizarVenda.setForeground(new java.awt.Color(0, 0, 0));
        btnFinalizarVenda.setText("Finalizar Venda");
        btnFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcartao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcheque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttroco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtdinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtdinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Calcula o troco seleciona o metodo de pagamento e finaliza a venda
    private void btnFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVendaActionPerformed
        
        double pcartao;
        double pcheque;
        double pdinheiro;
        double ptotalrecebido;
        double totalvenda;
        double troco;
        
        // variaveis recebem os valores digitados nos campos
        pcartao = Double.parseDouble(txtcartao.getText());
        pcheque = Double.parseDouble(txtcheque.getText());
        pdinheiro = Double.parseDouble(txtdinheiro.getText());
        
        // total venda recebe o valor da venda
        totalvenda = Double.parseDouble(txttotal.getText());
        
        // Calcula o total recebido
        ptotalrecebido = pcartao + pcheque + pdinheiro;
        
        // Após calcular o valor recebido pra fazer o pagamento calcula o troco
        troco = ptotalrecebido - totalvenda;
        
        // Inseri no input o valor do troco
        txttroco.setText(String.valueOf(troco));
        
        Vendas objvenda = new Vendas();
        
        // Dados do cliente sera necessario somente o id mas é passado todo o objeto
        objvenda.setCliente(cliente_id);
        
        // Pega a data a venda
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String data = dateFormat.format(now);
        
        // inseri a data da venda no atributo
        objvenda.setData_venda(data);
        
        // Total da venda
        objvenda.setTotal_venda(totalvenda);
        
        // Instancia o dao para enviar o objeto vendas para a camada dao (sql)
        VendasDao daoVendas = new VendasDao();
        
        // envia os dados da venda para o metodo dao
        daoVendas.cadastrarVenda(objvenda);
        
        // Retorna o id da ultima venda
        objvenda.setId(daoVendas.retornaUltimaVenda());
        
        // Cadastra os itens da venda
        for(int i = 0; i < carrinho.getRowCount(); i++){
            
            int qtd_estoque;
            int qtd_itens;
            int qtd_atual;
            
            //carrinho.getRowCount() retorna a quantidade de linhas da tabela 
            
            ProdutosDao dao_produto = new ProdutosDao();
            Produtos produtos = new Produtos();
            ItemVenda item = new ItemVenda();
            
            // Pega o objeto venda e seta os valores nos atributos da classe
            item.setVenda(objvenda);
            
            // Pega o valor da coluna codigo
            produtos.setId(Integer.parseInt(carrinho.getValueAt(i, 0).toString()));
            item.setProduto(produtos);
            
            // Pega o valor da coluna quantidade
            item.setQtd(Integer.parseInt(carrinho.getValueAt(i, 2).toString()));
            
            // Pega o total somado preço x quantidade do item na coluna subtotal
            item.setSubtotal(Double.parseDouble(carrinho.getValueAt(i, 4).toString()));
            
            // Istancia a classe ItemVendaDao para ter acesso ao metodo de cadastrarItem
            ItemVendaDao daoitem = new ItemVendaDao();
            
            // envia o objeto item
            daoitem.cadastraItem(item);
            
            // APÓS ADICIONAR OS ITENS DA VENDA INICIA A BAIXA NO ESTOQUE
            
            int produto_id = Integer.parseInt(carrinho.getValueAt(i, 0).toString());
            
            qtd_estoque = dao_produto.retornaEstoqueAtual(produto_id);
            qtd_itens = Integer.parseInt(carrinho.getValueAt(i, 2).toString());
            
            // Subtrai do estoque a quantidade de itens comprado
            qtd_atual = qtd_estoque - qtd_itens;
            
            // Envia o id do produto e a quantidade atualizada para o dao de inserção no banco
            dao_produto.baixaEstoque(produto_id, qtd_atual);
            
        }
        
        // Só mostra a mensagem após a venda adicionada e os itens da venda tambem adicionados
        JOptionPane.showMessageDialog(null, "Venda Registrada com sucesso!!!");
    }//GEN-LAST:event_btnFinalizarVendaActionPerformed
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPagamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPagamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcartao;
    private javax.swing.JTextField txtcheque;
    private javax.swing.JTextField txtdinheiro;
    public javax.swing.JTextField txttotal;
    private javax.swing.JTextField txttroco;
    // End of variables declaration//GEN-END:variables
}
