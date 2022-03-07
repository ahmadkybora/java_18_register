import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterForm extends JFrame implements ActionListener {
    JPanel registerForm;
    JLabel unLabel, fnLabel, lnLabel, passLabel, cpLabel;
    JButton registerBtn;
    JTextField first_name, last_name, username, password, confirmation_password;

    RegisterForm() {
        unLabel = new JLabel();
        unLabel.setText("UserName");
        fnLabel = new JLabel();
        fnLabel.setText("First Name");
        lnLabel = new JLabel();
        lnLabel.setText("Last Name");
        passLabel = new JLabel();
        passLabel.setText("Password");
        cpLabel = new JLabel();
        cpLabel.setText("Confirm Password");

        username = new JTextField(15);
        first_name = new JTextField(15);
        last_name = new JTextField(15);
        password = new JPasswordField(8);
        confirmation_password = new JPasswordField(8);

        registerBtn = new JButton("Register");

        registerForm = new JPanel(new GridLayout(20, 30));
        registerForm.add(unLabel);
        registerForm.add(username);
        registerForm.add(fnLabel);
        registerForm.add(first_name);
        registerForm.add(lnLabel);
        registerForm.add(last_name);
        registerForm.add(passLabel);
        registerForm.add(password);
        registerForm.add(cpLabel);
        registerForm.add(confirmation_password);
        registerForm.add(registerBtn);

        add(registerForm, BorderLayout.CENTER);

        registerBtn.addActionListener(this);
        setTitle("Register From");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 400);
        this.setLayout(new FlowLayout());
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String unVal = username.getText();
        String fnVal = first_name.getText();
        String lnVal = last_name.getText();
        String passVal = password.getText();
        String cpVal = confirmation_password.getText();
        if(passVal.equals(cpVal)) {
            this.dispose();
            WelcomePage welcomePage = new WelcomePage(unVal);
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }
}
