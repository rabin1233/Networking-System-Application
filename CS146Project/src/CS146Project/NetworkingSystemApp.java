package CS146Project;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import CS146Project.Graph.Edge;

//Author: Rabin Gurung(013855972)
//CS146 (Section 5)

// Creating Networking System Application Class
public class NetworkingSystemApp{

    //current profile object
    private static Profile currentProfile = null;

    public static void main(String[] args) {


        System.out.println("Project in progress...");
        // Graph object
        Graph msns = new Graph();

       
        // GUI and  window
        JFrame mainFrame = new JFrame();
        mainFrame.setSize(700, 700);
        mainFrame.setLocation(450, 200);

        // A component inside the window
        Panel centerPanel = new Panel();


        // A text box
        JTextArea jTextAreaTest = new JTextArea(15, 50);

        // A text
        JPanel heading = new JPanel();
        // heading.setSize(100, 100);
        JLabel headingText = new JLabel();
        headingText.setText("Social Network");
        heading.add(headingText);

        // this exits the network 	Application
        JButton exitBtn = new JButton("Exit");
        exitBtn.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                System.exit(0);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

        });


        // display the exit button on the window

        heading.add(exitBtn);



        centerPanel.setLayout(new BorderLayout());

        // Add the heading part to the window
        mainFrame.add(heading, BorderLayout.NORTH);
        centerPanel.add(new JButton("Your friends"), BorderLayout.NORTH);

        Panel statusPanel = new Panel();
        Panel statusInfoPanel = new Panel();
        centerPanel.add(statusPanel, BorderLayout.NORTH);
        centerPanel.add(statusInfoPanel, BorderLayout.CENTER);

        Panel westPanel = new Panel();
        westPanel.add(new Label("Your Account Info"));
        Panel eastPanel = new Panel();
        // Create New Profile Button
        JButton newProfileBtn = new JButton("Create a New Profile");
        newProfileBtn.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                JFrame newProfileWindow = new JFrame();
                Panel infoBox = new Panel();
                infoBox.setBackground(Color.GREEN);
                Label title = new Label("Create a New Profile");
                title.setSize(100, 200);
                // Create New Profile Window
                newProfileWindow.add(title, BorderLayout.NORTH);
                newProfileWindow.add(infoBox, BorderLayout.CENTER);

                // The name of the profile
                infoBox.add(new Label("Name: "), BorderLayout.CENTER);
                JTextField nameTextField = new JTextField("", 15);

                infoBox.add(nameTextField);

                // The status of the profile, work in progress...

                infoBox.add(new Label("Status (Single, Married, Divorced, Widow(er), Unknown)"), BorderLayout.SOUTH);
                JTextField statusTextField = new JTextField("", 15);

                infoBox.add(statusTextField);

                // Submit Button
                JButton submitFormBtn = new JButton("Submit");
                submitFormBtn.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        String name = nameTextField.getText();
                        String status = submitFormBtn.getText();
                        msns.addProfile(new Profile(name, status));
                        currentProfile = msns.getProfile(name);
                        newProfileWindow.dispatchEvent(new WindowEvent(newProfileWindow, WindowEvent.WINDOW_CLOSING));
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        // TODO Auto-generated method stub

                    }

                });
                // add submit button to the createProfile window
                infoBox.add(submitFormBtn, BorderLayout.SOUTH);
                newProfileWindow.setSize(500, 500);
                newProfileWindow.setBackground(Color.GREEN);
                newProfileWindow.setVisible(true);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }

        });

        // Display Profiles Button
        // This button shows all the profile's names on the console
        JButton displayProfilesBtn = new JButton("Profiles In System");
        displayProfilesBtn.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                JFrame newProfileSystemWindow = new JFrame();
                Panel infoBox = new Panel();
                infoBox.setBackground(Color.GREEN);
                Label title = new Label("Check the Console again");
                System.out.println("Profiles in the Networking System: ");
                msns.displayProfile();
                title.setSize(100, 200);
                // See the Profile System Window
                newProfileSystemWindow.add(title, BorderLayout.NORTH);
                JButton closeBtn = new JButton("Close");
                closeBtn.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        newProfileSystemWindow.dispatchEvent(new WindowEvent(newProfileSystemWindow, WindowEvent.WINDOW_CLOSING));
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        // TODO Auto-generated method stub

                    }});
                // add close button to the new window profile
                infoBox.add(closeBtn, BorderLayout.SOUTH);
                newProfileSystemWindow.add(infoBox);
                newProfileSystemWindow.setSize(500, 500);
                newProfileSystemWindow.setBackground(Color.GREEN);
                newProfileSystemWindow.setVisible(true);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }});

        // Search button will open up a new search window to search a profile in the system
        JButton searchBtn = new JButton("Search");
        searchBtn.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mousePressed(MouseEvent e) {
                JFrame profileSearchWindow = new JFrame();
                Panel infoBox = new Panel();
                infoBox.setBackground(Color.GREEN);
                Label title = new Label("Search a profile:");
                title.setSize(100, 200);

                profileSearchWindow.add(title, BorderLayout.NORTH);

                JTextField nameText = new JTextField("", 15);
                infoBox.add(nameText, BorderLayout.NORTH);

                // Search/Enter Button
                JButton enterBtn = new JButton("Enter");
                enterBtn.addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        JFrame resultWindow = new JFrame();
                        Panel resultPanel = new Panel();
                        String nameSearched = nameText.getText();
                        currentProfile = msns.getProfile(nameSearched);

                        Label results;
                        Panel resultListPanel = new Panel();

                        JButton modifyProfileBtn = new JButton("Edit Profile");
                        JButton addFriendsBtn = new JButton("Add friends");
                        JButton showFriendsBtn = new JButton("Show friends");
                        JButton findFriendsFriendBtn = new JButton("Friend's friend");

                        // condition for the profile to not be in the system
                        if(currentProfile == null) {

                            results = new Label("User not found");

                            JButton closeBtn = new JButton("Close");
                            closeBtn.addMouseListener(new MouseListener() {

                                @Override
                                public void mouseClicked(MouseEvent e) {
                                    // TODO Auto-generated method stub

                                }

                                @Override
                                public void mousePressed(MouseEvent e) {
                                    resultWindow.dispatchEvent(new WindowEvent(resultWindow, WindowEvent.WINDOW_CLOSING));
                                }

                                @Override
                                public void mouseReleased(MouseEvent e) {
                                    // TODO Auto-generated method stub

                                }

                                @Override
                                public void mouseEntered(MouseEvent e) {
                                    // TODO Auto-generated method stub

                                }

                                @Override
                                public void mouseExited(MouseEvent e) {
                                    // TODO Auto-generated method stub

                                }});

                            resultListPanel.add(results, BorderLayout.CENTER);
                            resultListPanel.add(closeBtn, BorderLayout.SOUTH);
                            resultListPanel.add(results);
                            modifyProfileBtn.setVisible(false);
                            addFriendsBtn.setVisible(false);
                            showFriendsBtn.setVisible(false);
                            findFriendsFriendBtn.setVisible(false);

                        }

                        //if the profile is found in the system
                        else {
                            String name = currentProfile.getName();
                            results = new Label(name);
                            resultListPanel.add(new Label("Users Found:"), BorderLayout.NORTH);
                            resultListPanel.add(results);
                            // resultPanel.add(new Label("Status: " + msns.getProfile(name).getStatus()));
                        }

                        // This button edits the profile
                        modifyProfileBtn.addMouseListener(new MouseListener() {

                            @Override
                            public void mouseClicked(MouseEvent e) {
                                // TODO Auto-generated method stub

                            }

                            @Override
                            public void mousePressed(MouseEvent e) {
                                JFrame editProfileWindow = new JFrame();
                                Panel infoBox = new Panel();
                                infoBox.setBackground(Color.YELLOW);
                                Label title = new Label("Edit Profile");
                                title.setSize(100, 200);
                                // Create New Profile Window
                                editProfileWindow.add(title, BorderLayout.NORTH);
                                editProfileWindow.add(infoBox, BorderLayout.CENTER);
                                // Edit Name
                                infoBox.add(new Label("New Name: "), BorderLayout.CENTER);
                                JTextField nameTextField = new JTextField("", 15);

                                infoBox.add(nameTextField);

                                // Edit Status
                                infoBox.add(new Label("New Status"), BorderLayout.CENTER);
                                JTextField statusTextField = new JTextField("", 15);

                                infoBox.add(statusTextField);

                                // Submit Button
                                JButton submitFormBtn = new JButton("Submit");
                                submitFormBtn.addMouseListener(new MouseListener() {

                                    @Override
                                    public void mouseClicked(MouseEvent e) {
                                        // TODO Auto-generated method stub

                                    }

                                    @Override
                                    public void mousePressed(MouseEvent e) {
                                        String newName = nameTextField.getText();
                                        currentProfile.setName(newName);
                                        String newStatus = statusTextField.getText();
                                        currentProfile.setStatus(newStatus);
                                        msns.addProfile(new Profile(newName, newStatus));
                                        editProfileWindow.dispatchEvent(new WindowEvent(editProfileWindow, WindowEvent.WINDOW_CLOSING));
                                    }

                                    @Override
                                    public void mouseReleased(MouseEvent e) {
                                        // TODO Auto-generated method stub

                                    }

                                    @Override
                                    public void mouseEntered(MouseEvent e) {
                                        // TODO Auto-generated method stub

                                    }

                                    @Override
                                    public void mouseExited(MouseEvent e) {
                                        // TODO Auto-generated method stub

                                    }

                                });
                                // added to edit profile window
                                infoBox.add(submitFormBtn, BorderLayout.SOUTH);
                                editProfileWindow.setSize(500, 500);
                                editProfileWindow.setBackground(Color.GREEN);
                                editProfileWindow.setVisible(true);
                            }

                            @Override
                            public void mouseReleased(MouseEvent e) {
                                // TODO Auto-generated method stub

                            }

                            @Override
                            public void mouseEntered(MouseEvent e) {
                                // TODO Auto-generated method stub

                            }

                            @Override
                            public void mouseExited(MouseEvent e) {
                                // TODO Auto-generated method stub

                            }
                        });

                        // Makes friendship between one profile to another profile
                        addFriendsBtn.addMouseListener(new MouseListener() {

                            @Override
                            public void mouseClicked(MouseEvent e) {
                                // TODO Auto-generated method stub

                            }

                            @Override
                            public void mousePressed(MouseEvent e) {
                                JFrame addFriendsWindow = new JFrame();
                                Panel infoBox = new Panel();
                                infoBox.setBackground(Color.RED);
                                Label title = new Label("Add a friend");
                                title.setSize(100, 200);
                                // Create Add Profile Window
                                addFriendsWindow.add(title, BorderLayout.NORTH);
                                addFriendsWindow.add(infoBox, BorderLayout.CENTER);
                                infoBox.add(new Label("Name: "), BorderLayout.CENTER);
                                JTextField nameTextField = new JTextField("", 15);

                                // Submit Button
                                JButton submitFormBtn = new JButton("Submit");

                                submitFormBtn.addMouseListener(new MouseListener() {

                                    @Override
                                    public void mouseClicked(MouseEvent e) {
                                        // TODO Auto-generated method stub

                                    }

                                    @Override
                                    public void mousePressed(MouseEvent e) {
                                        String thisName = currentProfile.getName();
                                        String friendsName = nameTextField.getText();
                                        //add friendship between 2 profiles
                                        msns.addConnection(msns.getProfile(thisName), msns.getProfile(friendsName));
                                        addFriendsWindow.dispatchEvent(new WindowEvent(addFriendsWindow, WindowEvent.WINDOW_CLOSING));
                                    }

                                    @Override
                                    public void mouseReleased(MouseEvent e) {
                                        // TODO Auto-generated method stub

                                    }

                                    @Override
                                    public void mouseEntered(MouseEvent e) {
                                        // TODO Auto-generated method stub

                                    }

                                    @Override
                                    public void mouseExited(MouseEvent e) {
                                        // TODO Auto-generated method stub

                                    }});

                                infoBox.add(nameTextField);
                                infoBox.add(submitFormBtn, BorderLayout.SOUTH);
                                addFriendsWindow.setSize(500, 500);
                                addFriendsWindow.setBackground(Color.GREEN);
                                addFriendsWindow.setVisible(true);
                            }

                            @Override
                            public void mouseReleased(MouseEvent e) {
                                // TODO Auto-generated method stub

                            }

                            @Override
                            public void mouseEntered(MouseEvent e) {
                                // TODO Auto-generated method stub

                            }

                            @Override
                            public void mouseExited(MouseEvent e) {
                                // TODO Auto-generated method stub

                            }});
                        // displays friends in a new window
                        showFriendsBtn.addMouseListener(new MouseListener() {

                            @Override
                            public void mouseClicked(MouseEvent e) {
                                // TODO Auto-generated method stub

                            }

                            @Override
                            public void mousePressed(MouseEvent e) {
                                JFrame showFriendsWindow = new JFrame();
                                Panel infoBox = new Panel();
                                infoBox.setBackground(Color.RED);
                                Label title = new Label("See Friends List");
                                title.setSize(100, 200);

                                // Create New Profile Window
                                showFriendsWindow.add(title, BorderLayout.NORTH);
                                showFriendsWindow.add(infoBox, BorderLayout.CENTER);
                                infoBox.add(new Label("List of Friends: "), BorderLayout.CENTER);

                                for(Edge edge : currentProfile.getFriends()) {
                                    Profile friend = edge.getv();
                                    String friendsName = friend.getName();
                                    infoBox.add(new Label(friendsName), BorderLayout.CENTER);
                                }

                                // Make a close button here
                                JButton closeBtn = new JButton("Close");
                                closeBtn.addMouseListener(new MouseListener() {

                                    @Override
                                    public void mouseClicked(MouseEvent e) {
                                        // TODO Auto-generated method stub

                                    }

                                    @Override
                                    public void mousePressed(MouseEvent e) {
                                        showFriendsWindow.dispatchEvent(new WindowEvent(showFriendsWindow, WindowEvent.WINDOW_CLOSING));
                                    }

                                    @Override
                                    public void mouseReleased(MouseEvent e) {
                                        // TODO Auto-generated method stub

                                    }

                                    @Override
                                    public void mouseEntered(MouseEvent e) {
                                        // TODO Auto-generated method stub

                                    }

                                    @Override
                                    public void mouseExited(MouseEvent e) {
                                        // TODO Auto-generated method stub

                                    }});
                                infoBox.add(closeBtn);

                                showFriendsWindow.setSize(500, 500);
                                showFriendsWindow.setBackground(Color.GREEN);
                                showFriendsWindow.setVisible(true);
                            }

                            @Override
                            public void mouseReleased(MouseEvent e) {
                                // TODO Auto-generated method stub

                            }

                            @Override
                            public void mouseEntered(MouseEvent e) {
                                // TODO Auto-generated method stub

                            }

                            @Override
                            public void mouseExited(MouseEvent e) {
                                // TODO Auto-generated method stub

                            }});
                        //Find friends friend but its incomplete.
                        findFriendsFriendBtn.addMouseListener(new MouseListener() {

                            @Override
                            public void mouseClicked(MouseEvent e) {
                                // TODO Auto-generated method stub

                            }

                            @Override
                            public void mousePressed(MouseEvent e) {
                                // Incomplete
                            }

                            @Override
                            public void mouseReleased(MouseEvent e) {
                                // TODO Auto-generated method stub

                            }

                            @Override
                            public void mouseEntered(MouseEvent e) {
                                // TODO Auto-generated method stub

                            }

                            @Override
                            public void mouseExited(MouseEvent e) {
                                // TODO Auto-generated method stub

                            }});

                        resultPanel.add(resultListPanel, BorderLayout.NORTH);

                        resultPanel.add(modifyProfileBtn);
                        resultPanel.add(addFriendsBtn);
                        resultPanel.add(showFriendsBtn);
                        resultPanel.add(findFriendsFriendBtn);

                        resultWindow.add(resultPanel);
                        resultWindow.setSize(500, 500);
                        resultWindow.setVisible(true);
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        // TODO Auto-generated method stub

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {
                        // TODO Auto-generated method stub

                    }});
                infoBox.add(enterBtn);
                profileSearchWindow.setSize(500, 500);
                profileSearchWindow.add(infoBox);
                profileSearchWindow.setVisible(true);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub

            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub

            }});



        eastPanel.add(newProfileBtn);
        eastPanel.add(displayProfilesBtn);
        eastPanel.add(searchBtn);
        Panel bottomPanel = new Panel();


        mainFrame.add(westPanel, BorderLayout.WEST);
        mainFrame.add(centerPanel, BorderLayout.CENTER);
        mainFrame.add(eastPanel, BorderLayout.EAST);
        mainFrame.add(bottomPanel, BorderLayout.SOUTH);
        // mainFrame.add(clickMe, BorderLayout.SOUTH);

        mainFrame.setVisible(true);

    }
}
