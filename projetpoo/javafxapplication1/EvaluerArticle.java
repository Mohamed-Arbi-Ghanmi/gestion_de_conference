/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javafxapplication1;

/**
 *
 * @author mohamed
 */
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class EvaluerArticle extends javax.swing.JFrame {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/projetpoo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private List<Integer> articleIds = new ArrayList<>();
     private DefaultListModel<String> listModel;
    
     public EvaluerArticle() {
        initComponents();
        setLocationRelativeTo(null);
        initArticleList();
//        addListMouseListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jScrollPane1.setBackground(new java.awt.Color(0, 153, 153));

        jList1.setBackground(new java.awt.Color(0, 153, 153));
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jList1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jList1.setSelectionForeground(new java.awt.Color(0, 153, 153));
        jScrollPane1.setViewportView(jList1);

        jButton2.setBackground(new java.awt.Color(204, 51, 0));
        jButton2.setText("Refuser");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setText("previous");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Accepter");
        jButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Lire");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(47, 47, 47)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(276, 276, 276))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(323, 323, 323))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6)
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
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

int memberId = Login.getUserId();

  private void initArticleList() {
    listModel = new DefaultListModel<>();
    System.out.println(memberId);

    // Code pour récupérer les articles affectés à ce membre avec un état 'UE'
    try (Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
        String sql = "SELECT * FROM article WHERE id_user = ? AND etat = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, memberId); // Utilisez memberId pour filtrer les articles du membre connecté
            statement.setString(2, "UE"); // Filtrer les articles avec l'état 'UE'
            System.out.println(memberId);
            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    int articleId = rs.getInt("id_article");
                    String articleTitre = rs.getString("titre_article");
                    listModel.addElement(articleTitre); // Ajoute le titre de l'article à la liste d'affichage
                    articleIds.add(articleId); // Ajoute l'ID de l'article à la liste des ID
                    System.out.println("Article ajouté : ID=" + articleId + ", Titre=" + articleTitre);

                }
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Erreur SQL : " + ex.getMessage());
    }
    
    jList1.setModel(listModel); // Définit le modèle de liste avec les articles récupérés
}

//
//    private void addListMouseListener() {
//        jList1.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                if (e.getClickCount() == 2) { // Vérifie si c'est un double clic
//                    JList<?> list = (JList<?>) e.getSource();
//                    int selectedIndex = list.getSelectedIndex();
//                    if (selectedIndex != -1) { // Vérifie si un élément est sélectionné
//                        // Récupère l'ID de l'article sélectionné
//                        int selectedArticleId = articleIds.get(selectedIndex);
//                        // Récupère le chemin du fichier PDF
//                        String pdfFilePath = getCheminFichierPDF(selectedArticleId);
//                        if (pdfFilePath != null && !pdfFilePath.isEmpty()) {
//                            // Ouvre le fichier PDF
//                            openPDFFile(pdfFilePath);
//                        } else {
//                            JOptionPane.showMessageDialog(EvaluerArticle.this, "Fichier PDF introuvable pour cet article.");
//                        }
//                    }
//                }
//            }
//        });
//    }
//
//    private String getCheminFichierPDF(int articleId) {
//        // Code pour récupérer le chemin du fichier PDF en fonction de l'ID de l'article
//        // Remplacez cette partie avec votre propre logique
//        return "/home/mohamed/Téléchargements/BPM ACTIVITÉ N°1 .pdf";
//    }
//
//    private void openPDFFile(String filePath) {
//        File file = new File(filePath);
//        try {
//            Desktop.getDesktop().open(file);
//        } catch (IOException ex) {
//            JOptionPane.showMessageDialog(this, "Erreur lors de l'ouverture du fichier PDF : " + ex.getMessage());
//        }
//    }



    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          if (!articleIds.isEmpty()) { // Vérifie si la liste des IDs d'articles n'est pas vide
        int selectedIndex = jList1.getSelectedIndex();
        if (selectedIndex != -1) {
            int selectedArticleId = articleIds.get(selectedIndex);
            System.out.println("Index sélectionné : " + selectedIndex);
            // Mettez ici le code pour mettre à jour l'état de l'article à "Refusé"
            // par exemple, vous pouvez utiliser une requête SQL pour mettre à jour la base de données
            try (Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
                String sql = "UPDATE article SET etat = ? WHERE id_article = ?";
                try (PreparedStatement statement = conn.prepareStatement(sql)) {
                    statement.setString(1, "REJ");
                    statement.setInt(2, selectedArticleId);
                    int rowsAffected = statement.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "L'article a été refusé avec succès.");
                        // Mettez ici le code pour rafraîchir la liste des articles
                        // par exemple, vous pouvez rappeler initArticleList()
                        initArticleList();
                    } else {
                        JOptionPane.showMessageDialog(this, "Erreur lors de la mise à jour de l'article.");
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erreur SQL : " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner un article à refuser.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Aucun article trouvé à refuser.");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
        MenuCom NewWindow = new MenuCom();
        NewWindow.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if (!articleIds.isEmpty()) { // Vérifie si la liste des IDs d'articles n'est pas vide
        int selectedIndex = jList1.getSelectedIndex();
        if (selectedIndex != -1) { // Vérifie si un article est sélectionné dans la liste
            int selectedArticleId = articleIds.get(selectedIndex);
            System.out.println("Index sélectionné : " + selectedIndex);
            // Mettez ici le code pour mettre à jour l'état de l'article à "Accepté"
            // par exemple, vous pouvez utiliser une requête SQL pour mettre à jour la base de données
            try (Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
                String sql = "UPDATE article SET etat = ? WHERE id_article = ?";
                try (PreparedStatement statement = conn.prepareStatement(sql)) {
                    statement.setString(1, "ACC");
                    statement.setInt(2, selectedArticleId);
                    int rowsAffected = statement.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "L'article a été accepté avec succès.");
                        // Mettez ici le code pour rafraîchir la liste des articles
                        // par exemple, vous pouvez rappeler initArticleList()
                        initArticleList();
                    } else {
                        JOptionPane.showMessageDialog(this, "Erreur lors de la mise à jour de l'article.");
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erreur SQL : " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner un article à accepter.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Aucun article trouvé à accepter.");
    }        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!articleIds.isEmpty()) { // Vérifie si la liste des IDs d'articles n'est pas vide
        int selectedIndex = jList1.getSelectedIndex();
        if (selectedIndex != -1) { // Vérifie si un article est sélectionné dans la liste
            // Récupère l'ID de l'article sélectionné
            int selectedArticleId = articleIds.get(selectedIndex);
            // Récupère le chemin du fichier PDF
            String pdfFilePath = getCheminFichierPDF(selectedArticleId);
            if (pdfFilePath != null && !pdfFilePath.isEmpty()) {
                // Ouvre le fichier PDF
                openPDFFile(pdfFilePath);
            } else {
                JOptionPane.showMessageDialog(this, "Fichier PDF introuvable pour cet article.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner un article à lire.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Aucun article trouvé à lire.");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private String getCheminFichierPDF(int articleId) {
    // Code pour récupérer le chemin du fichier PDF en fonction de l'ID de l'article
    // Remplacez cette partie avec votre propre logique
    // Par exemple, si le chemin est stocké dans la base de données
    try (Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
        String sql = "SELECT fichier_pdf FROM article WHERE id_article = ?";
        try (PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setInt(1, articleId);
            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("fichier_pdf");
                }
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Erreur SQL : " + ex.getMessage());
    }
    return null;
}

private void openPDFFile(String filePath) {
    File file = new File(filePath);
    try {
        Desktop.getDesktop().open(file);
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, "Erreur lors de l'ouverture du fichier PDF : " + ex.getMessage());
    }
}
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
            java.util.logging.Logger.getLogger(EvaluerArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EvaluerArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EvaluerArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EvaluerArticle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EvaluerArticle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
