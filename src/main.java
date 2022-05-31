//CSC300-01
//Final Assignment
//Justin Ruiz

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class main 
{
	static JFrame mainWindow = new JFrame();
	
	static JPanel mainPanel = new JPanel();
	static JPanel upperPanel = new JPanel();
	static JPanel panelScreenInit = new JPanel();
	static JPanel lowerPanel = new JPanel();
	static JPanel panelScreenRegister = new JPanel();
	static JPanel panelScreenList = new JPanel();
	static JPanel panelScreenUser = new JPanel();
	static JPanel optionsPanel = new JPanel();
	static JPanel changePicPanel = new JPanel();
	static JPanel friendListPanel = new JPanel();
	static JPanel radioPanel = new JPanel();
	
	static JButton loginBtn = new JButton("Login >");
	static JButton registerBtn = new JButton("Register New User");
	static JButton regBackBtn = new JButton("< back");
	static JButton regSubmitBtn = new JButton("Submit");
	static JButton exitBtn = new JButton("EXIT");
	static JButton showUsersBtn = new JButton("SHOW USERS");
	static JButton hideUsersBtn = new JButton("HIDE USERS");
	static JButton postUpdateBtn = new JButton("post");
	static JButton addFriendBtn = new JButton("Add");
	static JButton followPageBtn = new JButton("Follow");
	static JButton logoutBtn = new JButton("LOGOUT");
	static JButton uploadPicBtn = new JButton("Upload");
	
	static JTextArea updatePostTxtArea = new JTextArea();
	static JTextArea feedTxtArea = new JTextArea();
	
	static JTextField usernameTxtField = new JTextField();
	static JTextField passwordTxtField = new JTextField();
	static JTextField pageNameTxtField = new JTextField();
	static JTextField friendNameTxtField = new JTextField();
	static JTextField fNameTxtField = new JTextField();
	static JTextField lNameTxtField = new JTextField();
	static JTextField uNameTxtField = new JTextField();
	static JTextField dobTxtField = new JTextField();
	static JTextField pwTxtField = new JTextField();
	static JTextField picDirUpTxtField = new JTextField();
	
	static JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	
	static JScrollPane scrollpaneFeed = new JScrollPane();
	
	static JLabel upperPanelLabel = new JLabel("MyOSN");
	static JLabel usernameLabel = new JLabel("Username:");
	static JLabel passwordLabel = new JLabel("Password:");
	static JLabel loginErrorLabel = new JLabel("Invalid Username/Password");
	static JLabel pwLabel = new JLabel("Password:");
	static JLabel dobLabel = new JLabel("DOB:");
	static JLabel lNameLabel = new JLabel("Last Name:");
	static JLabel fNameLabel = new JLabel("First Name:");
	static JLabel uNameLabel = new JLabel("Username:");
	static JLabel registerErrorLabel = new JLabel("ERROR");
	static JLabel labelUserTitle = new JLabel("Username");
	static JLabel labelPWTitle = new JLabel("Password");
	static JLabel lblUsername_0 = new JLabel("N/A");
	static JLabel lblUsername_1 = new JLabel("N/A");
	static JLabel lblUsername_2 = new JLabel("N/A");
	static JLabel lblUsername_3 = new JLabel("N/A");
	static JLabel lblUsername_4 = new JLabel("N/A");
	static JLabel lblUsername_5 = new JLabel("N/A");
	static JLabel lblUsername_6 = new JLabel("N/A");
	static JLabel lblUsername_7 = new JLabel("N/A");
	static JLabel lblUsername_8 = new JLabel("N/A");
	static JLabel lblUsername_9 = new JLabel("N/A");
	static JLabel lblUsername_10 = new JLabel("N/A");
	static JLabel lblUsername_11 = new JLabel("N/A");
	static JLabel lblUsername_12 = new JLabel("N/A");
	static JLabel lblUsername_13 = new JLabel("N/A");
	static JLabel lblUsername_14 = new JLabel("N/A");
	static JLabel lblUsername_15 = new JLabel("N/A");
	static JLabel lblUsername_16 = new JLabel("N/A");
	static JLabel lblUsername_17 = new JLabel("N/A");
	static JLabel lblUsername_18 = new JLabel("N/A");
	static JLabel lblUsername_19 = new JLabel("N/A");
	static JLabel lblPassword_0 = new JLabel("N/A");
	static JLabel lblPassword_1 = new JLabel("N/A");
	static JLabel lblPassword_2 = new JLabel("N/A");
	static JLabel lblPassword_3 = new JLabel("N/A");
	static JLabel lblPassword_4 = new JLabel("N/A");
	static JLabel lblPassword_5 = new JLabel("N/A");
	static JLabel lblPassword_6 = new JLabel("N/A");
	static JLabel lblPassword_7 = new JLabel("N/A");
	static JLabel lblPassword_8 = new JLabel("N/A");
	static JLabel lblPassword_9 = new JLabel("N/A");
	static JLabel lblPassword_10 = new JLabel("N/A");
	static JLabel lblPassword_11 = new JLabel("N/A");
	static JLabel lblPassword_12 = new JLabel("N/A");
	static JLabel lblPassword_13 = new JLabel("N/A");
	static JLabel lblPassword_14 = new JLabel("N/A");
	static JLabel lblPassword_15 = new JLabel("N/A");
	static JLabel lblPassword_16 = new JLabel("N/A");
	static JLabel lblPassword_17 = new JLabel("N/A");
	static JLabel lblPassword_18 = new JLabel("N/A");
	static JLabel lblPassword_19 = new JLabel("N/A");
	static JLabel friendAddErrorLbl = new JLabel("FRIEND NOT FOUND/ALREADY ADDED");
	static JLabel pageFollowErrorLbl = new JLabel("PAGE NOT FOUND/ALREADY FOLLOWING");
	static JLabel picPreviewLbl = new JLabel("");
	static JLabel profilePicDisplayLbl = new JLabel("");
	
	static JRadioButton ownRdBtn = new JRadioButton("YOU");
	static JRadioButton friendRdBtn_0 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_1 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_2 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_3 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_4 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_5 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_6 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_7 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_8 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_9 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_10 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_11 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_12 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_13 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_14 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_15 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_16 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_17 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_18 = new JRadioButton("empty");
	static JRadioButton friendRdBtn_19 = new JRadioButton("empty");
	
	static ButtonGroup group = new ButtonGroup();
	
	static JLabel[] uNames = {lblUsername_0, lblUsername_1, lblUsername_2, lblUsername_3, lblUsername_4, lblUsername_5, lblUsername_6, lblUsername_7, lblUsername_8, lblUsername_9, 
			lblUsername_10, lblUsername_11, lblUsername_12, lblUsername_13, lblUsername_14, lblUsername_15, lblUsername_16, lblUsername_17, lblUsername_18, lblUsername_19};
	static JLabel[] pws = {lblPassword_0, lblPassword_1, lblPassword_2, lblPassword_3, lblPassword_4, lblPassword_5, lblPassword_6, lblPassword_7, lblPassword_8, 
			lblPassword_9, lblPassword_10, lblPassword_11, lblPassword_12, lblPassword_13, lblPassword_14, lblPassword_15, lblPassword_16, lblPassword_17, lblPassword_18, lblPassword_19};
	static JRadioButton[] friendList = {friendRdBtn_0, friendRdBtn_1, friendRdBtn_2, friendRdBtn_3, friendRdBtn_4, friendRdBtn_5, friendRdBtn_6, friendRdBtn_7, friendRdBtn_8, friendRdBtn_9, friendRdBtn_10, friendRdBtn_11, friendRdBtn_12, 
			friendRdBtn_13, friendRdBtn_14, friendRdBtn_15, friendRdBtn_16, friendRdBtn_17, friendRdBtn_18, friendRdBtn_19};
	
	
	static int numAttempts = 0;
	static int userIndex = -1;
	
	static final int numUsers = 20;
	static final int numOrgs = 10;
	static final int maxUpdates = 3;
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		
		OSN network = null;																	//create the network
		
		File checkExisting = new File("src/savedOSN.ser");									//checking for an existing network
		if (checkExisting.isFile())
		{
			FileInputStream loadOSN = new FileInputStream("src/savedOSN.ser");
			ObjectInputStream in = new ObjectInputStream(loadOSN);
			network = (OSN) in.readObject();												//load existing network into the program
			System.out.println("Existing network successfully loaded");
		}
		else
		{
			network = new OSN();															//create new network if no pre-existing one
			initialize(network, numUsers, numOrgs);											//initialize the network with users and pages
		}
		
		buttonSetup();																		//sets the radio button buttongroup
		formatGUI(network);
		
		
		
	}

	private static void formatGUI(OSN network) 
	{
		//START GUI STYLE FORMATTING
		
		mainWindow.setResizable(false);
		mainWindow.setTitle("OSN Network Assignment 8");
		mainWindow.setSize(800, 800);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
		mainWindow.getContentPane().add(mainPanel);
		
		
		panelScreenInit.setVisible(true);
		panelScreenRegister.setVisible(false);
		panelScreenList.setVisible(false);
		panelScreenUser.setVisible(false);
		
		
		panelScreenUser.setBackground(SystemColor.activeCaption);
		panelScreenUser.setBounds(0, 89, 794, 618);
		panelScreenUser.setLayout(null);
		panelScreenUser.add(tabbedPane);
		
		tabbedPane.setBounds(0, 0, 784, 618);
		tabbedPane.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("| View Feed |", null, scrollpaneFeed, null);
		tabbedPane.addTab("| Main Page |", null, optionsPanel, null);
		tabbedPane.addTab("| Change Picture |", null, changePicPanel, null);
		tabbedPane.addTab("| View Profile Pics |", null, friendListPanel, null);
		
		
		feedTxtArea.setWrapStyleWord(true);
		feedTxtArea.setText("feed goes here...");
		feedTxtArea.setLineWrap(true);
		feedTxtArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
		feedTxtArea.setEditable(false);
		
		
		scrollpaneFeed.setViewportView(feedTxtArea);
		
		
		optionsPanel.setBackground(SystemColor.activeCaption);
		optionsPanel.add(updatePostTxtArea);
		optionsPanel.add(postUpdateBtn);
		optionsPanel.add(friendNameTxtField);
		optionsPanel.add(addFriendBtn);
		optionsPanel.add(friendAddErrorLbl);
		optionsPanel.add(pageFollowErrorLbl);
		optionsPanel.add(pageNameTxtField);
		optionsPanel.add(followPageBtn);
		optionsPanel.add(logoutBtn);
		optionsPanel.setLayout(null);
		
		
		updatePostTxtArea.setText("post your update here...");
		updatePostTxtArea.setLineWrap(true);
		updatePostTxtArea.setBounds(10, 11, 762, 306);
		
		
		postUpdateBtn.setBounds(683, 328, 89, 23);
		
		
		addFriendBtn.setBounds(683, 416, 89, 23);
		
		
		friendAddErrorLbl.setHorizontalAlignment(SwingConstants.CENTER);
		friendAddErrorLbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		friendAddErrorLbl.setForeground(Color.RED);
		friendAddErrorLbl.setBounds(10, 388, 618, 18);
		friendAddErrorLbl.setVisible(false);
		
		
		pageFollowErrorLbl.setHorizontalAlignment(SwingConstants.CENTER);
		pageFollowErrorLbl.setForeground(Color.RED);
		pageFollowErrorLbl.setFont(new Font("Tahoma", Font.BOLD, 20));
		pageFollowErrorLbl.setBounds(10, 467, 618, 18);
		pageFollowErrorLbl.setVisible(false);
		
		pageNameTxtField.setText("type the name of a page you would like to follow here...");
		pageNameTxtField.setColumns(10);
		pageNameTxtField.setBounds(10, 496, 618, 20);
		
		
		followPageBtn.setBounds(683, 495, 89, 23);
		
		
		logoutBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		logoutBtn.setBounds(331, 548, 131, 37);
		
		
		friendNameTxtField.setText("type the username of a friend you would like to add here...");
		friendNameTxtField.setBounds(10, 417, 618, 20);
		friendNameTxtField.setColumns(10);
		
		
		picDirUpTxtField.setText("paste picture directory here...");
		picDirUpTxtField.setBounds(10, 520, 764, 20);
		picDirUpTxtField.setColumns(10);
		
		
		changePicPanel.setLayout(null);
		changePicPanel.add(picPreviewLbl);
		changePicPanel.add(picDirUpTxtField);
		changePicPanel.add(uploadPicBtn);
		
		picPreviewLbl.setBounds(142, 11, 500, 500);
		
		uploadPicBtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		uploadPicBtn.setBounds(346, 551, 92, 34);
		
		friendListPanel.setLayout(null);
		friendListPanel.add(radioPanel);
		friendListPanel.add(profilePicDisplayLbl);
		
		radioPanel.setBounds(0, 0, 170, 596);
		radioPanel.setLayout(new GridLayout(0, 1, 0, 0));
		radioPanel.add(ownRdBtn);
		radioPanel.add(friendRdBtn_0);
		radioPanel.add(friendRdBtn_1);
		radioPanel.add(friendRdBtn_2);
		radioPanel.add(friendRdBtn_3);
		radioPanel.add(friendRdBtn_4);
		radioPanel.add(friendRdBtn_5);
		radioPanel.add(friendRdBtn_6);
		radioPanel.add(friendRdBtn_7);
		radioPanel.add(friendRdBtn_8);
		radioPanel.add(friendRdBtn_9);
		radioPanel.add(friendRdBtn_10);
		radioPanel.add(friendRdBtn_11);
		radioPanel.add(friendRdBtn_12);
		radioPanel.add(friendRdBtn_13);
		radioPanel.add(friendRdBtn_14);
		radioPanel.add(friendRdBtn_15);
		radioPanel.add(friendRdBtn_16);
		radioPanel.add(friendRdBtn_17);
		radioPanel.add(friendRdBtn_18);
		radioPanel.add(friendRdBtn_19);
		
		ownRdBtn.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_0.setEnabled(false);
		friendRdBtn_0.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_1.setEnabled(false);
		friendRdBtn_1.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_2.setEnabled(false);
		friendRdBtn_2.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_3.setEnabled(false);
		friendRdBtn_3.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_4.setEnabled(false);
		friendRdBtn_4.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_5.setEnabled(false);
		friendRdBtn_5.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_6.setEnabled(false);
		friendRdBtn_6.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_7.setEnabled(false);
		friendRdBtn_7.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_8.setEnabled(false);
		friendRdBtn_8.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_9.setEnabled(false);
		friendRdBtn_9.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_10.setEnabled(false);
		friendRdBtn_10.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_11.setEnabled(false);
		friendRdBtn_11.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_12.setEnabled(false);
		friendRdBtn_12.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_13.setEnabled(false);
		friendRdBtn_13.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_14.setEnabled(false);
		friendRdBtn_14.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_15.setEnabled(false);
		friendRdBtn_15.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_16.setEnabled(false);
		friendRdBtn_16.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_17.setEnabled(false);
		friendRdBtn_17.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_18.setEnabled(false);
		friendRdBtn_18.setHorizontalAlignment(SwingConstants.CENTER);
		friendRdBtn_19.setEnabled(false);
		friendRdBtn_19.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		profilePicDisplayLbl.setHorizontalAlignment(SwingConstants.CENTER);
		profilePicDisplayLbl.setBounds(200, 24, 550, 550);
		
		
		mainPanel.add(panelScreenInit);
		mainPanel.add(panelScreenRegister);
		mainPanel.add(upperPanel);
		mainPanel.add(lowerPanel);
		mainPanel.add(panelScreenList);
		mainPanel.add(panelScreenUser);
		mainPanel.setLayout(null);
		
		
		panelScreenInit.setBackground(SystemColor.activeCaption);
		panelScreenInit.setBounds(0, 89, 794, 618);
		panelScreenInit.setLayout(null);
		panelScreenInit.add(usernameLabel);
		panelScreenInit.add(passwordLabel);
		panelScreenInit.add(usernameTxtField);
		panelScreenInit.add(passwordTxtField);
		panelScreenInit.add(loginBtn);
		panelScreenInit.add(registerBtn);
		panelScreenInit.add(loginErrorLabel);
		
		
		panelScreenRegister.setBackground(SystemColor.activeCaption);
		panelScreenRegister.setBounds(0, 89, 794, 618);
		panelScreenRegister.setLayout(null);
		panelScreenRegister.add(pwLabel);
		panelScreenRegister.add(dobLabel);
		panelScreenRegister.add(lNameLabel);
		panelScreenRegister.add(fNameLabel);
		panelScreenRegister.add(uNameLabel);
		panelScreenRegister.add(registerErrorLabel);
		panelScreenRegister.add(fNameTxtField);
		panelScreenRegister.add(lNameTxtField);
		panelScreenRegister.add(uNameTxtField);
		panelScreenRegister.add(dobTxtField);
		panelScreenRegister.add(pwTxtField);
		panelScreenRegister.add(regBackBtn);
		panelScreenRegister.add(regSubmitBtn);
		
		
		upperPanel.setBackground(SystemColor.activeCaption);
		upperPanel.setBounds(0, 0, 794, 90);
		upperPanel.setLayout(null);
		upperPanel.add(upperPanelLabel);
		
		
		lowerPanel.setBackground(SystemColor.activeCaption);
		lowerPanel.setBounds(0, 707, 794, 64);
		lowerPanel.setLayout(null);
		lowerPanel.add(exitBtn);
		lowerPanel.add(showUsersBtn);
		lowerPanel.add(hideUsersBtn);
		
		
		panelScreenList.setBounds(0, 89, 794, 618);
		panelScreenList.setLayout(null);
		panelScreenList.setBackground(Color.GREEN);
		panelScreenList.add(labelUserTitle);
		panelScreenList.add(labelPWTitle);
		panelScreenList.add(lblUsername_0);
		panelScreenList.add(lblPassword_0);
		panelScreenList.add(lblUsername_1);
		panelScreenList.add(lblPassword_1);
		panelScreenList.add(lblUsername_2);
		panelScreenList.add(lblPassword_2);
		panelScreenList.add(lblUsername_3);
		panelScreenList.add(lblPassword_3);
		panelScreenList.add(lblPassword_4);
		panelScreenList.add(lblUsername_4);
		panelScreenList.add(lblUsername_5);
		panelScreenList.add(lblPassword_5);
		panelScreenList.add(lblUsername_6);
		panelScreenList.add(lblPassword_6);
		panelScreenList.add(lblUsername_7);
		panelScreenList.add(lblPassword_7);
		panelScreenList.add(lblUsername_8);
		panelScreenList.add(lblPassword_8);
		panelScreenList.add(lblUsername_9);
		panelScreenList.add(lblPassword_9);
		panelScreenList.add(lblUsername_10);
		panelScreenList.add(lblPassword_10);
		panelScreenList.add(lblUsername_11);
		panelScreenList.add(lblPassword_11);
		panelScreenList.add(lblUsername_12);
		panelScreenList.add(lblPassword_12);
		panelScreenList.add(lblUsername_13);
		panelScreenList.add(lblPassword_13);
		panelScreenList.add(lblUsername_14);
		panelScreenList.add(lblPassword_14);
		panelScreenList.add(lblUsername_15);
		panelScreenList.add(lblPassword_15);
		panelScreenList.add(lblUsername_16);
		panelScreenList.add(lblPassword_16);
		panelScreenList.add(lblUsername_17);
		panelScreenList.add(lblPassword_17);
		panelScreenList.add(lblUsername_18);
		panelScreenList.add(lblPassword_18);
		panelScreenList.add(lblUsername_19);
		panelScreenList.add(lblPassword_19);
		
		
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		usernameLabel.setBounds(10, 96, 102, 25);
		
		
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordLabel.setBounds(10, 160, 102, 25);
		
		
		usernameTxtField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		usernameTxtField.setBounds(122, 96, 641, 25);
		usernameTxtField.setColumns(10);
		
		
		passwordTxtField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passwordTxtField.setColumns(10);
		passwordTxtField.setBounds(122, 160, 641, 25);
		
		
		loginBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		loginBtn.setBounds(387, 234, 110, 25);
		
		
		registerBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		registerBtn.setBounds(280, 406, 233, 169);
		
		
		loginErrorLabel.setForeground(Color.RED);
		loginErrorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginErrorLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		loginErrorLabel.setBounds(20, 23, 753, 48);
		loginErrorLabel.setVisible(false);
		
		
		pwLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pwLabel.setBounds(10, 510, 103, 25);
		
		
		dobLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dobLabel.setBounds(10, 403, 103, 25);
		
		
		lNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lNameLabel.setBounds(10, 189, 103, 25);
		
		
		fNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fNameLabel.setBounds(10, 82, 103, 25);
		
		
		uNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		uNameLabel.setBounds(10, 296, 103, 25);
		
		
		registerErrorLabel.setHorizontalAlignment(SwingConstants.CENTER);
		registerErrorLabel.setForeground(Color.RED);
		registerErrorLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		registerErrorLabel.setBounds(20, 23, 753, 48);
		
		
		lNameTxtField.setColumns(10);
		lNameTxtField.setBounds(123, 189, 641, 25);
		
		
		uNameTxtField.setColumns(10);
		uNameTxtField.setBounds(123, 296, 641, 25);
		
		
		dobTxtField.setColumns(10);
		dobTxtField.setBounds(123, 403, 641, 25);
		
		
		pwTxtField.setColumns(10);
		pwTxtField.setBounds(123, 510, 641, 25);
		
		
		fNameTxtField.setBounds(123, 82, 641, 25);
		fNameTxtField.setColumns(10);
		
		
		regBackBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		regBackBtn.setBounds(10, 570, 110, 25);
		
		
		regSubmitBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		regSubmitBtn.setBounds(654, 570, 110, 25);
		
		
		upperPanelLabel.setBounds(345, 25, 103, 39);
		upperPanelLabel.setFont(new Font("Tahoma", Font.PLAIN, 32));
		
		
		exitBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		exitBtn.setBounds(10, 11, 117, 42);
		
		
		showUsersBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		showUsersBtn.setBounds(622, 11, 150, 42);
		
		
		hideUsersBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		hideUsersBtn.setBounds(472, 11, 150, 42);
		
		
		labelUserTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelUserTitle.setBounds(10, 4, 390, 25);
		labelPWTitle.setHorizontalAlignment(SwingConstants.CENTER);
		labelPWTitle.setBounds(399, 4, 373, 25);
		lblPassword_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_9.setBounds(399, 294, 373, 25);
		lblUsername_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_12.setBounds(10, 381, 390, 25);
		lblPassword_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_3.setBounds(399, 120, 373, 25);
		lblUsername_0.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_0.setBounds(10, 33, 390, 25);
		lblPassword_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_4.setBounds(399, 149, 373, 25);
		lblUsername_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_7.setBounds(10, 236, 390, 25);
		lblPassword_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_7.setBounds(399, 236, 373, 25);
		lblUsername_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_17.setBounds(10, 526, 390, 25);
		lblPassword_0.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_0.setBounds(399, 33, 373, 25);
		lblUsername_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_1.setBounds(10, 62, 390, 25);
		lblPassword_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_1.setBounds(399, 62, 373, 25);
		lblUsername_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_2.setBounds(10, 91, 390, 25);
		lblPassword_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_12.setBounds(399, 381, 373, 25);
		lblUsername_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_8.setBounds(10, 265, 390, 25);
		lblPassword_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_17.setBounds(399, 526, 373, 25);
		lblUsername_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_19.setBounds(10, 584, 390, 25);
		lblPassword_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_19.setBounds(399, 584, 373, 25);
		lblUsername_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_18.setBounds(10, 555, 390, 25);
		lblPassword_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_16.setBounds(399, 497, 373, 25);
		lblUsername_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_13.setBounds(10, 410, 390, 25);
		lblPassword_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_5.setBounds(399, 178, 373, 25);
		lblUsername_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_14.setBounds(10, 439, 390, 25);
		lblPassword_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_13.setBounds(399, 410, 373, 25);
		lblUsername_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_15.setBounds(10, 468, 390, 25);
		lblPassword_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_14.setBounds(399, 439, 373, 25);
		lblUsername_16.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_16.setBounds(10, 497, 390, 25);
		lblPassword_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_15.setBounds(399, 468, 373, 25);
		lblUsername_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_9.setBounds(10, 294, 390, 25);
		lblPassword_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_11.setBounds(399, 352, 373, 25);
		lblUsername_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_3.setBounds(10, 120, 390, 25);
		lblPassword_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_2.setBounds(399, 91, 373, 25);
		lblUsername_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_6.setBounds(10, 207, 390, 25);
		lblPassword_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_8.setBounds(399, 265, 373, 25);
		lblUsername_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_10.setBounds(10, 323, 390, 25);
		lblPassword_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_6.setBounds(399, 207, 373, 25);
		lblUsername_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_4.setBounds(10, 149, 390, 25);
		lblPassword_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_18.setBounds(399, 555, 373, 25);
		lblUsername_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_11.setBounds(10, 352, 390, 25);
		lblPassword_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword_10.setBounds(399, 323, 373, 25);
		lblUsername_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_5.setBounds(10, 178, 390, 25);
		labelUserTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelPWTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		
		
		
		
		//START EVENTLISTENERS
		
		
		
		
		
		panelScreenRegister.addAncestorListener(new AncestorListener() 			//fires on register page visible
		{

			@Override
			public void ancestorAdded(AncestorEvent event) 
			{
				numAttempts = 0;
				fNameTxtField.setText("");
				lNameTxtField.setText("");
				uNameTxtField.setText("");
				dobTxtField.setText("");
				pwTxtField.setText("");
				registerErrorLabel.setVisible(false);
			}

			@Override
			public void ancestorRemoved(AncestorEvent event) 
			{}

			@Override
			public void ancestorMoved(AncestorEvent event) 
			{}});
		
		panelScreenInit.addAncestorListener(new AncestorListener() 				//fires on loginScreen visible
		{

			@Override
			public void ancestorAdded(AncestorEvent event) 
			{
				usernameTxtField.setText("");
				passwordTxtField.setText("");
				loginErrorLabel.setVisible(false);
			}

			@Override
			public void ancestorRemoved(AncestorEvent event) 
			{}

			@Override
			public void ancestorMoved(AncestorEvent event) 
			{}});
		
		scrollpaneFeed.addAncestorListener(new AncestorListener() 				//fires on 1st profile tab panel visible
		{

			@Override
			public void ancestorAdded(AncestorEvent event) 
			{
				refreshFeed(network, userIndex);
			}

			@Override
			public void ancestorRemoved(AncestorEvent event) 
			{}

			@Override
			public void ancestorMoved(AncestorEvent event) 
			{}});
				
		optionsPanel.addAncestorListener(new AncestorListener() 				//fires on 2nd profile tab panel visible
		{
			@Override
			public void ancestorAdded(AncestorEvent event) 
			{
				updatePostTxtArea.setText("post your update here...");
				friendNameTxtField.setText("type the username of a friend you would like to add here...");
				pageNameTxtField.setText("type the name of a page you would like to follow here...");
				friendAddErrorLbl.setVisible(false);
				pageFollowErrorLbl.setVisible(false);
			}

			@Override
			public void ancestorRemoved(AncestorEvent event) 
			{}
	
			@Override
			public void ancestorMoved(AncestorEvent event) 
			{}});
				
		changePicPanel.addAncestorListener(new AncestorListener() 				//fires on 3rd profile tab panel visible
		{

			@Override
			public void ancestorAdded(AncestorEvent event) 
			{
				picPreviewLbl.setIcon(null);
				picDirUpTxtField.setText("paste image directory here...");
			}

			@Override
			public void ancestorRemoved(AncestorEvent event) 
			{}

			@Override
			public void ancestorMoved(AncestorEvent event) 
			{}});
				
		friendListPanel.addAncestorListener(new AncestorListener() 				//fires on 4th profile tab panel visible
		{

			@Override
			public void ancestorAdded(AncestorEvent event) 
			{
				group.clearSelection();
				profilePicDisplayLbl.setIcon(null);
				refreshFriendList(network, userIndex);
			}

			@Override
			public void ancestorRemoved(AncestorEvent event) 
			{}

			@Override
			public void ancestorMoved(AncestorEvent event) 
			{}});
				
		addFriendBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				addingFriend(network, userIndex, friendNameTxtField.getText());
			}
		});
				
		followPageBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				followingPage(network, userIndex, pageNameTxtField.getText());
						
			}
		});
				
		postUpdateBtn.addActionListener(new ActionListener() 							//posts updates for user on success
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (network.users.get(userIndex).updates.size() < maxUpdates)
				{
					network.users.get(userIndex).updates.add(updatePostTxtArea.getText());
					updatePostTxtArea.setText("UPDATE SUCCESSFULLY POSTED");
				}
				else
					updatePostTxtArea.setText("ERROR: MAXIMUM NUMBER OF UPDATES REACHED FOR THIS USER");
			}
		});
				
		logoutBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				goToLoginScreen();
			}
		});
		
		loginBtn.addActionListener(new ActionListener() 						//handles logging in (checks with attemptLogin function to validate creds
		{
			public void actionPerformed(ActionEvent e) 
			{
				String username, pw;
				username = usernameTxtField.getText();
				pw = passwordTxtField.getText();
				userIndex = attemptLogin(network, username, pw);
				
				if (userIndex < 0)
				{
					loginErrorLabel.setVisible(true);
					loginErrorLabel.setText("Invalid Username/Password");
				}
				else
				{
					loginErrorLabel.setVisible(false);
					goToProfileScreen(network, userIndex);
				}
			}
		});
		
		registerBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				if (network.users.size() < numUsers)
				goToRegisterScreen();
				else
				{
					loginErrorLabel.setText("MAX NUMBER OF USERS REACHED");
					loginErrorLabel.setVisible(true);
				}
			}
		});
		
		regSubmitBtn.addActionListener(new ActionListener() 						//handles new user registration on confirm button press
		{
			public void actionPerformed(ActionEvent e) 
			{
				String fName, lName, uName, dob, pw;
				fName = fNameTxtField.getText();
				lName = lNameTxtField.getText();
				uName = uNameTxtField.getText();
				dob = dobTxtField.getText();
				pw = pwTxtField.getText();
				boolean regSuccess = attemptReg(network, uName);
				
				if (regSuccess == false)
				{
					if (numAttempts < 2)
					{
						registerErrorLabel.setVisible(true);
						registerErrorLabel.setText("Username already taken! Attempts remaining: " + (2-numAttempts));
					}
					else
					{
						uName = lName + Integer.toString((int) (Math.random() * 1000));
						User newUser = new User(fName, lName, uName, pw, dob);
						network.users.add(newUser);
						network.usernameList.add(newUser.username);
						network.passwordList.add(newUser.password);
						goToLoginScreen();
					}
					numAttempts++;
				}
				else
				{
					User newUser = new User(fName, lName, uName, pw, dob);
					network.users.add(newUser);
					network.usernameList.add(newUser.username);
					network.passwordList.add(newUser.password);
					goToLoginScreen();
				}
					
			}
		});
		
		regBackBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				goToLoginScreen();
			}
		});
		
		showUsersBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				updateUsersPW(network);
				goToUserScreen();
			}
		});
		
		hideUsersBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				goToLoginScreen();
			}
		});
		
		
		exitBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					saveAndQuit(network);
				} 
				catch (IOException e1) 
				{
					e1.printStackTrace();
				}
			}
		});
		
		uploadPicBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try
				{
					img = ImageIO.read(new File(picDirUpTxtField.getText()));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				network.users.get(userIndex).pic = picDirUpTxtField.getText();
				
				Image reImg = img.getScaledInstance(picPreviewLbl.getWidth(), picPreviewLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				picPreviewLbl.setIcon(imgIcon);
			}
		});
		
		ownRdBtn.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_0.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(0).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(1).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(2).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(3).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_4.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(4).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(5).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(6).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(7).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(8).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_9.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(9).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_10.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(10).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_11.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(11).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_12.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(12).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_13.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(13).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_14.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(14).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_15.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(15).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_16.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(16).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_17.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(17).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_18.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(18).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
		
		friendRdBtn_19.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				BufferedImage img = null;
				try 
				{
					img = ImageIO.read(new File(network.users.get(userIndex).friends.get(19).pic));
				}
				catch (IOException x)
				{
					x.printStackTrace();
				}
				
				Image reImg = img.getScaledInstance(profilePicDisplayLbl.getWidth(), profilePicDisplayLbl.getHeight(), Image.SCALE_SMOOTH);
				
				ImageIcon imgIcon = new ImageIcon(reImg);
				
				profilePicDisplayLbl.setIcon(imgIcon);
			}
		});
	}

	//END FORMATGUI
	
	
	public static void buttonSetup()
	{
		group.add(ownRdBtn);
		group.add(friendRdBtn_0);
		group.add(friendRdBtn_1);
		group.add(friendRdBtn_2);
		group.add(friendRdBtn_3);
		group.add(friendRdBtn_4);
		group.add(friendRdBtn_5);
		group.add(friendRdBtn_6);
		group.add(friendRdBtn_7);
		group.add(friendRdBtn_8);
		group.add(friendRdBtn_9);
		group.add(friendRdBtn_10);
		group.add(friendRdBtn_11);
		group.add(friendRdBtn_12);
		group.add(friendRdBtn_13);
		group.add(friendRdBtn_14);
		group.add(friendRdBtn_15);
		group.add(friendRdBtn_16);
		group.add(friendRdBtn_17);
		group.add(friendRdBtn_18);
		group.add(friendRdBtn_19);
		
	}
	
	
	//END ADDBUTTONS
	
	
	public static int attemptLogin(OSN network, String usernameIn, String passwordIn)		//checks if uName and pw combo is valid
	{
		if ((network.usernameList.indexOf(usernameIn) != -1) && (network.usernameList.indexOf(usernameIn) == network.passwordList.indexOf(passwordIn)))
			return network.usernameList.indexOf(usernameIn);
		else
			return -1;
	}
	
	
	//END ATTEMPTLOGIN
	
	
	public static boolean attemptReg(OSN network, String uName)								//checks if username is already in network
	{
		if (!(network.usernameList.contains(uName)))
			return true;
		else
			return false;
	}
	
	
	//END ATTEMPTREG
	
	
	public static void goToLoginScreen()													//shifts screen to login screen
	{
		panelScreenInit.setVisible(true);
		panelScreenRegister.setVisible(false);
		panelScreenList.setVisible(false);
		panelScreenUser.setVisible(false);
		loginErrorLabel.setVisible(false);
	}
	
	public static void goToRegisterScreen()													//shifts screen to registration screen
	{
		panelScreenRegister.setVisible(true);
		panelScreenInit.setVisible(false);
		panelScreenList.setVisible(false);
		panelScreenUser.setVisible(false);
		registerErrorLabel.setVisible(false);
		
	}
	
	public static void goToUserScreen()														//shifts screen to uNames and pw list page
	{
		panelScreenList.setVisible(true);
		panelScreenRegister.setVisible(false);
		panelScreenInit.setVisible(false);
		panelScreenUser.setVisible(false);
	}
	
	public static void goToProfileScreen(OSN network, int userIndex)						//shifts screen to profile page
	{
		panelScreenUser.setVisible(true);
		panelScreenList.setVisible(false);
		panelScreenRegister.setVisible(false);
		panelScreenInit.setVisible(false);
		
		refreshFeed(network, userIndex);
	}
	
	
	//END SCREEN SHIFT FUNCTIONS
	
	
	public static void updateUsersPW(OSN network)											//populates username and pw list
	{
		for (int i = 0; i < network.usernameList.size(); i++)
		{
			uNames[i].setText(network.usernameList.get(i));
			pws[i].setText(network.passwordList.get(i));
		}
	}
	
	public static void saveAndQuit(OSN network) throws IOException 							//saves network on exit
	{
		FileOutputStream saveOSN = new FileOutputStream("src/savedOSN.ser");
		ObjectOutputStream out = new ObjectOutputStream(saveOSN);
		out.writeObject(network);
		System.exit(0);
	}
	
	
	//END saveAndQuit
	
	
	public static void initialize(OSN network, int numUsers, int numOrgs)					//uses constructors to add predefined users and pages into the network
	{
		/*
		for (int i = 0; i < numUsers; i++)
		{
			User newUser = new User("Person " + i, "Surname " + i, "Username " + i, "pw " + i, Integer.toString(i));
			network.users.add(newUser);
			network.usernameList.add(newUser.username);
			network.passwordList.add(newUser.password);
		}
		*/
		
		for (int i = 0; i < numOrgs; i++)
		{
			Organization newOrg = new Organization("Organization " + i, (int) (Math.random() * 100), (int) (Math.random() * 2), (int) (Math.random() * 4), (int) (Math.random() * 4));
			network.orgs.add(newOrg);
			network.orgList.add(newOrg.name);
		}
	}
	
	
	//END INITIALIZE
	
	
	public static void addingFriend(OSN network, int userIndex, String searchQuery)				//handles adding of friends
	{
		if ((network.usernameList.indexOf(searchQuery) != -1) && (!(network.users.get(userIndex).friends.contains(network.users.get(network.usernameList.indexOf(searchQuery))))))
		{
			network.users.get(userIndex).addFriend(network.users.get(network.usernameList.indexOf(searchQuery)));
			friendAddErrorLbl.setText("FRIEND SUCCESSFULLY ADDED");
		}
		else
			friendAddErrorLbl.setText("UNABLE TO FIND FRIEND/ALREADY ADDED");
		friendAddErrorLbl.setVisible(true);
	}
	
	public static void followingPage(OSN network, int userIndex, String searchQuery)			//handles following of pages
	{
		if ((network.orgList.indexOf(searchQuery) != -1) && (!(network.users.get(userIndex).pages.contains(network.orgs.get(network.orgList.indexOf(searchQuery))))))
		{
			network.users.get(userIndex).addOrg(network.orgs.get(network.orgList.indexOf(searchQuery)));
			pageFollowErrorLbl.setText("PAGE SUCCESSFULLY FOLLOWED");
		}
		else
			pageFollowErrorLbl.setText("UNABLE TO FIND PAGE/ALREADY FOLLOWING");
		pageFollowErrorLbl.setVisible(true);
	}
	
	
	public static void refreshFeed(OSN network, int userIndex)									//handles viewing the feed for a user
	{
		String wholeFeed = "";
		
		for (int i = 0; i < network.users.get(userIndex).friends.size(); i++)					//grab all friends in friendlist and call the displayUpdates function
		{
			wholeFeed += (network.users.get(userIndex).friends.get(i).name) + " says:\n" + network.users.get(userIndex).friends.get(i).displayUpdates() + "\n";
		}
		
		for (int i = 0; i < network.users.get(userIndex).pages.size(); i++)						//grab all pages in follow list and call the displayUpdates function
		{
			wholeFeed += (network.users.get(userIndex).pages.get(i).name) + " says:\n" + network.users.get(userIndex).pages.get(i).displayUpdates() + "\n";
		}
		
		feedTxtArea.setText(wholeFeed);
	}
	
	public static void refreshFriendList(OSN network, int userIndex)
	{
		for (int i = 0; i < friendList.length; i++)
			friendList[i].setEnabled(false);
		
		for (int i = 0; i < network.users.get(userIndex).friends.size(); i++)
		{
			friendList[i].setEnabled(true);
			friendList[i].setText(network.users.get(userIndex).friends.get(i).name);
		}
	}
}

	
	


abstract class Profile implements Serializable												//abstract class from which users and organizations inherit from
{
	String name;																			//both users and organizations will have a name and an updates array
	ArrayList<String> updates = new ArrayList<String>();
	
	public String displayUpdates()															//simple for loop that will print all updates easily when called
	{
		String update = "";
		if (this.updates.size() == 0)
			return ("Currently no posts\n");
		else
		{
			for (int i = 0; i < this.updates.size(); i++)
				update += String.format("[%d] %s\n\n", i+1, this.updates.get(i));
		return update;
		}
	}
}

class User extends Profile																	//users have certain properties unique to them (not seen in organizations)
{
	String surname, username, password, dob, pic;
	ArrayList<User> friends = new ArrayList<User>();
	ArrayList<Organization> pages = new ArrayList<Organization>();
	
	User(String name, String surname, String username, String password, String dob)			//unique constructor for the creation of new users
	{
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = password;
		this.dob = dob;
		this.pic = "src/default.png";
	}
	
	public void addFriend(User newFriend)													//handles adding friends (CURRENTLY HARDCODED)
	{
		if (!(this.friends.contains(newFriend)) && (newFriend != this))						//check first that the user isn't trying to add themselves, or a user already on their list
		{
			this.friends.add(newFriend);													//add the friend to their friendlist
			newFriend.friends.add(this);													//add the user to the friend's friendlist
		}

	}
	
	public void addOrg(Organization newOrg)													//handles adding pages (CURRENTLY HARDCODED)
	{
		if (!(this.pages.contains(newOrg)))													//check first that the user isn't already subscribed to this org
		{
			this.pages.add(newOrg);															//subscribe to the org
			newOrg.followers.add(this);														//add the user to the org's follow list
		}
	}
}

class Organization extends Profile															//orgs (or pages) have certain properties unique to them (not seen in users)
{
	int id;
	ArrayList<User> followers = new ArrayList<User>();
	
	
	//PLACEHOLDER CONSTRUCTOR that contains a randomized id, and mission statement for the organization
	Organization(String name, int id, int adlib1, int adlib2, int adlib3)
	{
		String[] text1 = {"provide unfettered support for ", "call for immediate dissolution of "};
		String[] text2 = {"AI-supported android jobs in the workforce. ", "lenient labor laws. ", "mandatory headphone inspections. ", "manila folder regulation. "};
		String[] text3 = {"Thank you for your help in our commitment!", "Sign up to our newsletter to learn more!", "Don't let the other side win.", "We need you to act!"};
		this.name = name;
		this.id = id;
		
		
		this.updates.add("We here at " + this.name + " strive to " + text1[adlib1] + text2[adlib2] + text3[adlib3]);
	}
}

class OSN implements Serializable															//the Online Social Network integral to handling all user/org data
{
	ArrayList<User> users = new ArrayList<User>();
	ArrayList<String> usernameList = new ArrayList<String>();
	ArrayList<String> passwordList = new ArrayList<String>();
	ArrayList<Organization> orgs = new ArrayList<Organization>();
	ArrayList<String> orgList = new ArrayList<String>();
	
	public void displayNetwork()															//gives a list of pages as well as possible login-pw combos
	{
		System.out.printf("%20s \t %20s\n", "[USERNAMES]", "[PASSWORDS]");
		for (int i = 0; i < users.size(); i++)
			System.out.printf("%20s %20s\n", usernameList.get(i), passwordList.get(i));
		
		System.out.printf("%35s\n", "[ORGANIZATIONS]");
		for (int i = 0; i < orgs.size(); i++)
			System.out.printf("%35s\n", orgList.get(i));
		
		System.out.println();
	}
}