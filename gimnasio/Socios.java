
package gimnasio;


import java.sql.*;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

//SE CREA CLAS SOCIOS CON METODOS SWING
public class Socios extends javax.swing.JFrame {

   
    
    // CONSTRUCTOR CCON METODO QUE INICIA Y MMUESTRA
    public Socios() {
        initComponents();
        DisplayResultados();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Edad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Peso = new javax.swing.JTextField();
        Genero = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Km_recorridos = new javax.swing.JTextField();
        EliminarButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        Fecha = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaResultados = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        imprimirButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel7.setFont(new java.awt.Font("Amiri", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Log out");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel7)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Amiri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 153, 255));
        jLabel4.setText("X");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Amiri", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 255));
        jLabel5.setText("Datos");

        Nombre.setBackground(new java.awt.Color(255, 255, 255));
        Nombre.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Amiri", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("Edad");

        jLabel10.setFont(new java.awt.Font("Amiri", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("Lista resultados");

        Edad.setBackground(new java.awt.Color(255, 255, 255));
        Edad.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Amiri", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 153, 255));
        jLabel11.setText("Peso");

        Peso.setBackground(new java.awt.Color(255, 255, 255));
        Peso.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N

        Genero.setBackground(new java.awt.Color(204, 204, 204));
        Genero.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        Genero.setForeground(new java.awt.Color(51, 153, 255));
        Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel12.setFont(new java.awt.Font("Amiri", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 153, 255));
        jLabel12.setText("Género");

        jLabel13.setFont(new java.awt.Font("Amiri", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 153, 255));
        jLabel13.setText("Km recorridos");

        Km_recorridos.setBackground(new java.awt.Color(255, 255, 255));
        Km_recorridos.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N

        EliminarButton.setBackground(new java.awt.Color(255, 255, 255));
        EliminarButton.setFont(new java.awt.Font("Amiri", 0, 14)); // NOI18N
        EliminarButton.setForeground(new java.awt.Color(0, 0, 0));
        EliminarButton.setText("Eliminar");
        EliminarButton.setOpaque(false);
        EliminarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarButtonMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Amiri", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 153, 255));
        jLabel14.setText("Fecha");

        Fecha.setBackground(new java.awt.Color(255, 255, 255));
        Fecha.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        Fecha.setText("dd/mm/aaaa");

        jLabel15.setFont(new java.awt.Font("Amiri", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 153, 255));
        jLabel15.setText("Código Usuario");

        TablaResultados.setFont(new java.awt.Font("Amiri", 0, 18)); // NOI18N
        TablaResultados.setForeground(new java.awt.Color(51, 153, 255));
        TablaResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Llave"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaResultados.setRowHeight(28);
        TablaResultados.setSelectionBackground(new java.awt.Color(51, 153, 255));
        TablaResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaResultadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaResultados);
        if (TablaResultados.getColumnModel().getColumnCount() > 0) {
            TablaResultados.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel16.setFont(new java.awt.Font("Amiri", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 153, 255));
        jLabel16.setText("Nombre");

        Codigo.setBackground(new java.awt.Color(255, 255, 255));
        Codigo.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(255, 255, 255));
        addButton.setFont(new java.awt.Font("Amiri", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(0, 0, 0));
        addButton.setText("Añadir");
        addButton.setOpaque(false);
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });

        imprimirButton.setBackground(new java.awt.Color(255, 255, 255));
        imprimirButton.setFont(new java.awt.Font("Amiri", 0, 14)); // NOI18N
        imprimirButton.setForeground(new java.awt.Color(0, 0, 0));
        imprimirButton.setText("Imprimir");
        imprimirButton.setOpaque(false);
        imprimirButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imprimirButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel10)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel16)
                                                .addGap(39, 39, 39)
                                                .addComponent(jLabel11))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36)
                                        .addComponent(Km_recorridos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel9)
                                        .addGap(47, 47, 47)
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                        .addComponent(jLabel14)
                                        .addGap(76, 76, 76))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Codigo)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(80, 80, 80)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imprimirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Km_recorridos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EliminarButton)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(imprimirButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

                                          
        
  
    
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        new Registro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    //DEFINEN VARIABLES PARA CONEXION CON BBDD
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null,Rs1 = null;
    Statement St = null,St1 = null;
    
    //SE CREA METODO PARA MOSTRAR DATOS EN PANTALLA Y PARA CONECTAR CON BBDD
    private void DisplayResultados(){
        
        
        try{
            
             Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gimnasio?serverTimezone=UTC&user=root&password=Scud12");
             //Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gimnasio?serverTimezone=UTC", "root", "Scud12");
             St = Con.createStatement();
             Rs = St.executeQuery("select *  from datos ");
             
    
                    
             
             
             TablaResultados.setModel(DbUtils.resultSetToTableModel(Rs));
             
        }catch(Exception e){
                
    }
    }
    
    int DatosNumero = 0;
    int llave = 0; 
    
    //accede a bbdd
    private void CuentaResultados(){
        
        try{
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select MAX(Peso) from datos");
            Rs1.next();
            DatosNumero = Rs1.getInt(1)+1;
            
        }catch(Exception e){
            
        }
    }
    
       
            //METODO QUE REFLEJA LOS DATOS INTRODUCIDOS
    private void TablaResultadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaResultadosMouseClicked
      
        
        
        
        DefaultTableModel tabla1 = (DefaultTableModel)TablaResultados.getModel();
       int Indice = TablaResultados.getSelectedRow();
       llave = Integer.valueOf(tabla1.getValueAt(Indice, 0).toString());
        Codigo.setText(tabla1.getValueAt(Indice,0).toString());
       Nombre.setText(tabla1.getValueAt(Indice,1).toString());
       Peso.setText(tabla1.getValueAt(Indice,2).toString());
       Edad.setText(tabla1.getValueAt(Indice,3).toString());
       Km_recorridos.setText(tabla1.getValueAt(Indice,4).toString());
       Genero.setSelectedItem(tabla1.getValueAt(Indice,5).toString());
       Fecha.setText(tabla1.getValueAt(Indice,6).toString());
      DisplayResultados();
       
    }//GEN-LAST:event_TablaResultadosMouseClicked

    //METODO PARA EL BOTON ELIMINAR
    private void EliminarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarButtonMouseClicked
        
        if(llave == 0){
            JOptionPane.showMessageDialog(this, "Elige el resultado a borrar");
        }else{
            
            try{
                
               // Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gimnasio?user=root&password=Scud12");
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gimnasio?serverTimezone=UTC&user=root&password=Scud12");
                String accion = "Delete from datos where Codigo="+llave;
                Statement borrar = Con.createStatement();
                borrar.executeUpdate(accion);
                JOptionPane.showMessageDialog(this, "Resultado borrado");
                DisplayResultados();
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
                
            }
            
        }
            
    }//GEN-LAST:event_EliminarButtonMouseClicked

    private void CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoActionPerformed
    //METODO PARA SALIR DEL PROGARMA
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    //METODO PAR ANIADIR
    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        
        if(Nombre.getText().isEmpty() ||  Peso.getText().isEmpty() || Edad.getText().isEmpty() || 
                Km_recorridos.getText().isEmpty() || Fecha.getText().isEmpty() || Codigo.getText().isEmpty() || Genero.getSelectedIndex() == -1){
            
            JOptionPane.showMessageDialog(this, " Falta información ");
            
        }else{
            
            try{
              
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gimnasio" + "?serverTimezone=UTC", "root", "Scud12");
                PreparedStatement Add = Con.prepareStatement("insert into datos values(?,?,?,?,?,?,?)");
               
                Add.setInt(1, Integer.valueOf(Codigo.getText()));
                Add.setString(2, Nombre.getText());
                Add.setDouble(3, Double.valueOf(Peso.getText()));
                Add.setInt(4, Integer.valueOf(Edad.getText()));
                Add.setDouble(5, Double.valueOf(Km_recorridos.getText()));
                Add.setString(6, Genero.getSelectedItem().toString());
                Add.setString(7, Fecha.getText());
                
                
                int linea = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, " Datos guardados ");
                Con.close();
                 DisplayResultados();
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
        }
                
        
    }//GEN-LAST:event_addButtonMouseClicked
    
    //METODO PARA IMPRMIR PANTALLA
    private void imprimirButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimirButtonMouseClicked
        
        try{
            
            TablaResultados.print();
            
        }catch(Exception e){
            
            
        }
        
        
    }//GEN-LAST:event_imprimirButtonMouseClicked

      
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Socios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Socios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Socios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Socios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Socios().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField Edad;
    private javax.swing.JButton EliminarButton;
    private javax.swing.JTextField Fecha;
    private javax.swing.JComboBox<String> Genero;
    private javax.swing.JTextField Km_recorridos;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField Peso;
    private javax.swing.JTable TablaResultados;
    private javax.swing.JButton addButton;
    private javax.swing.JButton imprimirButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

   
}
