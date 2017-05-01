import java.awt.Dimension;
import java.awt.Graphics;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CapNhat extends javax.swing.JFrame {

    public CapNhat() {
        initComponents();
        setLocationRelativeTo(null);
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
    }
    KetNoi kn =new KetNoi();
    dataSql data = new dataSql();
    private DefaultTableModel tableModel = new DefaultTableModel();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pnl1 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src\\Images\\logo0.PNG");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbLoai = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbHocky = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbNamhoc = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtTenDT = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCapnhat = new javax.swing.JTable();
        btnTim = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));

        btnHome.setBackground(new java.awt.Color(153, 204, 255));
        btnHome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome)
                .addContainerGap())
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(btnHome)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Type of topic");

        cbLoai.setBackground(new java.awt.Color(51, 153, 255));
        cbLoai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Project", "Thesis" }));
        cbLoai.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Semester");

        cbHocky.setBackground(new java.awt.Color(51, 153, 255));
        cbHocky.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbHocky.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "1", "2", "Summer" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Year");

        cbNamhoc.setBackground(new java.awt.Color(51, 153, 255));
        cbNamhoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbNamhoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "2010-2011", "2011-2012", "2012-2013", "2013-2014", "2014-2015", "2015-2016", "2016-2017", "2017-2018", "2018-2019", "2019-2020" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name of topic");

        txtTenDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTenDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenDTActionPerformed(evt);
            }
        });
        txtTenDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenDTKeyPressed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(153, 204, 255));
        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Add.png"))); // NOI18N
        btnThem.setText("Add");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(153, 204, 255));
        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Edit1.png"))); // NOI18N
        btnSua.setText("Modify");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(153, 204, 255));
        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Delete.png"))); // NOI18N
        btnXoa.setText("Delete");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tblCapnhat = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        tblCapnhat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Topic ID", "Topic Name", "Student", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCapnhat.setFocusable(false);
        tblCapnhat.getTableHeader().setReorderingAllowed(false);
        tblCapnhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCapnhatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCapnhat);
        if (tblCapnhat.getColumnModel().getColumnCount() > 0) {
            tblCapnhat.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        btnTim.setBackground(new java.awt.Color(153, 204, 255));
        btnTim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search1.png"))); // NOI18N
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnSua)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addGap(69, 69, 69))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbHocky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenDT, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTim)
                            .addComponent(cbNamhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbHocky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbNamhoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTim)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTenDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        MainPage m = new MainPage();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed
    
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            kn.KN();
            int r = tblCapnhat.getSelectedRow();
            Object madt = tableModel.getValueAt(r, 0);
            if (JOptionPane.showConfirmDialog(rootPane, "Are you sure?", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                tableModel.removeRow(r);
                KetNoi.s.execute("Delete from NHOM where maDT=" + madt + "");
                KetNoi.s.execute("Delete from DIEM where maDT=" + madt + "");
                KetNoi.s.execute("Delete from DETAI where maDT=" + madt + "");
                JOptionPane.showMessageDialog(rootPane, " Delete sucessfully.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        Them t = new Them();
        t.txtTendetai.setText(txtTenDT.getText());
        t.setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed
    public String linkBC( String s){
        if( "null".equals(s)){
            return "No file";
        }
        else {
            String [] link = (s.replace("\\", "*")).split("[*]");
            return link[link.length - 1];
        }
    } 
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int row = tblCapnhat.getSelectedRow();
        Object id = tableModel.getValueAt(row,0);
        kn.KN();
        ResultSet r = null;
        try {
            r = KetNoi.s.executeQuery("Select Distinct tenDT, linkBC, loaiDT, ngayBD, ngayKT, tinhTrang, hocKi, namHoc from DETAI, DIEM where DETAI.maDT = DIEM.maDT and DETAI.maDT = "+id+"");
            
            Sua s = new Sua();
            if(r.next()){  
                s.Path = r.getString(2);
                s.txtTendetai.setText(r.getString(1));
                s.btnCapnhattep.setText(linkBC((String)r.getString(2)));
                s.cbLoai.setSelectedItem(r.getString(3));
                s.txtNgaybd.setText(r.getString(4));
                s.txtNgaykt.setText(r.getString(5));
                s.cbTinhtrang.setSelectedItem(r.getString(6));
                s.cbHocky.setSelectedItem(r.getString(7));
                s.cbNamhoc.setSelectedItem(r.getString(8));
            }
            
            data.DataSinhvien((int)id, s.tblSinhvien);
            data.DataCanbo((int)id, s.tblDiem);
            for(int i = 0; i < s.tblDiem.getRowCount(); i++){
                if(s.cbTinhtrang.getSelectedItem() != "Completed"){
                    s.tblDiem.setValueAt("null", i, 5);
                }
            }
            s.maDT = (int)id;
            s.setVisible(true);
            KetNoi.con.close();
        } catch (SQLException ex) {
        }
        
    }//GEN-LAST:event_btnSuaActionPerformed


    private void txtTenDTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenDTKeyPressed

    }//GEN-LAST:event_txtTenDTKeyPressed
    
    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        btnSua.setEnabled(false);
        btnXoa.setEnabled(false);
        try{
            kn.KN();
            tableModel = new DefaultTableModel();
            String []colsName = {"Topic ID", "Topic name", "Leader", "State"};
            tableModel.setColumnIdentifiers(colsName);
            tblCapnhat.setModel(tableModel);
            Object rows[] = new Object[4];  
            ResultSet r;
            
            if( cbLoai.getSelectedItem() == "All"){
                if(cbHocky.getSelectedItem() == "All"){
                    if(cbNamhoc.getSelectedItem() == "All"){
                        if(txtTenDT.getText().equals("")){
                            r = KetNoi.s.executeQuery("Select DISTINCT DETAI.maDT, tenDT, tenSV, tinhTrang from DETAI, NHOM, SINHVIEN where DETAI.maDT = NHOM.maDT and SINHVIEN.maSV = NHOM.maSV and truongNhom = 'true'");
                            while (r.next()) {
                                rows[0] = r.getInt(1);
                                rows[1] = r.getString(2);
                                rows[2] = r.getString(3);
                                rows[3] = r.getString(4);
                                tableModel.addRow(rows);
                            }
                        }
                        else{
                            r = KetNoi.s.executeQuery("Select DISTINCT DETAI.maDT, tenDT, tenSV, tinhTrang from DETAI, NHOM, SINHVIEN where DETAI.maDT = NHOM.maDT and freetext( tenDT,'"+txtTenDT.getText()+"') and SINHVIEN.maSV = NHOM.maSV and truongNhom = 'true'");
                            while (r.next()) {
                                rows[0] = r.getInt(1);
                                rows[1] = r.getString(2);
                                rows[2] = r.getString(3);
                                rows[3] = r.getString(4);
                                tableModel.addRow(rows);
                            }
                        }
                    }
                    else{
                         if(txtTenDT.getText().equals("")){
                            r = KetNoi.s.executeQuery("Select DISTINCT DETAI.maDT, tenDT, tenSV, tinhTrang from DETAI, NHOM, DIEM, SINHVIEN where DIEM.maDT = DETAI.maDT and DETAI.maDT = NHOM.maDT and namHoc = '"+cbNamhoc.getSelectedItem()+"' and SINHVIEN.maSV = NHOM.maSV and truongNhom = 'true'");
                            while (r.next()) {
                                rows[0] = r.getInt(1);
                                rows[1] = r.getString(2);
                                rows[2] = r.getString(3);
                                rows[3] = r.getString(4);
                                tableModel.addRow(rows);
                            }
                        }
                        else{
                            r = KetNoi.s.executeQuery("Select DISTINCT DETAI.maDT, tenDT, tenSV, tinhTrang from DETAI, NHOM, DIEM, SINHVIEN where DIEM.maDT = DETAI.maDT and DETAI.maDT = NHOM.maDT and namHoc = '"+cbNamhoc.getSelectedItem()+"' and freetext( tenDT,'"+txtTenDT.getText()+"') and SINHVIEN.maSV = NHOM.maSV and truongNhom = 'true'");
                            while (r.next()) {
                                rows[0] = r.getInt(1);
                                rows[1] = r.getString(2);
                                rows[2] = r.getString(3);
                                rows[3] = r.getString(4);
                                tableModel.addRow(rows);
                            }
                        }       
                    }
                }
                else{
                    if(cbNamhoc.getSelectedItem() == "All"){
                        if(txtTenDT.getText().equals("")){
                            r = KetNoi.s.executeQuery("Select DISTINCT DETAI.maDT, tenDT, tenSV, tinhTrang from DETAI, NHOM, DIEM, SINHVIEN where DIEM.maDT = DETAI.maDT and DETAI.maDT = NHOM.maDT and hocKi = '"+cbHocky.getSelectedItem()+"' and SINHVIEN.maSV = NHOM.maSV and truongNhom = 'true'");
                            while (r.next()) {
                                rows[0] = r.getInt(1);
                                rows[1] = r.getString(2);
                                rows[2] = r.getString(3);
                                rows[3] = r.getString(4);
                                tableModel.addRow(rows);
                            }
                        }
                        else{
                            r = KetNoi.s.executeQuery("Select DISTINCT DETAI.maDT, tenDT, tenSV, tinhTrang from DETAI, NHOM, DIEM, SINHVIEN where DIEM.maDT = DETAI.maDT and DETAI.maDT = NHOM.maDT and hocKi = '"+cbHocky.getSelectedItem()+"' and freetext( tenDT,'"+txtTenDT.getText()+"') and SINHVIEN.maSV = NHOM.maSV and truongNhom = 'true'");
                            while (r.next()) {
                                rows[0] = r.getInt(1);
                                rows[1] = r.getString(2);
                                rows[2] = r.getString(3);
                                rows[3] = r.getString(4);
                                tableModel.addRow(rows);
                            }
                        }
                    }
                    else{
                         if(txtTenDT.getText().equals("")){
                            r = KetNoi.s.executeQuery("Select DISTINCT DETAI.maDT, tenDT, tenSV, tinhTrang from DETAI, NHOM, DIEM, SINHVIEN where DIEM.maDT = DETAI.maDT and DETAI.maDT = NHOM.maDT and namHoc = '"+cbNamhoc.getSelectedItem()+"' and hocKi = '"+cbHocky.getSelectedItem()+"' and SINHVIEN.maSV = NHOM.maSV and truongNhom = 'true'");
                            while (r.next()) {
                                rows[0] = r.getInt(1);
                                rows[1] = r.getString(2);
                                rows[2] = r.getString(3);
                                rows[3] = r.getString(4);
                                tableModel.addRow(rows);
                            }
                        }
                        else{
                            r = KetNoi.s.executeQuery("Select DISTINCT DETAI.maDT, tenDT, tenSV, tinhTrang from DETAI, NHOM, DIEM, SINHVIEN where DIEM.maDT = DETAI.maDT and DETAI.maDT = NHOM.maDT and namHoc = '"+cbNamhoc.getSelectedItem()+"' and hocKi = '"+cbHocky.getSelectedItem()+"' and freetext( tenDT,'"+txtTenDT.getText()+"') and SINHVIEN.maSV = NHOM.maSV and truongNhom = 'true' ");
                            while (r.next()) {
                                rows[0] = r.getInt(1);
                                rows[1] = r.getString(2);
                                rows[2] = r.getString(3);
                                rows[3] = r.getString(4);
                                tableModel.addRow(rows);
                            }
                        }       
                    }
                }
            }
            else{
                  if(cbHocky.getSelectedItem() == "All"){
                    if(cbNamhoc.getSelectedItem() == "All"){
                        if(txtTenDT.getText().equals("")){
                            r = KetNoi.s.executeQuery("Select DISTINCT DETAI.maDT, tenDT, tenSV, tinhTrang from DETAI, NHOM, SINHVIEN where DETAI.maDT = NHOM.maDT and loaiDT = N'"+cbLoai.getSelectedItem()+"' and SINHVIEN.maSV = NHOM.maSV and truongNhom = 'true'");
                            while (r.next()) {
                                rows[0] = r.getInt(1);
                                rows[1] = r.getString(2);
                                rows[2] = r.getString(3);
                                rows[3] = r.getString(4);
                                tableModel.addRow(rows);
                            }
                        }
                        else{
                            r = KetNoi.s.executeQuery("Select DISTINCT DETAI.maDT, tenDT, tenSV, tinhTrang from DETAI, NHOM, SINHVIEN where DETAI.maDT = NHOM.maDT and loaiDT = N'"+cbLoai.getSelectedItem()+"' and freetext( tenDT,'"+txtTenDT.getText()+"') and SINHVIEN.maSV = NHOM.maSV and truongNhom = 'true'");
                            while (r.next()) {
                                rows[0] = r.getInt(1);
                                rows[1] = r.getString(2);
                                rows[2] = r.getString(3);
                                rows[3] = r.getString(4);
                                tableModel.addRow(rows);
                            }
                        }
                    }
                    else{
                         if(txtTenDT.getText().equals("")){
                            r = KetNoi.s.executeQuery("Select DISTINCT DETAI.maDT, tenDT, tenSV, tinhTrang from DETAI, NHOM, DIEM, SINHVIEN where DIEM.maDT = DETAI.maDT and DETAI.maDT = NHOM.maDT and loaiDT = N'"+cbLoai.getSelectedItem()+"' and namHoc = '"+cbNamhoc.getSelectedItem()+"' and SINHVIEN.maSV = NHOM.maSV and truongNhom = 'true'");
                            while (r.next()) {
                                rows[0] = r.getInt(1);
                                rows[1] = r.getString(2);
                                rows[2] = r.getString(3);
                                rows[3] = r.getString(4);
                                tableModel.addRow(rows);
                            }
                        }
                        else{
                            r = KetNoi.s.executeQuery("Select DISTINCT DETAI.maDT, tenDT, tenSV, tinhTrang from DETAI, NHOM, DIEM, SINHVIEN where DIEM.maDT = DETAI.maDT and DETAI.maDT = NHOM.maDT and loaiDT = N'"+cbLoai.getSelectedItem()+"' and namHoc = '"+cbNamhoc.getSelectedItem()+"' and freetext( tenDT,'"+txtTenDT.getText()+"') and SINHVIEN.maSV = NHOM.maSV and truongNhom = 'true'");
                            while (r.next()) {
                                rows[0] = r.getInt(1);
                                rows[1] = r.getString(2);
                                rows[2] = r.getString(3);
                                rows[3] = r.getString(4);
                                tableModel.addRow(rows);
                            }
                        }       
                    }
                }
                else{
                    if(cbNamhoc.getSelectedItem() == "All"){
                        if(txtTenDT.getText().equals("")){
                            r = KetNoi.s.executeQuery("Select DISTINCT DETAI.maDT, tenDT, tenSV, tinhTrang from DETAI, NHOM, DIEM, SINHVIEN where DETAI.maDT = DIEM.maDT and DETAI.maDT = NHOM.maDT and hocKi = '"+cbHocky.getSelectedItem()+"' and loaiDT = N'"+cbLoai.getSelectedItem()+"' and SINHVIEN.maSV = NHOM.maSV and truongNhom = 'true'");
                            while (r.next()) {
                                rows[0] = r.getInt(1);
                                rows[1] = r.getString(2);
                                rows[2] = r.getString(3);
                                rows[3] = r.getString(4);
                                tableModel.addRow(rows);
                            }
                        }
                        else{
                            r = KetNoi.s.executeQuery("Select DISTINCT DETAI.maDT, tenDT, tenSV, tinhTrang from DETAI, NHOM, DIEM, SINHVIEN where DIEM.maDT = DETAI.maDT and DETAI.maDT = NHOM.maDT and hocKi = '"+cbHocky.getSelectedItem()+"' and loaiDT = N'"+cbLoai.getSelectedItem()+"' and freetext( tenDT,'"+txtTenDT.getText()+"') and SINHVIEN.maSV = NHOM.maSV and truongNhom = 'true'");
                            while (r.next()) {
                                rows[0] = r.getInt(1);
                                rows[1] = r.getString(2);
                                rows[2] = r.getString(3);
                                rows[3] = r.getString(4);
                                tableModel.addRow(rows);
                            }
                        }
                    }
                    else{
                         if(txtTenDT.getText().equals("")){
                            r = KetNoi.s.executeQuery("Select DISTINCT DETAI.maDT, tenDT, tenSV, tinhTrang from DETAI, NHOM, DIEM,SINHVIEN where DIEM.maDT = DETAI.maDT and DETAI.maDT = NHOM.maDT and namHoc = '"+cbNamhoc.getSelectedItem()+"' and loaiDT = N'"+cbLoai.getSelectedItem()+"' and hocKi = '"+cbHocky.getSelectedItem()+"' and SINHVIEN.maSV = NHOM.maSV and truongNhom = 'true'");
                            while (r.next()) {
                                rows[0] = r.getInt(1);
                                rows[1] = r.getString(2);
                                rows[2] = r.getString(3);
                                rows[3] = r.getString(4);
                                tableModel.addRow(rows);
                            }
                        }
                        else{
                            r = KetNoi.s.executeQuery("Select DISTINCT DETAI.maDT, tenDT, tenSV, tinhTrang from DETAI, NHOM, DIEM, SINHVIEN where DETAI.maDT = NHOM.maDT and DIEM.maDT = DETAI.maDT and namHoc = '"+cbNamhoc.getSelectedItem()+"' and loaiDT = N'"+cbLoai.getSelectedItem()+"' and hocKi = '"+cbHocky.getSelectedItem()+"' and freetext( tenDT,'"+txtTenDT.getText()+"') and SINHVIEN.maSV = NHOM.maSV and truongNhom = 'true'");
                            while (r.next()) {
                                rows[0] = r.getInt(1);
                                rows[1] = r.getString(2);
                                rows[2] = r.getString(3);
                                rows[3] = r.getString(4);
                                tableModel.addRow(rows);
                            }
                        }       
                    }
                }
            }
            
            KetNoi.con.close();
        }
        catch(Exception e){
           
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void tblCapnhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCapnhatMouseClicked
        if(tblCapnhat.getValueAt(0, 0) != null){
            btnSua.setEnabled(true);
            btnXoa.setEnabled(true);
        }
    }//GEN-LAST:event_tblCapnhatMouseClicked

    private void txtTenDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenDTActionPerformed
        btnTimActionPerformed(evt);
    }//GEN-LAST:event_txtTenDTActionPerformed

  
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
            java.util.logging.Logger.getLogger(CapNhat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CapNhat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CapNhat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CapNhat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapNhat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    public javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbHocky;
    private javax.swing.JComboBox<String> cbLoai;
    private javax.swing.JComboBox<String> cbNamhoc;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnl1;
    public javax.swing.JTable tblCapnhat;
    private javax.swing.JTextField txtTenDT;
    // End of variables declaration//GEN-END:variables
}
