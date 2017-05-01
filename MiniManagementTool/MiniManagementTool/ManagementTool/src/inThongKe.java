
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTable;


public class inThongKe {
        
           
        public static File fontFile = new File("vuArial.ttf");

        public inThongKe( JTable table, JComboBox cbTieuchi, JComboBox cbLoai, JComboBox cbHocky, JComboBox cbNamhoc ) {
            Date thoiGian = new Date();
            SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy");
            String ngayHeThong = dinhDang.format(thoiGian.getTime());
            try {
                Document document = new Document(PageSize.A4, 40, 30, 30, 30);
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("src\\Save_file\\TK.pdf"));
                
                BaseFont bf = null;
                try {
                    bf = BaseFont.createFont(fontFile.getAbsolutePath(), BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
                } catch (IOException ex) {
                }
                Font font1 = new Font(bf, 20);
                Font font2 = new Font(bf, 15);
                Font font3 = new Font(bf,11, BaseFont.ITALICANGLE);

                document.open();
                document.add(new Paragraph("The Project & Thesis Management Tool                                                                                     "+ngayHeThong+"", font3));
                document.add(Chunk.NEWLINE);
                ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER, new Phrase("page " + (document.getPageNumber()+1)), 550, 30, 0);

                document.add(new Paragraph("The Statistic", font1));
                document.add(new Paragraph("\nStandard: " + cbTieuchi.getSelectedItem().toString(), font2));
                document.add(new Paragraph("Topic type: " + cbLoai.getSelectedItem().toString(), font2));
                document.add(new Paragraph("Semester: " + cbHocky.getSelectedItem().toString(), font2));
                document.add(new Paragraph("Year: " + cbNamhoc.getSelectedItem().toString(), font2));
                
                try {
                    Image image = Image.getInstance("src\\Images\\tk.jpeg");
                    image.scaleAbsolute(100f,100f);
                    image.setAbsolutePosition(150f, 320f);
                    image.scalePercent(100f);
                    
                    document.add(image);
                } catch (BadElementException ex) {
                } catch (IOException ex) {
                }
                
                PdfPTable tb = new PdfPTable(4);
                tb.setSpacingBefore(20);
                tb.setSpacingAfter(20);
                float[] withs = { 10.0f, 20.0f, 20.0f, 15.0f};
                tb.setWidths(withs);
                if( cbTieuchi.getSelectedItem() == "Mark ranking"){
                    PdfPCell c1 = new PdfPCell(new Phrase("STT", font2));
                    c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tb.addCell(c1);
                    PdfPCell c2 = new PdfPCell(new Phrase("Topic type", font2));
                    c2.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tb.addCell(c2);
                    PdfPCell c3 = new PdfPCell(new Phrase("Number of topic", font2));
                    c3.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tb.addCell(c3);
                    PdfPCell c4 = new PdfPCell(new Phrase("Proportion (%)", font2));
                    c4.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tb.addCell(c4);
                   
                }
                else{
                    PdfPCell c1 = new PdfPCell(new Phrase("STT", font2));
                    c1.setBackgroundColor(BaseColor.DARK_GRAY);
                    tb.addCell(c1);
                    PdfPCell c2 = new PdfPCell(new Phrase("Progress", font2));
                    c2.setBackgroundColor(BaseColor.DARK_GRAY);
                    tb.addCell(c2);
                    PdfPCell c3 = new PdfPCell(new Phrase("Number of topic", font2));
                    c3.setBackgroundColor(BaseColor.DARK_GRAY);
                    tb.addCell(c3);
                    PdfPCell c4 = new PdfPCell(new Phrase("Proportion (%)", font2));
                    c4.setBackgroundColor(BaseColor.DARK_GRAY);
                    tb.addCell(c4);
                }
                for(int i = 0; i < table.getRowCount(); i++){
                    tb.addCell(""+(i + 1));
                    tb.addCell(table.getValueAt(i, 0)+"");
                    tb.addCell(table.getValueAt(i, 1)+"");
                    tb.addCell(table.getValueAt(i, 2)+"");
                }
                document.add(Chunk.NEWLINE);
                document.add(Chunk.NEWLINE);
                document.add(Chunk.NEWLINE);
                document.add(Chunk.NEWLINE);
                document.add(Chunk.NEWLINE);
                document.add(Chunk.NEWLINE);
                document.add(Chunk.NEWLINE);
                document.add(Chunk.NEWLINE);
                document.add(Chunk.NEWLINE);
                document.add(Chunk.NEWLINE);
                document.add(Chunk.NEWLINE);
                document.add(Chunk.NEWLINE);
                document.add(Chunk.NEWLINE);


                document.add(tb);
                document.close();
             
            } catch (FileNotFoundException | DocumentException e) {
                e.printStackTrace(System.out);
            }
        }

}


   
