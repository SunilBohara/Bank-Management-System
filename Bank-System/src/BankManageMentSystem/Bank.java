package BankManageMentSystem;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Bank extends javax.swing.JFrame {

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String user = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/javaproject";
    private Connection connection;
    private long mainBalance;
    private int totalAnswer;
    private int transferfinalAnswer;
    private long withdrawMainBalance;
    private long transfermainBalance;
    private int withfinalAnswer;
    private int withtotalAnswer;

    public Bank() {
        initComponents();
        bankAllList();
        com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme("s", "s", "s");
        transactions_Table();
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\EVSILEROOT\\Desktop\\DOG.jpg");
        Image image = imageIcon.getImage();
        Image imageScale = image.getScaledInstance(photoLabel.getWidth(), photoLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaIcon = new ImageIcon(imageScale);
        photoLabel.setIcon(scaIcon);
        ImageIcon imageIcon1 = new ImageIcon("C:\\Users\\EVSILEROOT\\Desktop\\Renew Program\\Registration Form\\src\\BankManageMentSystem\\Icons\\museum.png");
        Image image1 = imageIcon1.getImage();
        Image imageScale1 = image1.getScaledInstance(photoLabel.getWidth(), photoLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon logo = new ImageIcon(imageScale1);
        this.setIconImage(logo.getImage());
    }

    public void transactionsDetails() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            String depositeAmount = dAmount.getText();
            int fdepositeAmount = Integer.parseInt(depositeAmount);

            String withdrawAmount = wAmount.getText();
            int fwithdrawAmount = Integer.parseInt(withdrawAmount);

            String account_n = dCredit.getText();
            int findepAccount = Integer.parseInt(account_n);

            String withdrawBalance = wDebiteAccount.getText();
            int finwithAccount = Integer.parseInt(withdrawBalance);

            String withName = wName.getText();
            String depName = dName.getText();

            PreparedStatement traStatement = connection.prepareStatement("insert into bank_demo ");
        } catch (Exception e) {
        }
    }

    public void bankAllList() {
        DefaultTableModel defaultTableModel = (DefaultTableModel) customerListTable.getModel();
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement preparedStatement = connection.prepareStatement("select name,DOB,acc_type,gender,mobile_no,address from bank_demo");
            ResultSet resultSet = preparedStatement.executeQuery();
            defaultTableModel.setRowCount(0);
            while (resultSet.next()) {
                String[] datas = {resultSet.getString("name"), resultSet.getString("DOB"), resultSet.getString("acc_type"), resultSet.getString("gender"), resultSet.getString("mobile_no"), resultSet.getString("address")};
                defaultTableModel.fireTableDataChanged();
                defaultTableModel.addRow(datas);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        mainLabel = new javax.swing.JTabbedPane();
        proTab = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnameF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pDob = new javax.swing.JTextField();
        pGender = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pNation = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pAccounType = new javax.swing.JTextField();
        pSecQue = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pMobile = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pCaste = new javax.swing.JTextField();
        paccNumber = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        updateSaving = new javax.swing.JButton();
        update = new javax.swing.JButton();
        pAddress = new javax.swing.JTextField();
        depTab = new javax.swing.JPanel();
        dAmount = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dBalance = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dUser = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dSearchbtn = new javax.swing.JButton();
        dfinalResult = new javax.swing.JTextField();
        totalBtn = new javax.swing.JButton();
        depositBtn = new javax.swing.JButton();
        dName = new javax.swing.JLabel();
        dCredit = new javax.swing.JLabel();
        tranTab = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        tUser = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tAmount = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        tFinalResult = new javax.swing.JTextField();
        tBalance = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tName = new javax.swing.JLabel();
        tDebit = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        tCreditAccount = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        withTab = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        wUser = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        wAmount = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        wBalance = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        wName = new javax.swing.JTextField();
        wDebiteAccount = new javax.swing.JTextField();
        wTotal = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        tranTable = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        transactionsTable = new javax.swing.JTable();
        jLabel59 = new javax.swing.JLabel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        pinTab = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        changeBtn = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        pinUser = new javax.swing.JTextField();
        pinLabel = new javax.swing.JLabel();
        oldPin = new javax.swing.JPasswordField();
        newPin = new javax.swing.JPasswordField();
        confirmPin = new javax.swing.JPasswordField();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        devTab = new javax.swing.JPanel();
        photoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        sqlLoading = new javax.swing.JProgressBar();
        jLabel27 = new javax.swing.JLabel();
        javaLoading = new javax.swing.JProgressBar();
        jLabel43 = new javax.swing.JLabel();
        javaScriptLoading = new javax.swing.JProgressBar();
        JavaSciprt = new javax.swing.JLabel();
        regTab = new javax.swing.JPanel();
        dbdob = new javax.swing.JTextField();
        dbAddress = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        dbaccountType = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        dbGender = new javax.swing.JTextField();
        dbMobile = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        dbNation = new javax.swing.JTextField();
        dbName = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        dbCaste = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        dbmicr = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        dbMainBalance = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        dbAnswer = new javax.swing.JTextField();
        dbSecuq = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel55 = new javax.swing.JLabel();
        dbPin = new javax.swing.JTextField();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        customerTable = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        customerListTable = new javax.swing.JTable();
        jLabel44 = new javax.swing.JLabel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        balTab = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        modBalance = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        viewBalance = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        bName = new javax.swing.JTextField();
        bUser = new javax.swing.JTextField();
        bAccountNumber = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        searchNameTextF = new javax.swing.JTextField();
        searchingByName = new javax.swing.JButton();
        dateTextField = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        sunriseBanking = new javax.swing.JLabel();

        jLabel17.setText("jLabel17");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sunrise Bank Management System");
        setLocation(new java.awt.Point(410, 80));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        mainLabel.setToolTipText("");
        mainLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        proTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                proTabMouseEntered(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Name");

        pnameF.setEditable(false);
        pnameF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameFActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Date of Birth");

        pDob.setEditable(false);

        pGender.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Nationalty");

        pNation.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Address");

        pAccounType.setEditable(false);

        pSecQue.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Security Question");

        pMobile.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Caste");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Account No.");

        pCaste.setEditable(false);

        paccNumber.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Mobile No.");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Account Type");

        updateSaving.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_save_17px_1.png"))); // NOI18N
        updateSaving.setText("Save");
        updateSaving.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateSavingActionPerformed(evt);
            }
        });

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_edit_file_17px.png"))); // NOI18N
        update.setText("Edit");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        pAddress.setEditable(false);

        javax.swing.GroupLayout proTabLayout = new javax.swing.GroupLayout(proTab);
        proTab.setLayout(proTabLayout);
        proTabLayout.setHorizontalGroup(
            proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proTabLayout.createSequentialGroup()
                .addGroup(proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proTabLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1)
                        .addGap(79, 79, 79)
                        .addComponent(pnameF, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel8)
                        .addGap(91, 91, 91)
                        .addComponent(paccNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(proTabLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(pDob, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(jLabel10)
                        .addGap(80, 80, 80)
                        .addComponent(pAccounType, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(proTabLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(pAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(pSecQue, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(proTabLayout.createSequentialGroup()
                        .addGap(580, 580, 580)
                        .addComponent(update)
                        .addGap(37, 37, 37)
                        .addComponent(updateSaving))
                    .addGroup(proTabLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(proTabLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(67, 67, 67)
                                .addComponent(pGender, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(proTabLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(53, 53, 53)
                                .addComponent(pNation, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(156, 156, 156)
                        .addGroup(proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))
                        .addGap(101, 101, 101)
                        .addGroup(proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pCaste, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );
        proTabLayout.setVerticalGroup(
            proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(proTabLayout.createSequentialGroup()
                .addGroup(proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(proTabLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paccNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(proTabLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8))))
                        .addGap(18, 18, 18)
                        .addGroup(proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pAccounType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(proTabLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel10))))
                        .addGap(21, 21, 21)
                        .addGroup(proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(pCaste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(15, 15, 15)
                        .addGroup(proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(proTabLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9))))
                        .addGap(18, 18, 18)
                        .addGroup(proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pSecQue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(proTabLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))))
                        .addGap(52, 52, 52)
                        .addGroup(proTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update)
                            .addComponent(updateSaving)))
                    .addGroup(proTabLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel3))
                    .addGroup(proTabLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(pNation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );

        mainLabel.addTab("              Profile                ", proTab);

        depTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depTabMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                depTabMouseEntered(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Amount                             :");

        dBalance.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Credit Account                  :");

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Account_Numer                :");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setText("Available Balance             :");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setText("Name                                :");

        dSearchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_search_17px.png"))); // NOI18N
        dSearchbtn.setText("Search");
        dSearchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dSearchbtnActionPerformed(evt);
            }
        });

        dfinalResult.setEditable(false);

        totalBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_checkmark_17px.png"))); // NOI18N
        totalBtn.setText("Total");
        totalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBtnActionPerformed(evt);
            }
        });

        depositBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_deposit_17px.png"))); // NOI18N
        depositBtn.setText("Deposit");
        depositBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout depTabLayout = new javax.swing.GroupLayout(depTab);
        depTab.setLayout(depTabLayout);
        depTabLayout.setHorizontalGroup(
            depTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depTabLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel13)
                .addGap(125, 125, 125)
                .addComponent(dUser, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dSearchbtn))
            .addGroup(depTabLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel15)
                .addGap(126, 126, 126)
                .addComponent(dName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(depTabLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel12)
                .addGap(125, 125, 125)
                .addComponent(dCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(depTabLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel14)
                .addGap(126, 126, 126)
                .addComponent(dBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(depTabLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel11)
                .addGap(126, 126, 126)
                .addComponent(dAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(dfinalResult, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totalBtn))
            .addGroup(depTabLayout.createSequentialGroup()
                .addGap(672, 672, 672)
                .addComponent(depositBtn))
        );
        depTabLayout.setVerticalGroup(
            depTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depTabLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(depTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dSearchbtn)
                    .addGroup(depTabLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(depTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(dUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(depTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(dName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(depTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(dCredit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(depTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(dBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(depTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(totalBtn)
                    .addGroup(depTabLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(depTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dfinalResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addComponent(depositBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainLabel.addTab("                Deposit                    ", depTab);

        tranTab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tranTabFocusGained(evt);
            }
        });
        tranTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tranTabMouseEntered(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel20.setText("Account_Numer                :");

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel21.setText("Availabel Balance             :");

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel22.setText("Name                                :");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_search_17px.png"))); // NOI18N
        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        tFinalResult.setEditable(false);

        tBalance.setEditable(false);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_checkmark_17px.png"))); // NOI18N
        jButton8.setText("Total");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel24.setText("Debit Account                   ;");

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel25.setText("Transfer Amount              :");

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel26.setText("Credit Account To            :");

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_transfer_17px.png"))); // NOI18N
        jButton9.setText("Transfer");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tranTabLayout = new javax.swing.GroupLayout(tranTab);
        tranTab.setLayout(tranTabLayout);
        tranTabLayout.setHorizontalGroup(
            tranTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tranTabLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel24)
                .addGap(40, 40, 40)
                .addComponent(tDebit, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(tranTabLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel21)
                .addGap(40, 40, 40)
                .addComponent(tBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(tranTabLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel25)
                .addGap(42, 42, 42)
                .addComponent(tAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(tFinalResult, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8))
            .addGroup(tranTabLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel26)
                .addGap(42, 42, 42)
                .addComponent(tCreditAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(tranTabLayout.createSequentialGroup()
                .addGap(716, 716, 716)
                .addComponent(jButton9))
            .addGroup(tranTabLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(tranTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel20))
                .addGap(40, 40, 40)
                .addGroup(tranTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tName, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(tUser))
                .addGap(5, 5, 5)
                .addComponent(jButton7))
        );
        tranTabLayout.setVerticalGroup(
            tranTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tranTabLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(tranTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addGroup(tranTabLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(tranTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(tUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(tranTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(tName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(tranTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(tDebit, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(tranTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tranTabLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel21))
                    .addComponent(tBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(tranTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tranTabLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel25))
                    .addGroup(tranTabLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(tAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tranTabLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(tFinalResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton8))
                .addGap(19, 19, 19)
                .addGroup(tranTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tranTabLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel26))
                    .addComponent(tCreditAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainLabel.addTab("                     Transfer                ", tranTab);

        withTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                withTabMouseEntered(evt);
            }
        });
        withTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel23.setText("Account_Numer                :");
        withTab.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 44, -1, -1));
        withTab.add(wUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 42, 119, -1));

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel29.setText("Available Balance             :");
        withTab.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 162, -1, -1));

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel30.setText("Name                                :");
        withTab.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));
        withTab.add(wAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 202, 119, -1));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_search_17px.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        withTab.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 38, -1, -1));

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel31.setText("Amount                             :");
        withTab.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 204, -1, -1));

        wBalance.setEditable(false);
        withTab.add(wBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 160, 119, -1));

        jLabel32.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel32.setText("Debit Account                   :");
        withTab.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 122, -1, -1));

        wName.setEditable(false);
        withTab.add(wName, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 78, 119, -1));

        wDebiteAccount.setEditable(false);
        withTab.add(wDebiteAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 120, 119, -1));

        wTotal.setEditable(false);
        withTab.add(wTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(464, 239, 119, -1));

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel33.setText("Total                                 :");
        withTab.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 241, -1, -1));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_money_bag_17px.png"))); // NOI18N
        jButton13.setText("Withdraw");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        withTab.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 273, -1, 41));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_checkmark_17px.png"))); // NOI18N
        jButton10.setText("Total");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        withTab.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, -1));

        jTabbedPane2.addTab("Withdraw", withTab);

        mainLabel.addTab("Withdraw", jTabbedPane2);

        tranTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tranTableMouseEntered(evt);
            }
        });

        transactionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Acc_No", "Name", "MICR_No", "Deposited Balance", "Withdrawal Balance"
            }
        ));
        transactionsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transactionsTableMouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(transactionsTable);

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_transaction_list_50px.png"))); // NOI18N

        javax.swing.GroupLayout tranTableLayout = new javax.swing.GroupLayout(tranTable);
        tranTable.setLayout(tranTableLayout);
        tranTableLayout.setHorizontalGroup(
            tranTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tranTableLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel59)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        tranTableLayout.setVerticalGroup(
            tranTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tranTableLayout.createSequentialGroup()
                .addGroup(tranTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tranTableLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel59))
                    .addGroup(tranTableLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        jTabbedPane4.addTab("Recent Transactions", tranTable);

        mainLabel.addTab("Transactions", jTabbedPane4);

        pinTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pinTabMouseEntered(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel40.setText("Enter New Pin");

        changeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_change_17px.png"))); // NOI18N
        changeBtn.setText("Change");
        changeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBtnActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel41.setText("Confirm New Pin");

        jLabel42.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel42.setText("Enter Old Pin");

        pinLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        pinLabel.setText("User Name ");

        javax.swing.GroupLayout pinTabLayout = new javax.swing.GroupLayout(pinTab);
        pinTab.setLayout(pinTabLayout);
        pinTabLayout.setHorizontalGroup(
            pinTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinTabLayout.createSequentialGroup()
                .addGroup(pinTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pinTabLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel40)
                        .addGap(133, 133, 133)
                        .addComponent(newPin, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pinTabLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel41)
                        .addGap(118, 118, 118)
                        .addComponent(confirmPin, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pinTabLayout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(changeBtn))
                    .addGroup(pinTabLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(pinTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(pinLabel))
                        .addGap(137, 137, 137)
                        .addGroup(pinTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oldPin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pinUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(204, 204, 204))
        );
        pinTabLayout.setVerticalGroup(
            pinTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pinTabLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(pinTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pinUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pinLabel))
                .addGap(18, 18, 18)
                .addGroup(pinTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oldPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addGap(16, 16, 16)
                .addGroup(pinTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addGroup(pinTabLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(newPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(pinTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addGroup(pinTabLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(confirmPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(changeBtn)
                .addGap(104, 104, 104))
        );

        jTabbedPane6.addTab("Change Password", pinTab);

        mainLabel.addTab("Change Pin", jTabbedPane6);

        devTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                devTabMouseEntered(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(23);
        jTextArea1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("My name is sunil bohara i'm from Nepal i love coding and \nprogramming languages i'm not a professional programmer but \nstill learning new stuff's day by day currently i'm working \non java desktop applications \n");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel28.setText("Sunil Bohara");

        sqlLoading.setMinimum(100);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_mysql_48px.png"))); // NOI18N

        javaLoading.setMinimum(50);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_java_48px.png"))); // NOI18N

        javaScriptLoading.setMinimum(50);

        JavaSciprt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_react_native_48px_1.png"))); // NOI18N

        javax.swing.GroupLayout devTabLayout = new javax.swing.GroupLayout(devTab);
        devTab.setLayout(devTabLayout);
        devTabLayout.setHorizontalGroup(
            devTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(devTabLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(devTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(devTabLayout.createSequentialGroup()
                        .addGroup(devTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sqlLoading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(devTabLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel27)))
                        .addGroup(devTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(devTabLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(javaLoading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(devTabLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(JavaSciprt)))
                        .addGroup(devTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(devTabLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(javaScriptLoading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, devTabLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel43)
                                .addGap(46, 46, 46))))))
        );
        devTabLayout.setVerticalGroup(
            devTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(devTabLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(devTabLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(devTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(devTabLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sqlLoading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(devTabLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(JavaSciprt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(javaLoading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(devTabLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(javaScriptLoading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane7.addTab("Devloper", devTab);

        mainLabel.addTab("Devloper", jTabbedPane7);

        regTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regTabMouseEntered(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel45.setText("Mobile No.");

        jLabel46.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel46.setText("Account Type");

        jLabel47.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel47.setText("Address");

        jLabel48.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel48.setText("Security Question");

        jLabel49.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel49.setText("Nationalty");

        jLabel50.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel50.setText("Caste");

        jLabel51.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel51.setText("Name");

        jLabel53.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel53.setText("Gender");

        jLabel54.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel54.setText("Date of Birth");

        jLabel56.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel56.setText("MICR_No");

        jLabel57.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_account_40px.png"))); // NOI18N
        jLabel57.setText("New Account");

        jLabel58.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel58.setText("Balance");

        dbMainBalance.setBackground(new java.awt.Color(255, 255, 255));
        dbMainBalance.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        dbMainBalance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dbMainBalanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dbMainBalanceMouseExited(evt);
            }
        });
        dbMainBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbMainBalanceActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_registration_17px.png"))); // NOI18N
        jButton16.setText("Create");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel61.setText("Answer");

        dbSecuq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What time of the day were you born ?(hh:mm)", "What is the middle name of your oldest child ?", "What was your dream job as a child ?", "Who was your childhood hero ?", "What was your childhood nickname ?", "What is the color of your eyes ?", "What is your favorite sport ?", "what is your favorite color ?", "what is your work address ?", " " }));

        jLabel55.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel55.setText("Pin No.");

        javax.swing.GroupLayout regTabLayout = new javax.swing.GroupLayout(regTab);
        regTab.setLayout(regTabLayout);
        regTabLayout.setHorizontalGroup(
            regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(regTabLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regTabLayout.createSequentialGroup()
                        .addComponent(jLabel51)
                        .addGap(79, 79, 79)
                        .addComponent(dbName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(regTabLayout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addGap(36, 36, 36)
                        .addComponent(dbdob, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(regTabLayout.createSequentialGroup()
                        .addComponent(jLabel49)
                        .addGap(53, 53, 53)
                        .addComponent(dbNation, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(regTabLayout.createSequentialGroup()
                        .addComponent(jLabel53)
                        .addGap(67, 67, 67)
                        .addComponent(dbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(regTabLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(63, 63, 63)
                        .addComponent(dbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regTabLayout.createSequentialGroup()
                        .addComponent(jLabel55)
                        .addGap(122, 122, 122)
                        .addComponent(dbPin, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel56)
                    .addGroup(regTabLayout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(80, 80, 80)
                        .addComponent(dbaccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(regTabLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(130, 130, 130)
                        .addComponent(dbCaste, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(regTabLayout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addGap(101, 101, 101)
                        .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dbmicr, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dbMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regTabLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regTabLayout.createSequentialGroup()
                        .addComponent(jLabel57)
                        .addGap(314, 314, 314))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regTabLayout.createSequentialGroup()
                        .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel48)
                            .addComponent(jLabel61))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(regTabLayout.createSequentialGroup()
                                .addComponent(dbAnswer)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel58)
                                .addGap(29, 29, 29)
                                .addComponent(dbMainBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(dbSecuq, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        regTabLayout.setVerticalGroup(
            regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57)
                .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regTabLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(regTabLayout.createSequentialGroup()
                                .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(regTabLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel51)))
                                .addGap(18, 18, 18)
                                .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dbdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(regTabLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel54)))
                                .addGap(18, 18, 18)
                                .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dbNation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(regTabLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel49)))
                                .addGap(18, 18, 18)
                                .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(regTabLayout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(jLabel53))))
                            .addGroup(regTabLayout.createSequentialGroup()
                                .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(regTabLayout.createSequentialGroup()
                                        .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dbaccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(regTabLayout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(jLabel46)))
                                        .addGap(18, 18, 18)
                                        .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dbCaste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(regTabLayout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(jLabel50)))
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabel45))
                                    .addComponent(dbMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel56)
                                    .addComponent(dbmicr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(regTabLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(regTabLayout.createSequentialGroup()
                                        .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dbAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(regTabLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(jLabel47))
                                            .addComponent(jLabel55))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeparator1))
                                    .addGroup(regTabLayout.createSequentialGroup()
                                        .addComponent(dbPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)))
                                .addGap(204, 204, 204))
                            .addGroup(regTabLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dbSecuq))
                                .addGap(7, 7, 7)
                                .addGroup(regTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dbAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel61)
                                    .addComponent(dbMainBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel58)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton16)
                        .addGap(177, 177, 177))))
        );

        mainLabel.addTab("Register Acc", regTab);

        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerTableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerTableMouseExited(evt);
            }
        });

        customerListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "DOB", "Acc_Type", "Gender", "Mobile No", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customerListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerListTableMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(customerListTable);

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_customer_50px.png"))); // NOI18N

        javax.swing.GroupLayout customerTableLayout = new javax.swing.GroupLayout(customerTable);
        customerTable.setLayout(customerTableLayout);
        customerTableLayout.setHorizontalGroup(
            customerTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customerTableLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        customerTableLayout.setVerticalGroup(
            customerTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(customerTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44))
        );

        jTabbedPane3.addTab("Customers", customerTable);

        mainLabel.addTab("Customer List", jTabbedPane3);

        balTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                balTabMouseEntered(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel34.setText("Name                                :");

        modBalance.setEditable(false);
        modBalance.setText("0.00");

        jTextField28.setEditable(false);
        jTextField28.setText("No");

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_search_17px.png"))); // NOI18N
        jButton11.setText("Search");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel35.setText("Nomination Registered      :");

        jLabel36.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel36.setText("MOD Balance                    :");

        viewBalance.setEditable(false);

        jLabel37.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel37.setText("Account No                       :");

        jLabel38.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel38.setText("User Account_Numer        :");

        bName.setEditable(false);

        bAccountNumber.setEditable(false);

        jLabel39.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel39.setText("Available Balance             :");

        javax.swing.GroupLayout balTabLayout = new javax.swing.GroupLayout(balTab);
        balTab.setLayout(balTabLayout);
        balTabLayout.setHorizontalGroup(
            balTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(balTabLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addGroup(balTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(balTabLayout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(127, 127, 127)
                        .addComponent(bUser, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11))
                    .addGroup(balTabLayout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(128, 128, 128)
                        .addComponent(bName, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(balTabLayout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(128, 128, 128)
                        .addComponent(bAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(balTabLayout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(128, 128, 128)
                        .addComponent(viewBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(balTabLayout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(125, 125, 125)
                        .addComponent(modBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(balTabLayout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(125, 125, 125)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        balTabLayout.setVerticalGroup(
            balTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(balTabLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(balTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(balTabLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel38))
                    .addGroup(balTabLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(bUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton11))
                .addGap(7, 7, 7)
                .addGroup(balTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(balTabLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel34))
                    .addComponent(bName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(balTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(balTabLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel37))
                    .addComponent(bAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(balTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(balTabLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel39))
                    .addComponent(viewBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(balTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(balTabLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel36))
                    .addComponent(modBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(balTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(balTabLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel35))
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane5.addTab("Balance", balTab);

        mainLabel.addTab("View Balance", jTabbedPane5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 812, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 420, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 95, 860, 450));

        userLabel.setText("Account_Numer     :");
        getContentPane().add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, 20));
        getContentPane().add(searchNameTextF, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 128, -1));

        searchingByName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_eye_17px.png"))); // NOI18N
        searchingByName.setText("See");
        searchingByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchingByNameActionPerformed(evt);
            }
        });
        getContentPane().add(searchingByName, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));
        getContentPane().add(dateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 128, -1));

        dateLabel.setText("Date                          :");
        getContentPane().add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        sunriseBanking.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        sunriseBanking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BankManageMentSystem/Icons/icons8_bank_building_60px.png"))); // NOI18N
        sunriseBanking.setText("Sunrise Banking");
        getContentPane().add(sunriseBanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    public void transactions_Table() {
        try {
            DefaultTableModel defaultTableModel = (DefaultTableModel) transactionsTable.getModel();
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement transStatement = connection.prepareStatement("select * from transactions");
            ResultSet resultSet = transStatement.executeQuery();
            defaultTableModel.setRowCount(0);
            while (resultSet.next()) {
                String[] tranData = {resultSet.getString("acc_no"), resultSet.getString("name"), resultSet.getString("micr_no"), resultSet.getString("depo_balance"), resultSet.getString("with_balance")};
                defaultTableModel.fireTableDataChanged();
                defaultTableModel.addRow(tranData);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public void focusAndBlankString() {
        searchNameTextF.setText("");
        paccNumber.setText("");
        pnameF.setText("");
        pDob.setText("");
        pAccounType.setText("");
        pNation.setText("");
        pCaste.setText("");
        pGender.setText("");
        pMobile.setText("");
        pAddress.setText("");
        pSecQue.setText("");
        dateTextField.setText("");
        paccNumber.setEditable(false);
        pnameF.setEditable(false);
        pDob.setEditable(false);
        pAccounType.setEditable(false);
        pNation.setEditable(false);
        pCaste.setEditable(false);
        pGender.setEditable(false);
        pMobile.setEditable(false);
        pAddress.setEditable(false);
        pSecQue.setEditable(false);
    }

    public long transferMinusAmount(String main_balance) {
        long answer = Long.parseLong(main_balance);

        String tm = dAmount.getText();
        long atm = Long.parseLong(tm);

        long finalanswer = answer - atm;

        return finalanswer;
    }
    private void searchingByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchingByNameActionPerformed
        try {
            String accountnum = searchNameTextF.getText();
            int parseaccountnum = Integer.parseInt(accountnum);
            if (searchNameTextF.getText().length() > 0) {
                Date d = new Date();
                int date = d.getDate();
                int month = d.getMonth();
                int year = d.getYear();
                String settingdate = String.valueOf(date);
                String settingmonth = String.valueOf(month);
                String settingyear = String.valueOf(year);
                dateTextField.setText("2" + year + " : " + month + " : " + date);
            }
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement("select acc_no,name,DOB,acc_type,nationality,"
                    + "caste,gender,mobile_no,address,security_q from bank_demo where acc_no ='" + parseaccountnum + "'");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                pnameF.setText(resultSet.getString("name"));
                paccNumber.setText(resultSet.getString("acc_no"));
                pDob.setText(resultSet.getString("DOB"));
                pAccounType.setText(resultSet.getString("acc_type"));
                pNation.setText(resultSet.getString("nationality"));
                pCaste.setText(resultSet.getString("caste"));
                pGender.setText(resultSet.getString("gender"));
                pMobile.setText(resultSet.getString("mobile_no"));
                pAddress.setText(resultSet.getString("address"));
                pSecQue.setText(resultSet.getString("security_q"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_searchingByNameActionPerformed

    private void balTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balTabMouseEntered
        focusAndBlankString();
        settingblankstringinDepo("depo");
        settingblankstringinDepo("with");
        settingblankstringinDepo("transfer");
    }//GEN-LAST:event_balTabMouseEntered

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            String username = bUser.getText();
            int parseusername = Integer.parseInt(username);
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement("select name,acc_no,main_balance from bank_demo where acc_no ='" + parseusername + "'");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                bName.setText(resultSet.getString("name"));
                bAccountNumber.setText(resultSet.getString("acc_no"));
                viewBalance.setText(resultSet.getString("main_balance"));
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void customerTableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseExited
        bankAllList();
    }//GEN-LAST:event_customerTableMouseExited

    private void customerTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseEntered
        focusAndBlankString();
        settingblankstringinDepo("balance");
        settingblankstringinDepo("depo");
        settingblankstringinDepo("with");
        settingblankstringinDepo("transfer");
    }//GEN-LAST:event_customerTableMouseEntered

    private void regTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regTabMouseEntered
        focusAndBlankString();
        settingblankstringinDepo("balance");
        settingblankstringinDepo("depo");
        settingblankstringinDepo("with");
        settingblankstringinDepo("transfer");
    }//GEN-LAST:event_regTabMouseEntered

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        String name = dbName.getText();
        String DOB = dbdob.getText();
        String acc_type = dbaccountType.getText();
        String nationality = dbNation.getText();
        String caste = dbCaste.getText();
        String micr_no = dbmicr.getText();
        int micr = Integer.parseInt(micr_no);
        String gender = dbGender.getText();
        String mobile = dbMobile.getText();
        int mob = Integer.parseInt(mobile);
        String address = dbAddress.getText();
        String security = dbSecuq.getSelectedItem().toString();
        String answer = dbAnswer.getText();
        String main_balance = dbMainBalance.getText();
        int main_b = Integer.parseInt(main_balance);
        String pinNo = dbPin.getText();
        int pinNumber = Integer.parseInt(pinNo);
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement("insert into bank_demo (name,DOB,acc_type,nationality,caste,micr_no,gender,mobile_no,address,security_q,answer,main_balance,pin_no) values('" + name + "','" + DOB + "','" + acc_type + "','" + nationality + "','" + caste + "','" + micr + "','" + gender + "','" + mob + "','" + address + "','" + security + "','" + answer + "','" + main_b + "','" + pinNumber + "')");
            statement.executeUpdate();
            bankAllList();
            PreparedStatement accStatement = connection.prepareStatement("select acc_no from bank_demo where name ='"+name+"'");
            ResultSet resultSet = accStatement.executeQuery();
            while(resultSet.next()) {
                JOptionPane.showMessageDialog(this, "Account Number is :"+resultSet.getString("acc_no"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        dbName.setText("");
        dbdob.setText("");
        dbaccountType.setText("");
        dbNation.setText("");
        dbCaste.setText("");
        dbmicr.setText("");
        dbGender.setText("");
        dbMobile.setText("");
        dbAddress.setText("");
        dbPin.setText("");
        dbMainBalance.setText("");
        dbName.requestFocus();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void dbMainBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbMainBalanceActionPerformed

    }//GEN-LAST:event_dbMainBalanceActionPerformed

    private void dbMainBalanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMainBalanceMouseExited

    }//GEN-LAST:event_dbMainBalanceMouseExited

    private void dbMainBalanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMainBalanceMouseEntered

    }//GEN-LAST:event_dbMainBalanceMouseEntered

    private void devTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devTabMouseEntered
        focusAndBlankString();
        settingblankstringinDepo("balance");
        settingblankstringinDepo("depo");
        settingblankstringinDepo("with");
        settingblankstringinDepo("transfer");
    }//GEN-LAST:event_devTabMouseEntered

    private void pinTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pinTabMouseEntered
        focusAndBlankString();
        settingblankstringinDepo("balance");
        settingblankstringinDepo("depo");
        settingblankstringinDepo("with");
        settingblankstringinDepo("transfer");
    }//GEN-LAST:event_pinTabMouseEntered

    private void changeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBtnActionPerformed
        try {
            String username = pinUser.getText();

            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement("select name from bank_demo where name ='" + username + "'");
            ResultSet resultSet = statement.executeQuery();
            if (oldPin.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter your old pin number");
            } else if (newPin.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Enter your new pin number");
            } else if (confirmPin.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Please Confirm pin number");
            } else {
                while (resultSet.next()) {
                    String pin = confirmPin.getText();
                    int confirmpin = Integer.parseInt(pin);
                    String sqlName = resultSet.getString("name");
                    if (username.equals(sqlName)) {
                        PreparedStatement updatestStatement = connection.prepareStatement("update bank_demo set pin_no = '" + confirmpin + "' where name = '" + username + "'");
                        updatestStatement.executeUpdate();
                        pinUser.requestFocus();
                        JOptionPane.showMessageDialog(this, "Pin_no has been updated");
                    }
                }
                JOptionPane.showMessageDialog(this, "Username not found");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_changeBtnActionPerformed

    private void tranTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tranTableMouseEntered
        focusAndBlankString();
        settingblankstringinDepo("balance");
        settingblankstringinDepo("depo");
        settingblankstringinDepo("with");
        settingblankstringinDepo("transfer");
    }//GEN-LAST:event_tranTableMouseEntered

    private void withTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withTabMouseEntered
        focusAndBlankString();
        settingblankstringinDepo("balance");
        settingblankstringinDepo("depo");
        settingblankstringinDepo("transfer");
    }//GEN-LAST:event_withTabMouseEntered

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String amo = wAmount.getText();
        long longamount = Long.parseLong(amo);

        long answer = this.withdrawMainBalance - longamount;

        String finalAnswer = String.valueOf(answer);
        wTotal.setText(finalAnswer);

        int depfinAns = Integer.parseInt(finalAnswer);
        this.withtotalAnswer = depfinAns;
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        try {
            String userN = wUser.getText();
            int parseusername = Integer.parseInt(userN);
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);

            String withdrawuser = wUser.getText();
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement PreparedStatement = connection.prepareStatement("select acc_no,name,micr_no from bank_demo where acc_no = '" + parseusername + "'");
            ResultSet resultSet = PreparedStatement.executeQuery();
            while (resultSet.next()) {
                String accno = resultSet.getString("acc_no");
                String name = resultSet.getString("name");
                String micrno = resultSet.getString("micr_no");

                String depo_amount = wAmount.getText();
                int finalwith_amount = Integer.parseInt(depo_amount);

                PreparedStatement transactionStatement = connection.prepareStatement("insert into transactions (acc_no,name,micr_no,with_balance) values ('" + accno + "','" + name + "','" + micrno + "','" + finalwith_amount + "')");
                transactionStatement.executeUpdate();
            }
            PreparedStatement statement = connection.prepareStatement("update bank_demo set main_balance = '" + withtotalAnswer + "' where acc_no ='" + withdrawuser + "'");
            statement.executeUpdate();
            transactions_Table();
            JOptionPane.showMessageDialog(this, "======Withdrawing=====");
            wUser.setText("");
            wName.setText("");
            wDebiteAccount.setText("");
            wBalance.setText("");
            wAmount.setText("");
            wTotal.setText("");
            wUser.requestFocus();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try {
            String username = wUser.getText();
            int parseusername = Integer.parseInt(username);

            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement("select name,acc_no,main_balance from bank_demo where acc_no ='" + parseusername + "'");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                wName.setText(resultSet.getString("name"));
                wDebiteAccount.setText(resultSet.getString("acc_no"));
                wBalance.setText(resultSet.getString("main_balance"));
                String b = wBalance.getText();
                this.withdrawMainBalance = Long.parseLong(b);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void tranTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tranTabMouseEntered
        focusAndBlankString();
        settingblankstringinDepo("depo");
        settingblankstringinDepo("with");
        settingblankstringinDepo("balance");
    }//GEN-LAST:event_tranTabMouseEntered

    public void settingblankstringinDepo(String panelname) {
        if(panelname.equals("depo")) {
            dUser.setText("");
            dName.setText("");
            dCredit.setText("");
            dBalance.setText("");
            dAmount.setText("");
            dfinalResult.setText("");
        } else if (panelname.equals("with")) {
            wUser.setText("");
            wName.setText("");
            wDebiteAccount.setText("");
            wBalance.setText("");
            wAmount.setText("");
            wTotal.setText("");
        } else if (panelname.equals("balance")) {
            bUser.setText("");
            bName.setText("");
            bAccountNumber.setText("");
            viewBalance.setText("");
        } else if (panelname.equals("transfer")) {
            tUser.setText("");
            tName.setText("");
            tDebit.setText("");
            tCreditAccount.setText("");
            tAmount.setText("");
            tCreditAccount.setText("");
            tFinalResult.setText("");
        }
    }
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            int total = this.transferfinalAnswer;
            String username = tUser.getText();
            int parseusername = Integer.parseInt(username);
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement("update bank_demo set main_balance = '" + transferfinalAnswer + "' where acc_no ='" + parseusername + "'");
            statement.executeUpdate();

            String addingbalanceaccount = tCreditAccount.getText();
            int accnumber = Integer.parseInt(addingbalanceaccount);
            PreparedStatement statement1 = connection.prepareStatement("select main_balance from bank_demo where acc_no ='" + accnumber + "'");
            ResultSet resultSet = statement1.executeQuery();
            while (resultSet.next()) {
                String transferAmount = tAmount.getText();
                int parsetransferAmount = Integer.parseInt(transferAmount);
                String creditAccount = resultSet.getString("main_balance");
                int parseCreditAccount = Integer.parseInt(creditAccount);
                int finalresult = parsetransferAmount + parseCreditAccount;
                PreparedStatement statement2 = connection.prepareStatement("update bank_demo set main_balance = '" + finalresult + "' where acc_no ='" + accnumber + "'");
                statement2.executeUpdate();
            }

            JOptionPane.showMessageDialog(this, "Money has been deposited");
            tUser.setText("");
            tName.setText("");
            tDebit.setText("");
            tBalance.setText("");
            tAmount.setText("");
            tCreditAccount.setText("");
            tUser.requestFocus();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String amo = tAmount.getText();
        long longamount = Long.parseLong(amo);

        long answer = this.transfermainBalance - longamount;

        String finalAnswer = String.valueOf(answer);
        tFinalResult.setText(finalAnswer);

        int depfinAns = Integer.parseInt(finalAnswer);
        this.transferfinalAnswer = depfinAns;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            String username = tUser.getText();
            int parseusername = Integer.parseInt(username);

            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement("select name,acc_no,main_balance from bank_demo where acc_no ='" + parseusername + "'");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                tName.setText(resultSet.getString("name"));
                tDebit.setText(resultSet.getString("acc_no"));
                tBalance.setText(resultSet.getString("main_balance"));
                String b = tBalance.getText();
                this.transfermainBalance = Long.parseLong(b);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void depTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depTabMouseEntered
        focusAndBlankString();
        settingblankstringinDepo("balance");
        settingblankstringinDepo("with");
        settingblankstringinDepo("transfer");
    }//GEN-LAST:event_depTabMouseEntered

    private void depTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depTabMouseClicked

    }//GEN-LAST:event_depTabMouseClicked

    private void depositBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositBtnActionPerformed

        try {
            int total = this.totalAnswer;
            String username = dUser.getText();
            int parseusername = Integer.parseInt(username);
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement PreparedStatement = connection.prepareStatement("select acc_no,name,micr_no from bank_demo where acc_no = '" + parseusername + "'");
            ResultSet resultSet = PreparedStatement.executeQuery();
            while (resultSet.next()) {
                String accno = resultSet.getString("acc_no");
                String name = resultSet.getString("name");
                String micrno = resultSet.getString("micr_no");

                String depo_amount = dAmount.getText();
                int finaldepo_amount = Integer.parseInt(depo_amount);

                PreparedStatement transactionStatement = connection.prepareStatement("insert into transactions (acc_no,name,micr_no,depo_balance) values ('" + accno + "','" + name + "','" + micrno + "','" + finaldepo_amount + "')");
                transactionStatement.executeUpdate();
            }
            PreparedStatement statement = connection.prepareStatement("update bank_demo set main_balance = '" + totalAnswer + "' where acc_no ='" + parseusername + "'");
            statement.executeUpdate();
            transactions_Table();
            JOptionPane.showMessageDialog(this, "Money has been deposited");
            dUser.setText("");
            dName.setText("");
            dCredit.setText("");
            dBalance.setText("");
            dAmount.setText("");
            dfinalResult.setText("");
            dUser.requestFocus();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_depositBtnActionPerformed

    private void totalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBtnActionPerformed
        String amo = dAmount.getText();
        long longamount = Long.parseLong(amo);

        long answer = this.mainBalance + longamount;

        String finalAnswer = String.valueOf(answer);
        dfinalResult.setText(finalAnswer);

        int depfinAns = Integer.parseInt(finalAnswer);
        this.totalAnswer = depfinAns;
    }//GEN-LAST:event_totalBtnActionPerformed

    private void dSearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dSearchbtnActionPerformed
        try {
            String username = dUser.getText();
            int parseusername = Integer.parseInt(username);

            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement("select name,acc_no,main_balance from bank_demo where acc_no ='" + parseusername + "'");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                dName.setText(resultSet.getString("name"));
                dCredit.setText(resultSet.getString("acc_no"));
                dBalance.setText(resultSet.getString("main_balance"));
                String b = dBalance.getText();
                this.mainBalance = Long.parseLong(b);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_dSearchbtnActionPerformed

    private void proTabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTabMouseEntered
        searchNameTextF.setVisible(true);
        dateTextField.setVisible(true);
        userLabel.setVisible(true);
        dateLabel.setVisible(true);
        searchingByName.setVisible(true);
    }//GEN-LAST:event_proTabMouseEntered

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        if (pnameF.getText().length() > 0 && paccNumber.getText().length() > 0 && pDob.getText().length() > 0 && pAccounType.getText().length() > 0 && pNation.getText().length() > 0 && pCaste.getText().length() > 0 && pGender.getText().length() > 0 && pMobile.getText().length() > 0 && pAddress.getText().length() > 0 && pSecQue.getText().length() > 0) {
            pnameF.setEditable(true);
            pDob.setEditable(true);
            pAccounType.setEditable(true);
            pNation.setEditable(true);
            pCaste.setEditable(true);
            pGender.setEditable(true);
            pMobile.setEditable(true);
            pAddress.setEditable(true);
            pSecQue.setEditable(true);
        } else {
            JOptionPane.showMessageDialog(this, "Fields are empty");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void updateSavingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateSavingActionPerformed

        try {
            if (pnameF.isEditable()&& pDob.isEditable()
                    && pAccounType.isEditable() && pNation.isEditable() && pCaste.isEditable() &&
                    pGender.isEditable() && pMobile.isEditable() && pAddress.isEditable() && pSecQue.isEditable()) {
                int parseaccountnum = Integer.parseInt(searchNameTextF.getText());
                String localaccnum = paccNumber.getText();
                int accn = Integer.parseInt(localaccnum);
                String localmobile = paccNumber.getText();
                int mobile = Integer.parseInt(paccNumber.getText());
                String username = searchNameTextF.getText();
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
                PreparedStatement statement = connection.prepareStatement("update bank_demo set acc_no ='" + accn + "',name = '" + pnameF.getText() + "',DOB = '" + pDob.getText() + "',acc_type = '"
                    + pAccounType.getText() + "',nationality = '" + pNation.getText() + "',caste = '"
                    + pCaste.getText() + "',gender= '" + pGender.getText() + "',mobile_no = '" + mobile
                    + "',address = '" + pAddress.getText() + "',security_q = '" + pSecQue.getText()
                    + "'where acc_no ='" + parseaccountnum + "'");
                statement.executeUpdate();
                bankAllList();
                searchNameTextF.setText("");
                paccNumber.setText("");
                pnameF.setText("");
                pDob.setText("");
                pAccounType.setText("");
                pNation.setText("");
                pCaste.setText("");
                pGender.setText("");
                pMobile.setText("");
                pAddress.setText("");
                pSecQue.setText("");
                dateTextField.setText("");
                searchNameTextF.requestFocus();
                paccNumber.setEditable(false);
                pnameF.setEditable(false);
                pDob.setEditable(false);
                pAccounType.setEditable(false);
                pNation.setEditable(false);
                pCaste.setEditable(false);
                pGender.setEditable(false);
                pMobile.setEditable(false);
                pAddress.setEditable(false);
                pSecQue.setEditable(false);
                JOptionPane.showMessageDialog(this, "Account has been updated.");
            } else {
                JOptionPane.showMessageDialog(this, "Fields are empty");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_updateSavingActionPerformed

    private void tranTabFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tranTabFocusGained

    }//GEN-LAST:event_tranTabFocusGained

    private void customerListTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerListTableMouseEntered
        settingblankstringinDepo("balance");
        settingblankstringinDepo("depo");
        settingblankstringinDepo("with");
        settingblankstringinDepo("transfer");
    }//GEN-LAST:event_customerListTableMouseEntered

    private void transactionsTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactionsTableMouseEntered
        settingblankstringinDepo("balance");
        settingblankstringinDepo("depo");
        settingblankstringinDepo("with");
        settingblankstringinDepo("transfer");
    }//GEN-LAST:event_transactionsTableMouseEntered

    private void pnameFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameFActionPerformed

    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
//            UIManager.setLookAndFeel("com.pagosoft.plaf.PgsLookAndFeel");


//            UIManager.setLookAndFeel("com.jgoodies.looks.plastic.PlasticLookAndFeel");
//            UIManager.setLookAndFeel("UpperEssential.UpperEssentialLookAndFeel");
//            UIManager.setLookAndFeel("com.jgoodies.looks.windows.PlasticLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bank.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bank().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JavaSciprt;
    private javax.swing.JTextField bAccountNumber;
    private javax.swing.JTextField bName;
    private javax.swing.JTextField bUser;
    private javax.swing.JPanel balTab;
    private javax.swing.JButton changeBtn;
    private javax.swing.JPasswordField confirmPin;
    private javax.swing.JTable customerListTable;
    private javax.swing.JPanel customerTable;
    private javax.swing.JTextField dAmount;
    private javax.swing.JTextField dBalance;
    private javax.swing.JLabel dCredit;
    private javax.swing.JLabel dName;
    private javax.swing.JButton dSearchbtn;
    private javax.swing.JTextField dUser;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JTextField dbAddress;
    private javax.swing.JTextField dbAnswer;
    private javax.swing.JTextField dbCaste;
    private javax.swing.JTextField dbGender;
    private javax.swing.JTextField dbMainBalance;
    private javax.swing.JTextField dbMobile;
    private javax.swing.JTextField dbName;
    private javax.swing.JTextField dbNation;
    private javax.swing.JTextField dbPin;
    private javax.swing.JComboBox<String> dbSecuq;
    private javax.swing.JTextField dbaccountType;
    private javax.swing.JTextField dbdob;
    private javax.swing.JTextField dbmicr;
    private javax.swing.JPanel depTab;
    private javax.swing.JButton depositBtn;
    private javax.swing.JPanel devTab;
    private javax.swing.JTextField dfinalResult;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JProgressBar javaLoading;
    private javax.swing.JProgressBar javaScriptLoading;
    private javax.swing.JTabbedPane mainLabel;
    private javax.swing.JTextField modBalance;
    private javax.swing.JPasswordField newPin;
    private javax.swing.JPasswordField oldPin;
    private javax.swing.JTextField pAccounType;
    private javax.swing.JTextField pAddress;
    private javax.swing.JTextField pCaste;
    private javax.swing.JTextField pDob;
    private javax.swing.JTextField pGender;
    private javax.swing.JTextField pMobile;
    private javax.swing.JTextField pNation;
    private javax.swing.JTextField pSecQue;
    private javax.swing.JTextField paccNumber;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JLabel pinLabel;
    private javax.swing.JPanel pinTab;
    private javax.swing.JTextField pinUser;
    private javax.swing.JTextField pnameF;
    private javax.swing.JPanel proTab;
    private javax.swing.JPanel regTab;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchNameTextF;
    private javax.swing.JButton searchingByName;
    private javax.swing.JProgressBar sqlLoading;
    private javax.swing.JLabel sunriseBanking;
    private javax.swing.JTextField tAmount;
    private javax.swing.JTextField tBalance;
    private javax.swing.JTextField tCreditAccount;
    private javax.swing.JLabel tDebit;
    private javax.swing.JTextField tFinalResult;
    private javax.swing.JLabel tName;
    private javax.swing.JTextField tUser;
    private javax.swing.JButton totalBtn;
    private javax.swing.JPanel tranTab;
    private javax.swing.JPanel tranTable;
    private javax.swing.JTable transactionsTable;
    private javax.swing.JButton update;
    private javax.swing.JButton updateSaving;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField viewBalance;
    private javax.swing.JTextField wAmount;
    private javax.swing.JTextField wBalance;
    private javax.swing.JTextField wDebiteAccount;
    private javax.swing.JTextField wName;
    private javax.swing.JTextField wTotal;
    private javax.swing.JTextField wUser;
    private javax.swing.JPanel withTab;
    // End of variables declaration//GEN-END:variables
}
