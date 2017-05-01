
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.ResultSet;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Sua extends javax.swing.JFrame {
    KetNoi kn = new KetNoi();
    dataSql data = new dataSql();
    final JFileChooser fc = new JFileChooser();
    public String Path = null;
    public int maDT;
    
    public Sua() {
        initComponents();
        setLocationRelativeTo(null);
        
        tblDiem.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e){      
                int row = tblDiem.rowAtPoint(e.getPoint());
                int col = tblDiem.columnAtPoint(e.getPoint());
                if( col == 5 && tblDiem.getValueAt(row, col) == "null"){
                    JOptionPane.showMessageDialog(null, "Topic is uncompleted.");
                }
            }     
        });
        
        tblSinhvien.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e){      
                int row = tblSinhvien.rowAtPoint(e.getPoint());
                int col = tblSinhvien.columnAtPoint(e.getPoint());
                if( col == 4){
                    for(int i = 0; i< tblSinhvien.getRowCount(); i++){
                        if((boolean)tblSinhvien.getValueAt(i, col) == true){
                            for(int j = 0; j < tblSinhvien.getRowCount(); j++){
                                tblSinhvien.setValueAt((boolean)false, j, col);
                            }
                            tblSinhvien.setValueAt((boolean)true, row, col);
                            break;
                        }
                     }
                }
            }     
        });
    }
    public void set_table(){
        JComboBox cbSinhvien = new JComboBox();
        cbSinhvien.addItem("Chairman");
        cbSinhvien.addItem("Commissioner");
        cbSinhvien.addItem("Reviewer");
        DefaultCellEditor de = new DefaultCellEditor(cbSinhvien);
        tblDiem.getColumnModel().getColumn(4).setCellEditor(de);
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTendetai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbLoai = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbHocky = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbNamhoc = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtNgaybd = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNgaykt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbTinhtrang = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSinhvien = new javax.swing.JTable();
        lbTBao = new javax.swing.JLabel();
        btnCapnhattep = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDiem = new javax.swing.JTable();
        lbThongBao = new javax.swing.JLabel();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2), "Modify", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Name of topic");

        txtTendetai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Type of topic");

        cbLoai.setBackground(new java.awt.Color(51, 153, 255));
        cbLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Project", "Thesis" }));
        cbLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLoaiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Semester");

        cbHocky.setBackground(new java.awt.Color(51, 153, 255));
        cbHocky.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "hè" }));
        cbHocky.setSelectedIndex(-1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Year");

        cbNamhoc.setBackground(new java.awt.Color(51, 153, 255));
        cbNamhoc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbNamhoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2010-2011", "2011-2012", "2012-2013", "2013-2014", "2014-2015", "2015-2016", "2016-2017", "2017-2018", "2018-2019", "2019-2020" }));
        cbNamhoc.setSelectedIndex(-1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Date started");

        txtNgaybd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Date ended");

        txtNgaykt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("State");

        cbTinhtrang.setBackground(new java.awt.Color(51, 153, 255));
        cbTinhtrang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbTinhtrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uncompleted", "Completed", "Delayed", "Canceled" }));
        cbTinhtrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTinhtrangActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)), "Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        tblSinhvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, false},
                {null, null, null, null, false},
                {null, null, null, null, false},
                {null, null, null, null, false},
                {null, null, null, null, false},
                {null, null, null, null, false},
                {null, null, null, null, false},
                {null, null, null, null, false},
                {null, null, null, null, false},
                {null, null, null, null, false}
            },
            new String [] {
                "Student name", "Student ID", "Email", "Phone", "Leader"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSinhvien.setFocusable(false);
        tblSinhvien.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tblSinhvien);

        lbTBao.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTBao)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTBao))
        );

        btnCapnhattep.setBackground(new java.awt.Color(153, 204, 255));
        btnCapnhattep.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCapnhattep.setText("Update a file");
        btnCapnhattep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapnhattepActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)), "Mark", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        tblDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Teacher ID", "Teacher name", "Email", "Phone", "Role", "Mark"
            }
        ));
        tblDiem.setFocusable(false);
        tblDiem.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tblDiem);

        lbThongBao.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbThongBao)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbThongBao))
        );

        btnLuu.setBackground(new java.awt.Color(153, 204, 255));
        btnLuu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Save.png"))); // NOI18N
        btnLuu.setText("Save");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(153, 204, 255));
        btnHuy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancel.png"))); // NOI18N
        btnHuy.setText("Cancel");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("(*)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(btnLuu)
                        .addGap(51, 51, 51)
                        .addComponent(btnHuy))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbHocky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbNamhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cbTinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(txtTendetai, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCapnhattep, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTendetai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapnhattep, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cbHocky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cbNamhoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(cbTinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuy)
                    .addComponent(btnLuu))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTinhtrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTinhtrangActionPerformed
        if(cbTinhtrang.getSelectedItem() == "Completed"){
            for(int i = 0; i< tblDiem.getRowCount(); i++){
                tblDiem.setValueAt("", i, 5);
            }
        }
        else{
             for(int i = 0; i< tblDiem.getRowCount(); i++){
                tblDiem.setValueAt("null", i, 5);
            }
        }
    }//GEN-LAST:event_cbTinhtrangActionPerformed

    private void btnCapnhattepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapnhattepActionPerformed

        fc.setFileFilter(new FileTypeFilter(".doc", ""));
        fc.setFileFilter(new FileTypeFilter(".docx", ""));
        fc.setFileFilter(new FileTypeFilter(".txt", ""));
        fc.setFileFilter(new FileTypeFilter(".ppt", ""));
        fc.setFileFilter(new FileTypeFilter(".pdf", ""));
        
        int open = fc.showOpenDialog(this);
        if( open == JFileChooser.FILES_ONLY){
            String s = fc.getSelectedFile().getName();
            btnCapnhattep.setText(s);
        }
    }//GEN-LAST:event_btnCapnhattepActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHuyActionPerformed

    public void setTruongNhom(){
        for( int i = 0; i < 10; i++){
            if((boolean)tblSinhvien.getValueAt(i, 4) == true){
                 break;
            }
            else{
                if( i == 9){
                    for(int j = 0; j < 10; j++){
                        if( tblSinhvien.getValueAt(j, 1) != null){
                            tblSinhvien.setValueAt(true, j, 4);
                            break;
                        }
                    }
                }
            }
        }
    }
    
    
    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        boolean ktra = true;
        lbTBao.setText("");
        lbThongBao.setText("");
        
        if(txtTendetai.getText().equals("")){
            jLabel8.setForeground(Color.red);
            ktra = false;
        }
        int dem = 0;
        for(int i = 0; i < 10; i++){
            if( tblSinhvien.getValueAt(i, 0) == null && tblSinhvien.getValueAt(i, 1) == null && tblSinhvien.getValueAt(i, 2) == null && tblSinhvien.getValueAt(i, 3) == null && (boolean)tblSinhvien.getValueAt(i, 4) == false){
                dem++;
                if ( dem == 10){
                    lbTBao.setText("(*) Student name & ID not null.");
                    ktra = false;
                }
            }
            else{
                for(int j = i+1; j < 10; j++){
                    if((tblSinhvien.getValueAt(i, 1)).equals(tblSinhvien.getValueAt(j, 1))){
                        lbTBao.setText("(*) Student ID is invalid.");
                        break;
                    }
                }
                if("(*) Student ID is invalid." == lbTBao.getText() ){
                    ktra = false;
                    break;
                }
                if(tblSinhvien.getValueAt(i, 0) == null){
                    lbTBao.setText("(*) Student name & ID not null.");
                    ktra = false;
                    break;
                }
                if(tblSinhvien.getValueAt(i, 1) == null){
                    lbTBao.setText("(*) Student name & ID not null.");
                    ktra = false;
                    break;
                }
                if( tblSinhvien.getValueAt(i, 3) == null || tblSinhvien.getValueAt(i, 3) == ""){
                }
                else{
                     try{
                        Integer.parseInt(""+tblSinhvien.getValueAt(i, 3)+"");
                    }catch(Exception e){
                        lbTBao.setText("Phone is invalid.");
                        ktra = false;
                    }
                }
            }
        }
        for( int i = 0; i < tblDiem.getRowCount(); i++ ){
            if(tblDiem.getValueAt(i, 0) == null){
                lbThongBao.setText("Teacher name & ID not null.");
                ktra = false;
                break;
            }
            if(tblDiem.getValueAt(i, 1) == null){
                lbThongBao.setText("Teacher name & ID not null.");
                ktra = false;
                break;
            }
            if(cbLoai.getSelectedItem() == "Thesis"){
                for(int j = i+1; j < 3; j++){
                    if((tblDiem.getValueAt(i, 0)).equals(tblDiem.getValueAt(j, 0))){
                        lbThongBao.setText("(*) Teacher ID is invalid.");
                        break;
                    }
                }
                if("(*) Teacher ID is invalid." == lbThongBao.getText() ){
                    ktra = false;
                    break;
                }
            }
            if( tblDiem.getValueAt(i, 5) == null || tblDiem.getValueAt(i, 5) == "null"){
            }
            else{
                try{
                    Float.parseFloat(""+tblDiem.getValueAt(i, 5)+"");
                }catch(Exception e){
                    lbThongBao.setText("Mark is invalid.");
                    ktra = false;
                }
            }
            if( tblDiem.getValueAt(i, 3) == null || tblDiem.getValueAt(i, 3) == ""){
            }
            else{
                 try{
                    Integer.parseInt(""+tblDiem.getValueAt(i, 3)+"");
                }catch(Exception e){
                    lbThongBao.setText("Phone is invalid.");
                    ktra = false;
                }
            }
        }
        
        if( ktra == true ){
            setTruongNhom();
            if(fc.getSelectedFile() != null){
                if(Path != null){
                    File file = new File(Path);
                    file.delete();
                }
                File srcFolder = new File(""+fc.getSelectedFile().toString()+"");
                File destFolder = new File("src\\Save_file\\"+maDT+"_"+fc.getSelectedFile().getName()+""); 
                try {
                    Files.copy(srcFolder.toPath(), destFolder.toPath());
                } catch (IOException e) {
                    
                }
                Path = "src\\Save_file\\"+maDT+"_"+fc.getSelectedFile().getName()+""; 
            }
        try{
            kn.KN();
            int xoaNhom = KetNoi.s.executeUpdate(" DELETE FROM NHOM WHERE maDT ="+maDT+"");
            for(int i = 0; i < tblSinhvien.getRowCount(); i++){
                int r = 1;
                ResultSet maSV = KetNoi.s.executeQuery("SELECT maSV FROM SINHVIEN");
                while(maSV.next()){
                    if((maSV.getString(1)).equalsIgnoreCase((String)tblSinhvien.getValueAt(i,1))){
                        r = 0;
                        break;
                    }
                    else if((tblSinhvien.getValueAt(i,1)) == null){
                        r = -1;
                        break;
                    }
                    else r++;
                }
               
                if(r != -1){
                
                    if(r == 0){
                        int sv = KetNoi.s.executeUpdate(" UPDATE SINHVIEN SET tenSV =N'"+tblSinhvien.getValueAt(i,0)+"', mail ='"+tblSinhvien.getValueAt(i,2)+"', soDT ='"+tblSinhvien.getValueAt(i,3)+"' where maSV ='"+tblSinhvien.getValueAt(i, 1).toString().toUpperCase()+"'"); 
                    }
                    else{
                        int sv = KetNoi.s.executeUpdate(" INSERT INTO SINHVIEN VALUES('"+tblSinhvien.getValueAt(i, 1).toString().toUpperCase()+"', N'"+tblSinhvien.getValueAt(i,0)+"', '"+tblSinhvien.getValueAt(i,2)+"', '"+tblSinhvien.getValueAt(i,3)+"')"); 
                    }
                    int nhom = KetNoi.s.executeUpdate(" INSERT INTO NHOM VALUES("+maDT+",'"+tblSinhvien.getValueAt(i, 1).toString().toUpperCase()+"', "+maDT+", '"+(boolean)tblSinhvien.getValueAt(i,4)+"')"); 
                }
            }
            int xoa = KetNoi.s.executeUpdate(" DELETE FROM DIEM WHERE maDT ="+maDT+"");
            for(int i = 0; i < tblDiem.getRowCount(); i++){
                int r = 1;
                ResultSet maCB = KetNoi.s.executeQuery("SELECT maCB FROM CANBO");
                while(maCB.next()){
                    if((maCB.getString(1)).equalsIgnoreCase((String)tblDiem.getValueAt(i,0))){
                        r = 0;
                        break;
                    }
                    else if((tblDiem.getValueAt(i,0)) == null){
                        r = -1;
                        break;
                    }
                    else r++;
                }
               
                if(r != -1){
                    if(r == 0){
                        int CB = KetNoi.s.executeUpdate(" UPDATE CANBO SET tenCB =N'"+tblDiem.getValueAt(i,1)+"', mail ='"+tblDiem.getValueAt(i,2)+"', soDT ='"+tblDiem.getValueAt(i,3)+"' where maCB ='"+tblDiem.getValueAt(i, 0).toString().toUpperCase()+"'"); 
                    }
                    else{
                        int CB = KetNoi.s.executeUpdate(" INSERT INTO CANBO VALUES('"+tblDiem.getValueAt(i, 0).toString().toUpperCase()+"', N'"+tblDiem.getValueAt(i,1)+"', '"+tblDiem.getValueAt(i,2)+"', '"+tblDiem.getValueAt(i,3)+"')"); 
                    }
                    if(tblDiem.getValueAt(i,5) == "null"){
                        tblDiem.setValueAt(null, i , 5);
                    }
                    int diem = KetNoi.s.executeUpdate("INSERT INTO DIEM VALUES ("+maDT+", '"+tblDiem.getValueAt(i, 0).toString().toUpperCase()+"', N'"+tblDiem.getValueAt(i, 4)+"', "+tblDiem.getValueAt(i, 5)+", '"+cbHocky.getSelectedItem()+"', '"+cbNamhoc.getSelectedItem()+"')");
                }
            }
            int row = KetNoi.s.executeUpdate(" UPDATE DETAI SET linkBC =N'"+Path+"',tenDT =N'"+txtTendetai.getText()+"',loaiDT =N'"+cbLoai.getSelectedItem()+"',ngayBD ='"+txtNgaybd.getText()+"', ngayKT ='"+txtNgaykt.getText()+"', tinhTrang =N'"+cbTinhtrang.getSelectedItem()+"', diemTong ='"+data.DataDiemtong(tblDiem)+"' where maDT ="+maDT+"");

            JOptionPane.showMessageDialog(rootPane, "Modify sucessfully..!!");
            KetNoi.con.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void cbLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLoaiActionPerformed
        if(cbLoai.getSelectedItem() == "Thesis"){
            if( tblDiem.getRowCount() < 3){
                DefaultTableModel tbModel = (DefaultTableModel) tblDiem.getModel();
                if( cbTinhtrang.getSelectedItem() == "Completed"){
                    tbModel.addRow(new Object[]{});
                    tbModel.addRow(new Object[]{}); 
                }
                else{
                    tbModel.addRow(new Object[]{"","","","","","null"});
                    tbModel.addRow(new Object[]{"","","","","","null"}); 
                }              
            }
        }
        else{
            if( tblDiem.getRowCount() > 1){
            DefaultTableModel tbModel = (DefaultTableModel) tblDiem.getModel();
            tbModel.removeRow(1);
            tbModel.removeRow(1);
            }
        }
    }//GEN-LAST:event_cbLoaiActionPerformed

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
            java.util.logging.Logger.getLogger(Sua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sua.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sua().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCapnhattep;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    public javax.swing.JComboBox<String> cbHocky;
    public javax.swing.JComboBox<String> cbLoai;
    public javax.swing.JComboBox<String> cbNamhoc;
    public javax.swing.JComboBox<String> cbTinhtrang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lbTBao;
    private javax.swing.JLabel lbThongBao;
    public javax.swing.JTable tblDiem;
    public javax.swing.JTable tblSinhvien;
    public javax.swing.JTextField txtNgaybd;
    public javax.swing.JTextField txtNgaykt;
    public javax.swing.JTextField txtTendetai;
    // End of variables declaration//GEN-END:variables

    
}
