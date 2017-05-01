
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class dataSql {
    KetNoi kn = new KetNoi();
    
    public void DataSinhvien( int maDT, JTable table){
        kn.KN();
        try {
            ResultSet r = KetNoi.s.executeQuery("Select * from SINHVIEN, NHOM where SINHVIEN.maSV = NHOM.maSV and maDT = "+maDT+"");
            for(int i = 0; i < 10; i++){
                if(r.next()){
                    table.setValueAt(r.getString(2), i, 0);
                    table.setValueAt(r.getString(1), i, 1);
                    table.setValueAt(r.getString(3), i, 2);
                    table.setValueAt(r.getString(4), i, 3);
                    table.setValueAt(r.getBoolean(8), i, 4);
                }
            }
            
            KetNoi.con.close();
        } catch (SQLException ex) {
        }
    }
     public void set_table(JTable table ){
        JComboBox cbSinhvien = new JComboBox();
        cbSinhvien.addItem("Chairman");
        cbSinhvien.addItem("Commissioner");
        cbSinhvien.addItem("Reviewer");
        DefaultCellEditor de = new DefaultCellEditor(cbSinhvien);
        table.getColumnModel().getColumn(4).setCellEditor(de);
    } 
    public void DataCanbo(int maDT, JTable table) {
        kn.KN();
        try {
            DefaultTableModel tableModel = new DefaultTableModel();
            String []colsName = {"Teacher ID", "Teacher name", "Email", "Contact number", "Role", "Mark"};
            tableModel.setColumnIdentifiers(colsName);
            table.setModel(tableModel);
           
            Object [] rows = new Object[6];
            ResultSet r = KetNoi.s.executeQuery("Select CANBO.maCB, tenCB, mail, soDT, chucVu, diem from CANBO, DIEM where CANBO.maCB = DIEM.maCB and maDT = "+maDT+"");
            int i = 0;
            while(r.next()){
                rows[0] = r.getString(1);
                rows[1] = r.getString(2);
                rows[2] = r.getString(3);
                rows[3] = r.getString(4);
                rows[5] = r.getFloat(6);
                tableModel.addRow(rows);
                table.setValueAt(r.getString(5), i, 4);
                i++;
            }
            set_table(table);
            KetNoi.con.close();
        } catch (SQLException ex) {
        }
        
    }
    
    public void DataTinhtrang(int maDT, JTable table){
         kn.KN();
        try {
            DefaultTableModel tableModel = new DefaultTableModel();
            String []colsName = {"State", "Date Started", "Date ended", "Final mark"};
            tableModel.setColumnIdentifiers(colsName);
            table.setModel(tableModel);
            Object [] rows = new Object[4];
            ResultSet r = KetNoi.s.executeQuery("Select tinhTrang, ngayBD, ngayKT, diemTong from DETAI where maDT = "+maDT+"");
            while(r.next()){
                rows[0] = r.getString(1);
                rows[1] = r.getString(2);
                rows[2] = r.getString(3);
                rows[3] = r.getString(4);
                tableModel.addRow(rows);
            }
            KetNoi.con.close();
        } catch (SQLException ex) {
        }
    }
    
    public String DataDiemtong(JTable table){
        ArrayList<Float> l = new ArrayList<Float>();
        int r = 1;
        for(int i = 0; i < table.getRowCount(); i++){
            if((table.getValueAt(i,5)) == "null"  || (table.getValueAt(i,5)) == null ){
            }
            else{ 
                l.add(Float.parseFloat(table.getValueAt(i, 5)+""));
                r++;
            }
        }     
        if(r == 1){
            return null;
        }
        else{
            float diemTong = 0;
            for(int i = 0; i < l.size(); i++){
                diemTong = diemTong + l.get(i);
            }
            float TB = diemTong/l.size();
            if( TB < 4){
                return "F";
            }
            else if( TB < 5){
                return "D";
            }
            else if( TB < 5.5){
                return "D+";
            }
            else if( TB < 6.5){
                return "C";
            }
            else if( TB < 7){
                return "C+";
            }
            else if( TB < 8){
                return "B";
            }
            else if( TB < 9){
                return "B+";
            }
            else return "A";
        }
    }
    
}
