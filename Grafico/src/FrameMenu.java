// swing prepara a interface gráfica
public class FrameMenu extends javax.swing.JFrame {

    public FrameMenu() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); // abre o frame centralizado
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuarquivo = new javax.swing.JMenu();
        itemCadastroMenuArquivo = new javax.swing.JMenuItem();
        menuEditar = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();
        itemFinalizarMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\2830482421017\\Downloads\\teste.jpg")); // NOI18N
        jLabel1.setText("texto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(532, Short.MAX_VALUE))
        );

        menuarquivo.setText("Arquivo");

        itemCadastroMenuArquivo.setText("Cadastro");
        itemCadastroMenuArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadastroMenuArquivoActionPerformed(evt);
            }
        });
        menuarquivo.add(itemCadastroMenuArquivo);

        jMenuBar1.add(menuarquivo);

        menuEditar.setText("Editar");
        jMenuBar1.add(menuEditar);

        menuSobre.setText("Sobre");
        jMenuBar1.add(menuSobre);

        menuSair.setText("Sair");

        itemFinalizarMenuSair.setText("Finalizar");
        itemFinalizarMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFinalizarMenuSairActionPerformed(evt);
            }
        });
        menuSair.add(itemFinalizarMenuSair);

        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // método que não retorna nada, actionPerformed, ele vai entender e executar apenas quando clicar
    private void itemFinalizarMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFinalizarMenuSairActionPerformed
        
        System.exit(0); // finalizando a aplicação
    }//GEN-LAST:event_itemFinalizarMenuSairActionPerformed

    private void itemCadastroMenuArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadastroMenuArquivoActionPerformed
        //chamando outro frame
        FrameCadastro janelaCadastro = new FrameCadastro(); //criando o frame  em memória
        janelaCadastro.setVisible(true); // exibe o frame
    }//GEN-LAST:event_itemCadastroMenuArquivoActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCadastroMenuArquivo;
    private javax.swing.JMenuItem itemFinalizarMenuSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuEditar;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenu menuarquivo;
    // End of variables declaration//GEN-END:variables
}
