
import java.awt.Desktop;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
public class ThongKe extends javax.swing.JFrame {

    public ThongKe() {
        initComponents();
        jButton1.setEnabled(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        pnl3 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src\\Images\\logo0.PNG");
            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        btnHome = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbHocky = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbNamhoc = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbLoai = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbTieuchi = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        pnlChart = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblThongke = new javax.swing.JTable();
        btnThongKe = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        btnHome.setBackground(new java.awt.Color(153, 204, 255));
        btnHome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Home.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl3Layout = new javax.swing.GroupLayout(pnl3);
        pnl3.setLayout(pnl3Layout);
        pnl3Layout.setHorizontalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHome)
                .addContainerGap())
        );
        pnl3Layout.setVerticalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl3Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(btnHome)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)), "Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Semester");

        cbHocky.setBackground(new java.awt.Color(51, 153, 255));
        cbHocky.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbHocky.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "1", "2", "Summer" }));
        cbHocky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHockyActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Year");

        cbNamhoc.setBackground(new java.awt.Color(51, 153, 255));
        cbNamhoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "2010-2011", "2011-2012", "2012-2013", "2013-2014", "2014-2015", "2015-2016", "2016-2017", "2017-2018", "2018-2019", "2019-2020" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Type of topic");

        cbLoai.setBackground(new java.awt.Color(51, 153, 255));
        cbLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Project", "Thesis" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Standard");

        cbTieuchi.setBackground(new java.awt.Color(51, 153, 255));
        cbTieuchi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mark ranking", "Progress" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(cbHocky, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cbTieuchi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbNamhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTieuchi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbHocky, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbNamhoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)), "Statistics", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        pnlChart.setBackground(new java.awt.Color(153, 204, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bieudo.png"))); // NOI18N

        javax.swing.GroupLayout pnlChartLayout = new javax.swing.GroupLayout(pnlChart);
        pnlChart.setLayout(pnlChartLayout);
        pnlChartLayout.setHorizontalGroup(
            pnlChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChartLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlChartLayout.setVerticalGroup(
            pnlChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChartLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        tblThongke.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Standard", "Number of topic", "Proportion (%)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblThongke.setFocusable(false);
        tblThongke.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tblThongke);
        if (tblThongke.getColumnModel().getColumnCount() > 0) {
            tblThongke.getColumnModel().getColumn(0).setPreferredWidth(37);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pnlChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        btnThongKe.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pie Chart-20.png"))); // NOI18N
        btnThongKe.setText("Statistics");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Print.png"))); // NOI18N
        jButton1.setText("Print statistics");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(btnThongKe)
                .addGap(58, 58, 58)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(pnl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThongKe)
                    .addComponent(jButton1))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    KetNoi c=new KetNoi();
    DefaultTableModel tableModel = new DefaultTableModel();
    


    private void cbHockyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHockyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbHockyActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        MainPage m = new MainPage();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        jButton1.setEnabled(true);
        ArrayList l = new ArrayList();
        try {
            c.KN();
            
            while (tableModel.getRowCount() > 0) {
                tableModel.removeRow(0);
                l.clear();
            }
            
            if (cbTieuchi.getSelectedIndex() == 0) {
                String[] colsName = {"Mark", "Number of topic", "Proportion (%)"};
                tableModel.setColumnIdentifiers(colsName);
                tblThongke.setModel(tableModel);
                Object rows[] = new Object[3];
                if( cbLoai.getSelectedItem() != "All" ){
                    if( cbHocky.getSelectedItem() != "All"){
                        if( cbNamhoc.getSelectedItem() != "All"){
                            ResultSet r1 = KetNoi.s.executeQuery("Select 'A', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and namHoc= '"+cbNamhoc.getSelectedItem()+"' and hocKi='" + cbHocky.getSelectedItem() +"' and  diemTong = 'A') p");
                            if (r1.next()) {
                                rows[0] = r1.getString(1);
                                rows[1] = r1.getInt(2);
                                   tableModel.addRow(rows);
                                   l.add(r1.getInt(2));
                            }
                            ResultSet r2 = KetNoi.s.executeQuery("Select 'B+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'B+') p");
                            if (r2.next()) {
                                rows[0] = r2.getString(1);
                                rows[1] = r2.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r2.getInt(2));
                            }
                            ResultSet r3 = KetNoi.s.executeQuery("Select 'B', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'B') p");
                            if (r3.next()) {
                                rows[0] = r3.getString(1);
                                rows[1] = r3.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r3.getInt(2));
                            }
                            ResultSet r4 = KetNoi.s.executeQuery("Select 'C+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'C+') p");
                            if (r4.next()) {
                                rows[0] = r4.getString(1);
                                rows[1] = r4.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r4.getInt(2));
                            }
                            ResultSet r5 = KetNoi.s.executeQuery("Select 'C', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'C') p");
                            if (r5.next()) {
                                rows[0] = r5.getString(1);
                                rows[1] = r5.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r5.getInt(2));
                            }
                            ResultSet r6 = KetNoi.s.executeQuery("Select 'D+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'D+') p");
                            if (r6.next()) {
                                rows[0] = r6.getString(1);
                                rows[1] = r6.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r6.getInt(2));
                            }
                            ResultSet r7 = KetNoi.s.executeQuery("Select 'D', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'D') p");
                            if (r7.next()) {
                                rows[0] = r7.getString(1);
                                rows[1] = r7.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r7.getInt(2));
                            }
                            ResultSet r8 = KetNoi.s.executeQuery("Select 'F', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'F') p");
                            if (r8.next()) {
                                rows[0] = r8.getString(1);
                                rows[1] = r8.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r8.getInt(2));
                            }

                            for (int i = 0; i < 8; i++){
                                float tl = (float)(((int)(tblThongke.getValueAt(i, 1))*100)/(float)((int)l.get(0)+(int)l.get(1)+(int)l.get(2)+(int)l.get(3)+(int)l.get(4)+(int)l.get(5)+(int)l.get(6)+(int)l.get(7)));
                                tblThongke.setValueAt(tl, i, 2);
                            }
                            }
                        else{
                            ResultSet r1 = KetNoi.s.executeQuery("Select 'A', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and hocKi='" + cbHocky.getSelectedItem() +"' and  diemTong = 'A') p");
                            if (r1.next()) {
                                rows[0] = r1.getString(1);
                                rows[1] = r1.getInt(2);
                                   tableModel.addRow(rows);
                                   l.add(r1.getInt(2));
                            }
                            ResultSet r2 = KetNoi.s.executeQuery("Select 'B+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'B+') p");
                            if (r2.next()) {
                                rows[0] = r2.getString(1);
                                rows[1] = r2.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r2.getInt(2));
                            }
                            ResultSet r3 = KetNoi.s.executeQuery("Select 'B', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'B') p");
                            if (r3.next()) {
                                rows[0] = r3.getString(1);
                                rows[1] = r3.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r3.getInt(2));
                            }
                            ResultSet r4 = KetNoi.s.executeQuery("Select 'C+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'C+') p");
                            if (r4.next()) {
                                rows[0] = r4.getString(1);
                                rows[1] = r4.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r4.getInt(2));
                            }
                            ResultSet r5 = KetNoi.s.executeQuery("Select 'C', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'C') p");
                            if (r5.next()) {
                                rows[0] = r5.getString(1);
                                rows[1] = r5.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r5.getInt(2));
                            }
                            ResultSet r6 = KetNoi.s.executeQuery("Select 'D+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'D+') p");
                            if (r6.next()) {
                                rows[0] = r6.getString(1);
                                rows[1] = r6.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r6.getInt(2));
                            }
                            ResultSet r7 = KetNoi.s.executeQuery("Select 'D', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'D') p");
                            if (r7.next()) {
                                rows[0] = r7.getString(1);
                                rows[1] = r7.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r7.getInt(2));
                            }
                            ResultSet r8 = KetNoi.s.executeQuery("Select 'F', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'F') p");
                            if (r8.next()) {
                                rows[0] = r8.getString(1);
                                rows[1] = r8.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r8.getInt(2));
                            }

                            for (int i = 0; i < 8; i++){
                                float tl = (float)(((int)(tblThongke.getValueAt(i, 1))*100)/(float)((int)l.get(0)+(int)l.get(1)+(int)l.get(2)+(int)l.get(3)+(int)l.get(4)+(int)l.get(5)+(int)l.get(6)+(int)l.get(7)));
                                tblThongke.setValueAt(tl, i, 2);
                            }
                        }
                    }
                    else{
                        
                       if( cbNamhoc.getSelectedItem() != "All"){
                            ResultSet r1 = KetNoi.s.executeQuery("Select 'A', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and namHoc= '"+cbNamhoc.getSelectedItem()+"' and  diemTong = 'A') p");
                            if (r1.next()) {
                                rows[0] = r1.getString(1);
                                rows[1] = r1.getInt(2);
                                   tableModel.addRow(rows);
                                   l.add(r1.getInt(2));
                            }
                            ResultSet r2 = KetNoi.s.executeQuery("Select 'B+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and  DETAI.diemTong = 'B+') p");
                            if (r2.next()) {
                                rows[0] = r2.getString(1);
                                rows[1] = r2.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r2.getInt(2));
                            }
                            ResultSet r3 = KetNoi.s.executeQuery("Select 'B', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and  DETAI.diemTong = 'B') p");
                            if (r3.next()) {
                                rows[0] = r3.getString(1);
                                rows[1] = r3.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r3.getInt(2));
                            }
                            ResultSet r4 = KetNoi.s.executeQuery("Select 'C+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and  DETAI.diemTong = 'C+') p");
                            if (r4.next()) {
                                rows[0] = r4.getString(1);
                                rows[1] = r4.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r4.getInt(2));
                            }
                            ResultSet r5 = KetNoi.s.executeQuery("Select 'C', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and  DETAI.diemTong = 'C') p");
                            if (r5.next()) {
                                rows[0] = r5.getString(1);
                                rows[1] = r5.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r5.getInt(2));
                            }
                            ResultSet r6 = KetNoi.s.executeQuery("Select 'D+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and  DETAI.diemTong = 'D+') p");
                            if (r6.next()) {
                                rows[0] = r6.getString(1);
                                rows[1] = r6.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r6.getInt(2));
                            }
                            ResultSet r7 = KetNoi.s.executeQuery("Select 'D', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and  DETAI.diemTong = 'D') p");
                            if (r7.next()) {
                                rows[0] = r7.getString(1);
                                rows[1] = r7.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r7.getInt(2));
                            }
                            ResultSet r8 = KetNoi.s.executeQuery("Select 'F', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and  DETAI.diemTong = 'F') p");
                            if (r8.next()) {
                                rows[0] = r8.getString(1);
                                rows[1] = r8.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r8.getInt(2));
                            }

                            for (int i = 0; i < 8; i++){
                                float tl = (float)(((int)(tblThongke.getValueAt(i, 1))*100)/(float)((int)l.get(0)+(int)l.get(1)+(int)l.get(2)+(int)l.get(3)+(int)l.get(4)+(int)l.get(5)+(int)l.get(6)+(int)l.get(7)));
                                tblThongke.setValueAt(tl, i, 2);
                            }
                            }
                        else{
                            ResultSet r1 = KetNoi.s.executeQuery("Select 'A', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and  diemTong = 'A') p");
                            if (r1.next()) {
                                rows[0] = r1.getString(1);
                                rows[1] = r1.getInt(2);
                                   tableModel.addRow(rows);
                                   l.add(r1.getInt(2));
                            }
                            ResultSet r2 = KetNoi.s.executeQuery("Select 'B+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+ "' and  DETAI.diemTong = 'B+') p");
                            if (r2.next()) {
                                rows[0] = r2.getString(1);
                                rows[1] = r2.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r2.getInt(2));
                            }
                            ResultSet r3 = KetNoi.s.executeQuery("Select 'B', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and  DETAI.diemTong = 'B') p");
                            if (r3.next()) {
                                rows[0] = r3.getString(1);
                                rows[1] = r3.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r3.getInt(2));
                            }
                            ResultSet r4 = KetNoi.s.executeQuery("Select 'C+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and  DETAI.diemTong = 'C+') p");
                            if (r4.next()) {
                                rows[0] = r4.getString(1);
                                rows[1] = r4.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r4.getInt(2));
                            }
                            ResultSet r5 = KetNoi.s.executeQuery("Select 'C', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and  DETAI.diemTong = 'C') p");
                            if (r5.next()) {
                                rows[0] = r5.getString(1);
                                rows[1] = r5.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r5.getInt(2));
                            }
                            ResultSet r6 = KetNoi.s.executeQuery("Select 'D+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and  DETAI.diemTong = 'D+') p");
                            if (r6.next()) {
                                rows[0] = r6.getString(1);
                                rows[1] = r6.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r6.getInt(2));
                            }
                            ResultSet r7 = KetNoi.s.executeQuery("Select 'D', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and  DETAI.diemTong = 'D') p");
                            if (r7.next()) {
                                rows[0] = r7.getString(1);
                                rows[1] = r7.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r7.getInt(2));
                            }
                            ResultSet r8 = KetNoi.s.executeQuery("Select 'F', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem().toString()+"' and  DETAI.diemTong = 'F') p");
                            if (r8.next()) {
                                rows[0] = r8.getString(1);
                                rows[1] = r8.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r8.getInt(2));
                            }

                            for (int i = 0; i < 8; i++){
                                float tl = (float)(((int)(tblThongke.getValueAt(i, 1))*100)/(float)((int)l.get(0)+(int)l.get(1)+(int)l.get(2)+(int)l.get(3)+(int)l.get(4)+(int)l.get(5)+(int)l.get(6)+(int)l.get(7)));
                                tblThongke.setValueAt(tl, i, 2);
                            }
                        }
                    }
                            }
                            else{
                                if( cbHocky.getSelectedItem() != "All"){
                                if( cbNamhoc.getSelectedItem() != "All"){
                                    ResultSet r1 = KetNoi.s.executeQuery("Select 'A', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem()+"' and hocKi='" + cbHocky.getSelectedItem() +"' and  diemTong = 'A') p");
                                    if (r1.next()) {
                                        rows[0] = r1.getString(1);
                                        rows[1] = r1.getInt(2);
                                           tableModel.addRow(rows);
                                           l.add(r1.getInt(2));
                                    }
                                    ResultSet r2 = KetNoi.s.executeQuery("Select 'B+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'B+') p");
                                    if (r2.next()) {
                                        rows[0] = r2.getString(1);
                                        rows[1] = r2.getInt(2);
                                            tableModel.addRow(rows);
                                             l.add(r2.getInt(2));
                                    }
                                    ResultSet r3 = KetNoi.s.executeQuery("Select 'B', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'B') p");
                                    if (r3.next()) {
                                        rows[0] = r3.getString(1);
                                        rows[1] = r3.getInt(2);
                                            tableModel.addRow(rows);
                                             l.add(r3.getInt(2));
                                    }
                                    ResultSet r4 = KetNoi.s.executeQuery("Select 'C+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'C+') p");
                                    if (r4.next()) {
                                        rows[0] = r4.getString(1);
                                        rows[1] = r4.getInt(2);
                                            tableModel.addRow(rows);
                                            l.add(r4.getInt(2));
                                    }
                                    ResultSet r5 = KetNoi.s.executeQuery("Select 'C', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'C') p");
                                    if (r5.next()) {
                                        rows[0] = r5.getString(1);
                                        rows[1] = r5.getInt(2);
                                            tableModel.addRow(rows);
                                            l.add(r5.getInt(2));
                                    }
                                    ResultSet r6 = KetNoi.s.executeQuery("Select 'D+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'D+') p");
                                    if (r6.next()) {
                                        rows[0] = r6.getString(1);
                                        rows[1] = r6.getInt(2);
                                            tableModel.addRow(rows);
                                             l.add(r6.getInt(2));
                                    }
                                    ResultSet r7 = KetNoi.s.executeQuery("Select 'D', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'D') p");
                                    if (r7.next()) {
                                        rows[0] = r7.getString(1);
                                        rows[1] = r7.getInt(2);
                                            tableModel.addRow(rows);
                                             l.add(r7.getInt(2));
                                    }
                                    ResultSet r8 = KetNoi.s.executeQuery("Select 'F', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'F') p");
                                    if (r8.next()) {
                                        rows[0] = r8.getString(1);
                                        rows[1] = r8.getInt(2);
                                            tableModel.addRow(rows);
                                            l.add(r8.getInt(2));
                                    }

                                    for (int i = 0; i < 8; i++){
                                        float tl = (float)(((int)(tblThongke.getValueAt(i, 1))*100)/(float)((int)l.get(0)+(int)l.get(1)+(int)l.get(2)+(int)l.get(3)+(int)l.get(4)+(int)l.get(5)+(int)l.get(6)+(int)l.get(7)));
                                        tblThongke.setValueAt(tl, i, 2);
                                    }
                                }
                        else{
                            ResultSet r1 = KetNoi.s.executeQuery("Select 'A', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and hocKi='" + cbHocky.getSelectedItem() +"' and  diemTong = 'A') p");
                            if (r1.next()) {
                                rows[0] = r1.getString(1);
                                rows[1] = r1.getInt(2);
                                   tableModel.addRow(rows);
                                   l.add(r1.getInt(2));
                            }
                            ResultSet r2 = KetNoi.s.executeQuery("Select 'B+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'B+') p");
                            if (r2.next()) {
                                rows[0] = r2.getString(1);
                                rows[1] = r2.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r2.getInt(2));
                            }
                            ResultSet r3 = KetNoi.s.executeQuery("Select 'B', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and hocKi='"+ cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'B') p");
                            if (r3.next()) {
                                rows[0] = r3.getString(1);
                                rows[1] = r3.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r3.getInt(2));
                            }
                            ResultSet r4 = KetNoi.s.executeQuery("Select 'C+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'C+') p");
                            if (r4.next()) {
                                rows[0] = r4.getString(1);
                                rows[1] = r4.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r4.getInt(2));
                            }
                            ResultSet r5 = KetNoi.s.executeQuery("Select 'C', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'C') p");
                            if (r5.next()) {
                                rows[0] = r5.getString(1);
                                rows[1] = r5.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r5.getInt(2));
                            }
                            ResultSet r6 = KetNoi.s.executeQuery("Select 'D+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'D+') p");
                            if (r6.next()) {
                                rows[0] = r6.getString(1);
                                rows[1] = r6.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r6.getInt(2));
                            }
                            ResultSet r7 = KetNoi.s.executeQuery("Select 'D', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'D') p");
                            if (r7.next()) {
                                rows[0] = r7.getString(1);
                                rows[1] = r7.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r7.getInt(2));
                            }
                            ResultSet r8 = KetNoi.s.executeQuery("Select 'F', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and hocKi='" + cbHocky.getSelectedItem().toString() + "' and  DETAI.diemTong = 'F') p");
                            if (r8.next()) {
                                rows[0] = r8.getString(1);
                                rows[1] = r8.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r8.getInt(2));
                            }

                            for (int i = 0; i < 8; i++){
                                float tl = (float)(((int)(tblThongke.getValueAt(i, 1))*100)/(float)((int)l.get(0)+(int)l.get(1)+(int)l.get(2)+(int)l.get(3)+(int)l.get(4)+(int)l.get(5)+(int)l.get(6)+(int)l.get(7)));
                                tblThongke.setValueAt(tl, i, 2);
                            }
                        }
                    }
                    else{
                        
                       if( cbNamhoc.getSelectedItem() != "All"){
                            ResultSet r1 = KetNoi.s.executeQuery("Select 'A', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem()+"' and  diemTong = 'A') p");
                            if (r1.next()) {
                                rows[0] = r1.getString(1);
                                rows[1] = r1.getInt(2);
                                   tableModel.addRow(rows);
                                   l.add(r1.getInt(2));
                            }
                            ResultSet r2 = KetNoi.s.executeQuery("Select 'B+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and  DETAI.diemTong = 'B+') p");
                            if (r2.next()) {
                                rows[0] = r2.getString(1);
                                rows[1] = r2.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r2.getInt(2));
                            }
                            ResultSet r3 = KetNoi.s.executeQuery("Select 'B', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and  DETAI.diemTong = 'B') p");
                            if (r3.next()) {
                                rows[0] = r3.getString(1);
                                rows[1] = r3.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r3.getInt(2));
                            }
                            ResultSet r4 = KetNoi.s.executeQuery("Select 'C+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and  DETAI.diemTong = 'C+') p");
                            if (r4.next()) {
                                rows[0] = r4.getString(1);
                                rows[1] = r4.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r4.getInt(2));
                            }
                            ResultSet r5 = KetNoi.s.executeQuery("Select 'C', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and  DETAI.diemTong = 'C') p");
                            if (r5.next()) {
                                rows[0] = r5.getString(1);
                                rows[1] = r5.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r5.getInt(2));
                            }
                            ResultSet r6 = KetNoi.s.executeQuery("Select 'D+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and  DETAI.diemTong = 'D+') p");
                            if (r6.next()) {
                                rows[0] = r6.getString(1);
                                rows[1] = r6.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r6.getInt(2));
                            }
                            ResultSet r7 = KetNoi.s.executeQuery("Select 'D', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and  DETAI.diemTong = 'D') p");
                            if (r7.next()) {
                                rows[0] = r7.getString(1);
                                rows[1] = r7.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r7.getInt(2));
                            }
                            ResultSet r8 = KetNoi.s.executeQuery("Select 'F', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem().toString()+"' and  DETAI.diemTong = 'F') p");
                            if (r8.next()) {
                                rows[0] = r8.getString(1);
                                rows[1] = r8.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r8.getInt(2));
                            }

                            for (int i = 0; i < 8; i++){
                                float tl = (float)(((int)(tblThongke.getValueAt(i, 1))*100)/(float)((int)l.get(0)+(int)l.get(1)+(int)l.get(2)+(int)l.get(3)+(int)l.get(4)+(int)l.get(5)+(int)l.get(6)+(int)l.get(7)));
                                tblThongke.setValueAt(tl, i, 2);
                            }
                            }
                        else{
                            ResultSet r1 = KetNoi.s.executeQuery("Select 'A', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and  diemTong = 'A') p");
                            if (r1.next()) {
                                rows[0] = r1.getString(1);
                                rows[1] = r1.getInt(2);
                                   tableModel.addRow(rows);
                                   l.add(r1.getInt(2));
                            }
                            ResultSet r2 = KetNoi.s.executeQuery("Select 'B+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and  DETAI.diemTong = 'B+') p");
                            if (r2.next()) {
                                rows[0] = r2.getString(1);
                                rows[1] = r2.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r2.getInt(2));
                            }
                            ResultSet r3 = KetNoi.s.executeQuery("Select 'B', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and  DETAI.diemTong = 'B') p");
                            if (r3.next()) {
                                rows[0] = r3.getString(1);
                                rows[1] = r3.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r3.getInt(2));
                            }
                            ResultSet r4 = KetNoi.s.executeQuery("Select 'C+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and  DETAI.diemTong = 'C+') p");
                            if (r4.next()) {
                                rows[0] = r4.getString(1);
                                rows[1] = r4.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r4.getInt(2));
                            }
                            ResultSet r5 = KetNoi.s.executeQuery("Select 'C', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and  DETAI.diemTong = 'C') p");
                            if (r5.next()) {
                                rows[0] = r5.getString(1);
                                rows[1] = r5.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r5.getInt(2));
                            }
                            ResultSet r6 = KetNoi.s.executeQuery("Select 'D+', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and  DETAI.diemTong = 'D+') p");
                            if (r6.next()) {
                                rows[0] = r6.getString(1);
                                rows[1] = r6.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r6.getInt(2));
                            }
                            ResultSet r7 = KetNoi.s.executeQuery("Select 'D', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and  DETAI.diemTong = 'D') p");
                            if (r7.next()) {
                                rows[0] = r7.getString(1);
                                rows[1] = r7.getInt(2);
                                    tableModel.addRow(rows);
                                     l.add(r7.getInt(2));
                            }
                            ResultSet r8 = KetNoi.s.executeQuery("Select 'F', count(*) From (select Distinct DETAI.maDT, hocKi, namHoc, diemTong from DIEM,DETAI where DETAI.maDT=DIEM.maDT and  DETAI.diemTong = 'F') p");
                            if (r8.next()) {
                                rows[0] = r8.getString(1);
                                rows[1] = r8.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r8.getInt(2));
                            }

                            for (int i = 0; i < 8; i++){
                                float tl = (float)(((int)(tblThongke.getValueAt(i, 1))*100)/(float)((int)l.get(0)+(int)l.get(1)+(int)l.get(2)+(int)l.get(3)+(int)l.get(4)+(int)l.get(5)+(int)l.get(6)+(int)l.get(7)));
                                tblThongke.setValueAt(tl, i, 2);
                            }
                        }
                    }                
                }
                
            } else {
                
                String[] colsName = {"Status", "Number of topic", "Proportion (%)"};
                tableModel.setColumnIdentifiers(colsName);
                tblThongke.setModel(tableModel);
                Object rows[] = new Object[3];
                if( cbLoai.getSelectedItem() != "All"){
                    if(cbHocky.getSelectedItem() != "All"){
                        if( cbNamhoc.getSelectedItem() != "All"){
                            ResultSet r1 = KetNoi.s.executeQuery("select N'Completed',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and namHoc= '"+cbNamhoc.getSelectedItem()+"' and hocKi='"+cbHocky.getSelectedItem()+"' and tinhTrang=N'Completed')p");
                            if (r1.next()) {
                                rows[0] = r1.getString(1);
                                rows[1] = r1.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r1.getInt(2));
                            }
                            ResultSet r2 = KetNoi.s.executeQuery("select N'Uncompleted',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and namHoc= '"+cbNamhoc.getSelectedItem()+"' and hocKi='"+cbHocky.getSelectedItem()+"' and tinhTrang=N'Uncompleted')p");
                            if (r2.next()) {
                                rows[0] = r2.getString(1);
                                rows[1] = r2.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r2.getInt(2));
                            }
                            ResultSet r3 = KetNoi.s.executeQuery("select N'Delayed',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and namHoc= '"+cbNamhoc.getSelectedItem()+"' and hocKi='"+cbHocky.getSelectedItem()+"' and tinhTrang=N'Delayed')p");
                            if (r3.next()) {
                                rows[0] = r3.getString(1);
                                rows[1] = r3.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r3.getInt(2));
                            }
                            ResultSet r4 = KetNoi.s.executeQuery("select N'Canceled',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and namHoc= '"+cbNamhoc.getSelectedItem()+"' and hocKi='"+cbHocky.getSelectedItem()+"' and tinhTrang=N'Canceled')p");
                            if (r4.next()) {
                                rows[0] = r4.getString(1);
                                rows[1] = r4.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r4.getInt(2));
                            }

                            for(int i = 0; i< 4; i++){
                                float tl = (float)(((int)(tblThongke.getValueAt(i, 1))*100)/(float)((int)l.get(0)+(int)l.get(1)+(int)l.get(2)+(int)l.get(3)));
                                tblThongke.setValueAt(tl, i, 2);
                            }
                        }
                        else{
                            ResultSet r1 = KetNoi.s.executeQuery("select N'Completed',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and hocKi='"+cbHocky.getSelectedItem()+"' and tinhTrang=N'Completed')p");
                            if (r1.next()) {
                                rows[0] = r1.getString(1);
                                rows[1] = r1.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r1.getInt(2));
                            }
                            ResultSet r2 = KetNoi.s.executeQuery("select N'Uncompleted',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and hocKi='"+cbHocky.getSelectedItem()+"' and tinhTrang=N'Uncompleted')p");
                            if (r2.next()) {
                                rows[0] = r2.getString(1);
                                rows[1] = r2.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r2.getInt(2));
                            }
                            ResultSet r3 = KetNoi.s.executeQuery("select N'Delayed',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and hocKi='"+cbHocky.getSelectedItem()+"' and tinhTrang=N'Delayed')p");
                            if (r3.next()) {
                                rows[0] = r3.getString(1);
                                rows[1] = r3.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r3.getInt(2));
                            }
                            ResultSet r4 = KetNoi.s.executeQuery("select N'Canceled',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and hocKi='"+cbHocky.getSelectedItem()+"' and tinhTrang=N'Canceled')p");
                            if (r4.next()) {
                                rows[0] = r4.getString(1);
                                rows[1] = r4.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r4.getInt(2));
                            }

                            for(int i = 0; i< 4; i++){
                                float tl = (float)(((int)(tblThongke.getValueAt(i, 1))*100)/(float)((int)l.get(0)+(int)l.get(1)+(int)l.get(2)+(int)l.get(3)));
                                tblThongke.setValueAt(tl, i, 2);
                            }
                        }
                    }
                    else{
                        if( cbNamhoc.getSelectedItem() != "All"){
                            ResultSet r1 = KetNoi.s.executeQuery("select N'Completed',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and namHoc= '"+cbNamhoc.getSelectedItem()+"' and tinhTrang=N'Completed')p");
                            if (r1.next()) {
                                rows[0] = r1.getString(1);
                                rows[1] = r1.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r1.getInt(2));
                            }
                            ResultSet r2 = KetNoi.s.executeQuery("select N'Uncompleted',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and namHoc= '"+cbNamhoc.getSelectedItem()+"' and tinhTrang=N'Uncompleted')p");
                            if (r2.next()) {
                                rows[0] = r2.getString(1);
                                rows[1] = r2.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r2.getInt(2));
                            }
                            ResultSet r3 = KetNoi.s.executeQuery("select N'Delayed',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and namHoc= '"+cbNamhoc.getSelectedItem()+"' and tinhTrang=N'Delayed')p");
                            if (r3.next()) {
                                rows[0] = r3.getString(1);
                                rows[1] = r3.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r3.getInt(2));
                            }
                            ResultSet r4 = KetNoi.s.executeQuery("select N'Canceled',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and namHoc= '"+cbNamhoc.getSelectedItem()+"' and tinhTrang=N'Canceled')p");
                            if (r4.next()) {
                                rows[0] = r4.getString(1);
                                rows[1] = r4.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r4.getInt(2));
                            }

                            for(int i = 0; i< 4; i++){
                                float tl = (float)(((int)(tblThongke.getValueAt(i, 1))*100)/(float)((int)l.get(0)+(int)l.get(1)+(int)l.get(2)+(int)l.get(3)));
                                tblThongke.setValueAt(tl, i, 2);
                            }
                        }
                        else{
                            ResultSet r1 = KetNoi.s.executeQuery("select N'Completed',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and tinhTrang=N'Completed')p");
                            if (r1.next()) {
                                rows[0] = r1.getString(1);
                                rows[1] = r1.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r1.getInt(2));
                            }
                            ResultSet r2 = KetNoi.s.executeQuery("select N'Uncompleted',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and tinhTrang=N'Uncompleted')p");
                            if (r2.next()) {
                                rows[0] = r2.getString(1);
                                rows[1] = r2.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r2.getInt(2));
                            }
                            ResultSet r3 = KetNoi.s.executeQuery("select N'Delayed',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and tinhTrang=N'Delayed')p");
                            if (r3.next()) {
                                rows[0] = r3.getString(1);
                                rows[1] = r3.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r3.getInt(2));
                            }
                            ResultSet r4 = KetNoi.s.executeQuery("select N'Canceled',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and loaiDT=N'"+cbLoai.getSelectedItem()+"' and tinhTrang=N'Canceled')p");
                            if (r4.next()) {
                                rows[0] = r4.getString(1);
                                rows[1] = r4.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r4.getInt(2));
                            }

                            for(int i = 0; i< 4; i++){
                                float tl = (float)(((int)(tblThongke.getValueAt(i, 1))*100)/(float)((int)l.get(0)+(int)l.get(1)+(int)l.get(2)+(int)l.get(3)));
                                tblThongke.setValueAt(tl, i, 2);
                            }
                        }
                    }
                }
                else{
                    if(cbHocky.getSelectedItem() != "All"){
                        if( cbNamhoc.getSelectedItem() != "All"){
                            ResultSet r1 = KetNoi.s.executeQuery("select N'Completed',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem()+"' and hocKi='"+cbHocky.getSelectedItem()+"' and tinhTrang=N'Completed')p");
                            if (r1.next()) {
                                rows[0] = r1.getString(1);
                                rows[1] = r1.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r1.getInt(2));
                            }
                            ResultSet r2 = KetNoi.s.executeQuery("select N'Uncompleted',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem()+"' and hocKi='"+cbHocky.getSelectedItem()+"' and tinhTrang=N'Uncompleted')p");
                            if (r2.next()) {
                                rows[0] = r2.getString(1);
                                rows[1] = r2.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r2.getInt(2));
                            }
                            ResultSet r3 = KetNoi.s.executeQuery("select N'Delayed',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem()+"' and hocKi='"+cbHocky.getSelectedItem()+"' and tinhTrang=N'Delayed')p");
                            if (r3.next()) {
                                rows[0] = r3.getString(1);
                                rows[1] = r3.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r3.getInt(2));
                            }
                            ResultSet r4 = KetNoi.s.executeQuery("select N'Canceled',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem()+"' and hocKi='"+cbHocky.getSelectedItem()+"' and tinhTrang=N'Canceled')p");
                            if (r4.next()) {
                                rows[0] = r4.getString(1);
                                rows[1] = r4.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r4.getInt(2));
                            }

                            for(int i = 0; i< 4; i++){
                                float tl = (float)(((int)(tblThongke.getValueAt(i, 1))*100)/(float)((int)l.get(0)+(int)l.get(1)+(int)l.get(2)+(int)l.get(3)));
                                tblThongke.setValueAt(tl, i, 2);
                            }
                        }
                        else{
                            ResultSet r1 = KetNoi.s.executeQuery("select N'Completed',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and hocKi='"+cbHocky.getSelectedItem()+"' and tinhTrang=N'Completed')p");
                            if (r1.next()) {
                                rows[0] = r1.getString(1);
                                rows[1] = r1.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r1.getInt(2));
                            }
                            ResultSet r2 = KetNoi.s.executeQuery("select N'Uncompleted',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and hocKi='"+cbHocky.getSelectedItem()+"' and tinhTrang=N'Uncompleted')p");
                            if (r2.next()) {
                                rows[0] = r2.getString(1);
                                rows[1] = r2.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r2.getInt(2));
                            }
                            ResultSet r3 = KetNoi.s.executeQuery("select N'Delayed',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and hocKi='"+cbHocky.getSelectedItem()+"' and tinhTrang=N'Delayed')p");
                            if (r3.next()) {
                                rows[0] = r3.getString(1);
                                rows[1] = r3.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r3.getInt(2));
                            }
                            ResultSet r4 = KetNoi.s.executeQuery("select N'Canceled',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and hocKi='"+cbHocky.getSelectedItem()+"' and tinhTrang=N'Canceled')p");
                            if (r4.next()) {
                                rows[0] = r4.getString(1);
                                rows[1] = r4.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r4.getInt(2));
                            }

                            for(int i = 0; i< 4; i++){
                                float tl = (float)(((int)(tblThongke.getValueAt(i, 1))*100)/(float)((int)l.get(0)+(int)l.get(1)+(int)l.get(2)+(int)l.get(3)));
                                tblThongke.setValueAt(tl, i, 2);
                            }
                        }
                    }
                    else{
                        if( cbNamhoc.getSelectedItem() != "All"){
                            ResultSet r1 = KetNoi.s.executeQuery("select N'Completed',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem()+"' and tinhTrang=N'Completed')p");
                            if (r1.next()) {
                                rows[0] = r1.getString(1);
                                rows[1] = r1.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r1.getInt(2));
                            }
                            ResultSet r2 = KetNoi.s.executeQuery("select N'Uncompleted',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem()+"' and tinhTrang=N'Uncompleted')p");
                            if (r2.next()) {
                                rows[0] = r2.getString(1);
                                rows[1] = r2.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r2.getInt(2));
                            }
                            ResultSet r3 = KetNoi.s.executeQuery("select N'Delayed',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem()+"' and tinhTrang=N'Delayed')p");
                            if (r3.next()) {
                                rows[0] = r3.getString(1);
                                rows[1] = r3.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r3.getInt(2));
                            }
                            ResultSet r4 = KetNoi.s.executeQuery("select N'Canceled',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and namHoc= '"+cbNamhoc.getSelectedItem()+"' and tinhTrang=N'Canceled')p");
                            if (r4.next()) {
                                rows[0] = r4.getString(1);
                                rows[1] = r4.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r4.getInt(2));
                            }

                            for(int i = 0; i< 4; i++){
                                float tl = (float)(((int)(tblThongke.getValueAt(i, 1))*100)/(float)((int)l.get(0)+(int)l.get(1)+(int)l.get(2)+(int)l.get(3)));
                                tblThongke.setValueAt(tl, i, 2);
                            }
                        }
                        else{
                            ResultSet r1 = KetNoi.s.executeQuery("select N'Completed',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT = DIEM.maDT and tinhTrang=N'Completed')p");
                            if (r1.next()) {
                                rows[0] = r1.getString(1);
                                rows[1] = r1.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r1.getInt(2));
                            }
                            ResultSet r2 = KetNoi.s.executeQuery("select N'Uncompleted',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and tinhTrang=N'Uncompleted')p");
                            if (r2.next()) {
                                rows[0] = r2.getString(1);
                                rows[1] = r2.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r2.getInt(2));
                            }
                            ResultSet r3 = KetNoi.s.executeQuery("select N'Delayed',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and tinhTrang=N'Delayed')p");
                            if (r3.next()) {
                                rows[0] = r3.getString(1);
                                rows[1] = r3.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r3.getInt(2));
                            }
                            ResultSet r4 = KetNoi.s.executeQuery("select N'Canceled',COUNT(*) from (select Distinct DETAI.maDT, hocKi, namHoc, tinhTrang from DIEM,DETAI where DETAI.maDT=DIEM.maDT and tinhTrang=N'Canceled')p");
                            if (r4.next()) {
                                rows[0] = r4.getString(1);
                                rows[1] = r4.getInt(2);
                                    tableModel.addRow(rows);
                                    l.add(r4.getInt(2));
                            }

                            for(int i = 0; i< 4; i++){
                                float tl = (float)(((int)(tblThongke.getValueAt(i, 1))*100)/(float)((int)l.get(0)+(int)l.get(1)+(int)l.get(2)+(int)l.get(3)));
                                tblThongke.setValueAt(tl, i, 2);
                            }
                        }
                    }
                }
               
            }
            KetNoi.con.close();
        } catch (Exception e) {
        }

        DefaultPieDataset dataset = new DefaultPieDataset();
            if(cbTieuchi.getSelectedItem() == "Progress"){

                dataset.setValue("Completed", (int)tblThongke.getValueAt(0, 1));
                dataset.setValue("Uncompleted", (int)tblThongke.getValueAt(1, 1));
                dataset.setValue("Delayed", (int)tblThongke.getValueAt(2, 1));
                dataset.setValue("Canceled", (int)tblThongke.getValueAt(3, 1));
            }
            else{

                dataset.setValue("Mark A", (int)tblThongke.getValueAt(0, 1));
                dataset.setValue("Mark B+", (int)tblThongke.getValueAt(1, 1));
                dataset.setValue("Mark B", (int)tblThongke.getValueAt(2, 1));
                dataset.setValue("Mark C+", (int)tblThongke.getValueAt(3, 1));
                dataset.setValue("Mark C", (int)tblThongke.getValueAt(4, 1));
                dataset.setValue("Mark D+", (int)tblThongke.getValueAt(5, 1));
                dataset.setValue("Mark D", (int)tblThongke.getValueAt(6, 1));
                dataset.setValue("Mark F", (int)tblThongke.getValueAt(7, 1));
            }

            JFreeChart chart = ChartFactory.createPieChart("CHART", dataset, true, true, true);

            pnlChart.removeAll();
            pnlChart.validate();
            pnlChart.repaint();
            ChartPanel chartPanel = new ChartPanel(chart);
            pnlChart.add(chartPanel);
            chartPanel.setSize(300, 300);
            chartPanel.setLocation(50, 0);
            File file = new File("src/Images/tk.jpeg");
            try {
                ChartUtilities.saveChartAsJPEG(file, chart, 300, 300);
            } catch (IOException ex) {
                Logger.getLogger(ThongKe.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    Desktop dt = Desktop.getDesktop();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        File file = new File("src\\Save_file\\TK.pdf");
        file.delete();
        inThongKe in = new inThongKe(tblThongke, cbTieuchi, cbLoai, cbHocky, cbNamhoc);
        //thread.start();
        int thongbao = JOptionPane.showConfirmDialog(null, "Only read but not save this file?", "", JOptionPane.YES_NO_OPTION );
        if(thongbao == JOptionPane.YES_OPTION){
            
                try {
                    dt.open(new File("src\\Save_file\\TK.pdf"));
                } catch (IOException ex) {
                    //System.out.println("lỗi");
                }
        }
        else{
            JFileChooser c = new JFileChooser();
            int save = c.showSaveDialog(null);
            if (save == JFileChooser.APPROVE_OPTION) {
                File srcFolder = new File("src\\Save_file\\TK.pdf");
                File destFolder = new File(c.getCurrentDirectory().toString()+"\\"+c.getSelectedFile().getName()+".pdf");
                try {
                    Files.copy(srcFolder.toPath(), destFolder.toPath());
                } catch (IOException e) {
                }
                 try {
                    dt.open(destFolder);
                } catch (IOException ex) {
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    



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
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JComboBox<String> cbHocky;
    private javax.swing.JComboBox<String> cbLoai;
    private javax.swing.JComboBox<String> cbNamhoc;
    private javax.swing.JComboBox<String> cbTieuchi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnlChart;
    private javax.swing.JTable tblThongke;
    // End of variables declaration//GEN-END:variables
}
