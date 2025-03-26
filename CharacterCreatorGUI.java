import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class CharacterCreatorGUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CharacterCreatorGUI::createAndShowGUI);
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Création de Personnage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 700);
        frame.setLayout(new BorderLayout(10, 10));

        // ====== Panel central pour les champs ======
        JPanel centerPanel = new JPanel(new GridLayout(0, 2, 10, 10));

        JTextField nameField = new JTextField();
        JComboBox<String> profileBox = new JComboBox<>(new String[]{"MAGE", "GUERRIER", "RODEUR"});
        JComboBox<String> weaponBox = new JComboBox<>(new String[]{"EPEE", "ARC", "BATON"});

        JTextField agiField = new JTextField();
        JTextField conField = new JTextField();
        JTextField forceField = new JTextField();
        JTextField perField = new JTextField();
        JTextField chaField = new JTextField();
        JTextField intelField = new JTextField();
        JTextField volField = new JTextField();

        centerPanel.add(new JLabel("Nom du joueur:"));
        centerPanel.add(nameField);
        centerPanel.add(new JLabel("Profil:"));
        centerPanel.add(profileBox);
        centerPanel.add(new JLabel("Agilité:"));
        centerPanel.add(agiField);
        centerPanel.add(new JLabel("Constitution:"));
        centerPanel.add(conField);
        centerPanel.add(new JLabel("Force:"));
        centerPanel.add(forceField);
        centerPanel.add(new JLabel("Perception:"));
        centerPanel.add(perField);
        centerPanel.add(new JLabel("Charisme:"));
        centerPanel.add(chaField);
        centerPanel.add(new JLabel("Intelligence:"));
        centerPanel.add(intelField);
        centerPanel.add(new JLabel("Volonté:"));
        centerPanel.add(volField);
        centerPanel.add(new JLabel("Arme:"));
        centerPanel.add(weaponBox);

        frame.add(centerPanel, BorderLayout.CENTER);

        // ====== Panel bas pour bouton + résultat ======
        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout(10, 10));

        JButton createButton = new JButton("Créer Personnage");
        southPanel.add(createButton, BorderLayout.NORTH);

        JTextArea resultArea = new JTextArea(12, 50); // Agrandi ici
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        scrollPane.setPreferredSize(new Dimension(580, 250));
        southPanel.add(scrollPane, BorderLayout.CENTER);

        frame.add(southPanel, BorderLayout.SOUTH);

        // ====== Action bouton ======
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = nameField.getText();
                    String profile = (String) profileBox.getSelectedItem();
                    String weapon = (String) weaponBox.getSelectedItem();

                    int agi = Integer.parseInt(agiField.getText());
                    int con = Integer.parseInt(conField.getText());
                    int force = Integer.parseInt(forceField.getText());
                    int per = Integer.parseInt(perField.getText());
                    int cha = Integer.parseInt(chaField.getText());
                    int intel = Integer.parseInt(intelField.getText());
                    int vol = Integer.parseInt(volField.getText());

                    int[] stats = {agi, con, force, per, cha, intel, vol};
                    Arrays.sort(stats);
                    int[] validStats = {-1, 0, 0, 1, 1, 2, 3};

                    if (!Arrays.equals(stats, validStats)) {
                        JOptionPane.showMessageDialog(frame, "Erreur : Les valeurs doivent être +3, +2, +1, +1, +0, +0, -1", "Erreur", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    int ini = 10 + per;
                    int def = 10 + agi;
                    int health;
                    switch (profile) {
                        case "MAGE":
                            health = 6 + con;
                            break;
                        case "GUERRIER":
                            health = 10 + con;
                            break;
                        case "RODEUR":
                            health = 8 + con;
                            break;
                        default:
                            health = 0;
                    }

                    String result = String.format(
                            "Nom: %s\nProfil: %s\nSanté: %d\nDéfense: %d\nInitiative: %d\nArme: %s\nStats:\n  Agilité=%d\n  Constitution=%d\n  Force=%d\n  Perception=%d\n  Charisme=%d\n  Intelligence=%d\n  Volonté=%d",
                            name, profile, health, def, ini, weapon, agi, con, force, per, cha, intel, vol);
                    resultArea.setText(result);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Erreur : Veuillez entrer des nombres valides pour les caractéristiques.", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.setVisible(true);
    }
}
