/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import controller.ProjectController;
import controller.TaskController;
import java.awt.Color;
import controller.ProjectDAO;
import controller.TaskDAO;
import java.awt.Component;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.DefaultListModel;
import jdk.internal.org.jline.utils.ShutdownHooks.Task;
import model.Project;
import util.TaskTableModel;
        


/**
 *
 * @author Fernandavf
 */
public class MainScreen extends javax.swing.JFrame {
ProjectController projectController;
TaskController taskController;

    DefaultListModel projectsModel;
    TaskTableModel taskModel;
    
    private Object JListaProjects;
    private Object jTableListProjects;
    private Object jTableListProject;
    private Object jPanelEmpty;
    private Object jPanel7EmptyTasks;
    private Object jPanelEmptyTasks;
    private Object jPanelEmptyList;
    private Object jPanel7;
    private Object jScrollPaneTasks;
    private Object tasks;
    private Object jListProjects;
    private Panel panel7;

    
    public MainScreen() {
        initComponents();
        
        // esse eu fiz novo
        decorateTableTask();
                
        initDataController();
        initComponentsModel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        panel1 = new java.awt.Panel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelToolbarProject = new javax.swing.JLabel();
        jLabelProjectAdd = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelToolbarTask = new javax.swing.JLabel();
        jLabelTaskAdd = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListProjects = new javax.swing.JList<>();
        panel7 = new java.awt.Panel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTask = new javax.swing.JTable();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        panel1.setMinimumSize(new java.awt.Dimension(600, 800));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lista.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 102));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nenhuma tarefa por aqui :)");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Clique no botão mais para adicionar uma nova tarefa");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 166, Short.MAX_VALUE)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(325, 325, 325))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(116, 116, 116))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ok2.jpg"))); // NOI18N
        jLabel1.setText("Checklist Facility");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Anote tudo, não equeça nada");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelToolbarProject.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelToolbarProject.setForeground(new java.awt.Color(0, 153, 102));
        jLabelToolbarProject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelToolbarProject.setText("Projeto");

        jLabelProjectAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mais.png"))); // NOI18N
        jLabelProjectAdd.setText("jLabel5");
        jLabelProjectAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelProjectAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelToolbarProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelProjectAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelProjectAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabelToolbarProject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelToolbarTask.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelToolbarTask.setForeground(new java.awt.Color(0, 153, 102));
        jLabelToolbarTask.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelToolbarTask.setText("Tarefas");

        jLabelTaskAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTaskAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mais.png"))); // NOI18N
        jLabelTaskAdd.setText("jLabel6");
        jLabelTaskAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTaskAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelToolbarTask, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTaskAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelToolbarTask, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTaskAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableListProjects.setFixedCellHeight(50);
        jTableListProjects.setSelectionBackground(new java.awt.Color(0, 153, 102));
        jTableListProjects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListProjectsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListProjects);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        panel7.setLayout(new java.awt.BorderLayout());

        jTableTask.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTableTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Prazo", "Tarefa Concluida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTask.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTask.setRowHeight(40);
        jTableTask.setSelectionBackground(new java.awt.Color(153, 255, 153));
        jTableTask.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTaskMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableTask);

        panel7.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// quando o usúario clicar no mais do projeto, uma tela se abrirá
    private void jLabelProjectAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProjectAddMouseClicked
     
   ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen (this, rootPaneCheckingEnabled);
        
    projectDialogScreen.setVisible(true);
    
    projectDialogScreen.addWindowListener(new WindowAdapter() {
        
       @Override
       public void windowClosed(WindowEvent e){
           loadProjects();
       } 

       private void loadProjects() {
           throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       }
        
    });
    
    
    
    
    }//GEN-LAST:event_jLabelProjectAddMouseClicked

    private void jLabelTaskAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTaskAddMouseClicked
TaskJDialogScreen taskDialogScreen = new TaskJDialogScreen(this, rootPaneCheckingEnabled);
//taskDialogScreen.setProject(null);

int projectIndex =  JListaProjects. getSelectedIndex();
Project project = (Project) projectsModel.get(projectIndex);
taskDialogScreen.setProject(project);

taskDialogScreen.setVisible(true);

taskDialogScreen.addWindowListener(new WindowListener(){
    
     public void windowClosed(WindowEvent e){
           
         int projectIndex =  JListaProjects.selectedIndex();
         
         Project project = (Project) projectsModel.get(projectIndex);
       } 

    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void windowClosing(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
        
    );

        
    }//GEN-LAST:event_jLabelTaskAddMouseClicked

    private void jTableListProjectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListProjectsMouseClicked
         
        int ProjectIndex = jTableListProjects.getSelectedIndex();
        Project project = (Project)projectsModel.get(ProjectIndex);
        
        loadTasks(project.getId());
 
 }

    private void initComponentsModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void decorateTableTask() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void initDataController() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void loadTasks(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

       private void jTableTaskMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
int rowIndex = jTableTask.rowAtPoint(evt.getPoint());
int columnIndex = jTableTask.columnAtPoint(evt.getPoint());


 switch (columnIndex){
     case 3:
         Task task =taskModel.getTask().get(rowIndex);
         taskController.upDate(task);
         break;
         
     case 4:
         break;
         
     case 5:
         break;


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
                if ("Java Swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
        
    }
     
    
    
    
    private void showJTableTasks(boolean hasTasks) {
        if (hasTasks) {
            
            if (jTableListProjects.isVisible()) {
                jTableListProjects.setVisible(false);
                panel7.remove((Component) jPanelEmptyList);
            }

            panel7.add((Component) jScrollPaneTasks);
            jTableTask.setVisible(true);
            jTableTask.setSize(jTableTask.getWidth(), jTableTask.getHeight());
        } else {
            if (jTableTask.isVisible()) {
                jTableTask.setVisible(false);
                panel7.remove((Component) jScrollPaneTasks);
            }

            panel7.add((Component) jPanelEmptyTasks);
            jTableListProjects.setVisible(true);
            jTableTask.setSize(panel7.getWidth(), panel7.getHeight());
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelToolbarProject;
    private javax.swing.JLabel jLabelToolbarTask;
    private javax.swing.JLabel jLabelTaskAdd;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelProjectAdd;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jTableListProjects;
    private javax.swing.JTable jTableTask;
    private java.awt.Panel panel1;
    // End of variables declaration                   

       
    // costumizando o headerda tabela de tarefas
    public void decorateTableTask (){
        
        jTableTask.getTableHeader().setFont (new Font ("segoe UI", Font.BOLD,14));
        
        jTableTask.getTableHeader().setBackground(new Color(0,153,102));
        
        jTableTask.setForeground( new Color (255,255,255));
        
        // criando um sort automatico para as colunas da tabela
        jTableTask.setAutoCreateRowSorter(true);
    }
    public void initDataController(){
        projectController = new ProjectController();
        taskController = new TaskController();
    }
    
    public void initComponentsModel(){
        projectsModel = new DefaultListModel();
        loadProjects();
        
        taskModel = new TaskTableModel();
        jTableTask.setModel(taskModel);
        
        
        
        // id do projeto que será carregado        
        loadTask(14);
        
        if (!projectsModel.isEmpty()) {
            jListProjects.setSelectedIndex(0);
            
            Project project = (Project) projectsModel.get(0);
            loadTasks(project.getId());
        
      
        
    }

    private List<Task> taskController(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void loadTask(int idProject){
    // carrega as listas de tarefas do projeto, busca pelo ID
    List <Task> task = taskController(idProject);
    taskModel.setTask(task);
        showJTableTasks(! tasks.isEmpty());
    
}
    
    public void loadProjects (){
        List <Project> projects = projectController.getAll();
        projectsModel.clear();
        
        for (int i=0; i<projects.size();i++){
            Project project = projects.get(i);
            
            projectsModel.addElement(project);
        }
        
      jTableListProjects.setModel(projectsModel);
    }
}











  /*
    }//GEN-LAST:event_jTableListProjectsMouseClicked







    private void jTableTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTaskMouseClicked



}


    }//GEN-LAST:event_jTableTaskMouseClicked

        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelProjectAdd;
    private javax.swing.JLabel jLabelTaskAdd;
    private javax.swing.JLabel jLabelToolbarProject;
    private javax.swing.JLabel jLabelToolbarTask;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> jTableListProjects;
    private javax.swing.JTable jTableTask;
    private java.awt.Panel panel1;
    private java.awt.Panel panel7;
    // End of variables declaration//GEN-END:variables
*/