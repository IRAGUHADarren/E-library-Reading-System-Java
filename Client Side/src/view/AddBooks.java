/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.File;
import java.io.FileInputStream;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Book;
import model.Publisher;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.commons.logging.LogFactory;
import org.apache.fontbox.type1.DamagedFontException;
import org.apache.pdfbox.pdmodel.common.PDRectangle;

import service.BookInterface;
import service.PublisherInterface;
/**
import service.BookInterface;

/**
 *
 * @author ZIPTECH LTD
 */
public class AddBooks extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddBooks
     */
    public AddBooks() {
        initComponents();
        addPublisheriditem();
    }
    
    private void addPublisheriditem(){
    publishercombo.removeAllItems();
    try{
    Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000);
    PublisherInterface intrf = (PublisherInterface) registry.lookup("Publisher");
    List<Publisher> publishList = intrf.allPublisher();
    Iterator iterator = publishList.iterator();
    while(iterator.hasNext())
    {
    Publisher pub = (Publisher)iterator.next();
    publishercombo.addItem(pub.getPublishername());
    
    }
    }
    catch(Exception ex)
    {}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        booknametxt = new javax.swing.JTextField();
        updatebtn = new javax.swing.JButton();
        authortxt = new javax.swing.JTextField();
        deletebtn = new javax.swing.JButton();
        bookpdftxt = new javax.swing.JTextField();
        downloadreport = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();
        dateofrelease = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        bookcategorytxt = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        uploadbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        bookidtxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        imagelabel = new javax.swing.JLabel();
        publishercombo = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Book ID");

        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        downloadreport.setText("Report");
        downloadreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadreportActionPerformed(evt);
            }
        });

        savebtn.setText("SAVE");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Book Name");

        bookcategorytxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Romance", "Literature", "Philosophy" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Author");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Book Category");

        uploadbtn.setText("Upload");
        uploadbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadbtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Date Of Release");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel6.setText("Book PDF");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Book Publisher");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dateofrelease, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                .addComponent(downloadreport)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7))
                                .addGap(146, 146, 146)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bookpdftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(uploadbtn))
                                    .addComponent(bookcategorytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(authortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(booknametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(publishercombo, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bookidtxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(imagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bookidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(booknametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(publishercombo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(authortxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(bookcategorytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(imagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bookpdftxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadbtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateofrelease, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(69, 69, 69)
                        .addComponent(downloadreport)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        try {
            if (bookidtxt.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please provide a book ID", "Data Required", JOptionPane.WARNING_MESSAGE);
            } else {
                Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000);
                BookInterface intrf = (BookInterface) registry.lookup("Book");

                // Retrieve the existing book from the database
                String bookId = bookidtxt.getText();
                Book book = intrf.getBookById(bookId);

                if (book == null) {
                    JOptionPane.showMessageDialog(this, "Book not found", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Update the book information based on the user's input
                    book.setBookName(booknametxt.getText());
                    book.setAuthor(authortxt.getText());
                    book.setAuthor(authortxt.getText());
                    book.setDateCategory(bookcategorytxt.getSelectedItem().toString());

                    // Call the updateBook() method of the BookInterface to update the book in the database
                    String feedback = intrf.updateBook(book);
                    JOptionPane.showMessageDialog(this, feedback, "Update Successful", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:

        try {
            if (bookidtxt.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please provide a book ID", "Data Required", JOptionPane.WARNING_MESSAGE);
            } else {
                int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this book?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000);
                    BookInterface intrf = (BookInterface) registry.lookup("Book");

                    String bookId = bookidtxt.getText();
                    String feedback = intrf.deleteBook(bookId);

                    if (feedback.equals("success")) {
                        JOptionPane.showMessageDialog(this, "Book deleted successfully", "Delete Successful", JOptionPane.INFORMATION_MESSAGE);
                        //clearFields(); // Optional: Clear the input fields after successful deletion
                    } else {
                        JOptionPane.showMessageDialog(this, feedback, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void downloadreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadreportActionPerformed
        // TODO add your handling code here:
        try {
            // Connect to the database and retrieve all the information from the table
            Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000);
            BookInterface intrf = (BookInterface) registry.lookup("Book");
            List<Book> books = intrf.getAllBook(); // Assuming you have a method to retrieve all books from the database

            // Create a new PDF document
            PDDocument document = new PDDocument();
            PDPage page = new PDPage(PDRectangle.A4);
            document.addPage(page);
            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            // Set font and font size
            contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);

            // Set initial y-coordinate for content
            float y = page.getMediaBox().getHeight() - 50;

            // Draw header row
            contentStream.beginText();
            contentStream.newLineAtOffset(50, y);
            contentStream.showText("Book ID");
            contentStream.newLineAtOffset(100, 0);
            contentStream.showText("Book Name");
            contentStream.newLineAtOffset(100, 0);
            contentStream.showText("Author");
            contentStream.newLineAtOffset(100, 0);
            contentStream.showText("Category");
            contentStream.endText();
            y -= 20;

            // Draw book information
            for (Book book : books) {
                contentStream.beginText();
                contentStream.newLineAtOffset(50, y);
                contentStream.showText(String.valueOf(book.getBookID()));
                contentStream.newLineAtOffset(100, 0);
                contentStream.showText(book.getBookName());
                contentStream.newLineAtOffset(100, 0);
                contentStream.showText(book.getAuthor());
                contentStream.newLineAtOffset(100, 0);
                contentStream.showText(book.getDateCategory());
                contentStream.endText();
                y -= 20;
            }

            // Close the content stream
            contentStream.close();

            // Save the PDF document to a file
            File reportFile = new File("report.pdf");
            document.save(reportFile);
            document.close();

            JOptionPane.showMessageDialog(this, "Report downloaded successfully", "Download Successful", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_downloadreportActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:

        try {
            if(booknametxt.getText().trim().isEmpty()
                || authortxt.getText().trim().isEmpty()
                || bookpdftxt.getText().trim().isEmpty())
            {

                JOptionPane.showMessageDialog(this, "Provide all information", "Data Required", JOptionPane.WARNING_MESSAGE );

            }
            else {
    Registry registry = LocateRegistry.getRegistry("127.0.0.1", 5000);
    BookInterface intrf = (BookInterface) registry.lookup("Book");
    PublisherInterface interf = (PublisherInterface) registry.lookup("Publisher");
     
    Book book = new Book();
    book.setBookID(bookidtxt.getText());
    book.setBookName(booknametxt.getText());
    book.setAuthor(authortxt.getText());
    book.setPublishername_fk(publishercombo.getSelectedItem().toString());
// Set the publisher foreign key for the book

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");

// Get the selected date from the date chooser
Date selectedDate = dateofrelease.getDate();

// Format the date using the desired format
String formattedDate = dateFormat.format(selectedDate);


    // Parse the formatted date string back to a Date object
    Date parsedDate = dateFormat.parse(formattedDate);

    // Set the parsed date in your book object
    book.setDateReleased(parsedDate);

    book.setDateCategory(bookcategorytxt.getSelectedItem().toString());

    // Set book PDF
    String pdfFilePath = bookpdftxt.getText();
    File pdfFile = new File(pdfFilePath);
    FileInputStream pdfInputStream = new FileInputStream(pdfFile);
    byte[] pdfFileContent = new byte[(int) pdfFile.length()];
    pdfInputStream.read(pdfFileContent);
    pdfInputStream.close();
    book.setBookPdf(pdfFileContent);


    String feedback = intrf.registerBook(book);
    JOptionPane.showMessageDialog(this, feedback, "Successful", JOptionPane.INFORMATION_MESSAGE);
}
        }

        catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void uploadbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadbtnActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            // Do something with the selected file, for example:
            // display its path in a text field
            bookpdftxt.setText(selectedFile.getAbsolutePath());
        }
    }//GEN-LAST:event_uploadbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField authortxt;
    private javax.swing.JComboBox<String> bookcategorytxt;
    private javax.swing.JTextField bookidtxt;
    private javax.swing.JTextField booknametxt;
    private javax.swing.JTextField bookpdftxt;
    private com.toedter.calendar.JDateChooser dateofrelease;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton downloadreport;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> publishercombo;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton updatebtn;
    private javax.swing.JButton uploadbtn;
    // End of variables declaration//GEN-END:variables
}
