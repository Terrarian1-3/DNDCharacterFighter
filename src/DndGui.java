import javax.swing.*;
import java.awt.*;

public class DndGui extends JFrame {
    private JTextField nameField;
    private JTextField genderField;
    private JComboBox<String> raceDropdown;
    private JComboBox<String> alignmentDropdown;
    private JComboBox<String> classDropdown;
    private JButton submitButton;

    public DndGui() {
        setTitle("D&D Character Creator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize components
        nameField = new JTextField(20);
        genderField = new JTextField(20);
        String[] raceOptions = {"Human", "Orc", "Dwarf", "Elf", "Halfling", "Tiefling", "Dragonborn", "Goblin"};
        raceDropdown = new JComboBox<>(raceOptions);
        String[] alignmentOptions = {"Lawful Good", "Neutral Good", "Chaotic Good", "Lawful Neutral", "True Neutral", "Chaotic Neutral", "Lawful Evil", "Neutral Evil", "Chaotic Evil"};
        alignmentDropdown = new JComboBox<>(alignmentOptions);
        String[] classOptions = {"Fighter", "Paladin", "Wizard", "Rogue", "Cleric"};
        classDropdown = new JComboBox<>(classOptions);
        submitButton = new JButton("Confirm");

        // Set up layout
        Container container = getContentPane();
        container.setLayout(new GridLayout(4, 4, 5, 5)); // 2 rows, 5 columns

        // Add components to the container
        container.add(new JLabel("Name:"));
        container.add(nameField);
        container.add(new JLabel("Gender:"));
        container.add(genderField);
        container.add(new JLabel("Race:"));
        container.add(raceDropdown);
        container.add(new JLabel("Alignment:"));
        container.add(alignmentDropdown);
        container.add(new JLabel("Class:"));
        container.add(classDropdown);
        container.add(new JLabel("Stats:"));
        container.add(new JLabel()); // Placeholder for stat input field
        container.add(submitButton);

        // Set up action listener for submit button
        submitButton.addActionListener(e -> {
            // Retrieve values from text fields and dropdowns
            String name = nameField.getText();
            String gender = genderField.getText();
            String race = (String) raceDropdown.getSelectedItem();
            String alignment = (String) alignmentDropdown.getSelectedItem();
            String characterClass = (String) classDropdown.getSelectedItem();

            // Create character or process data as needed
            // (You can call your existing methods here or create new ones)
            // For example:
            // Character newCharacter = new Character(name, gender, race, alignment, characterClass);
            // processCharacter(newCharacter);
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DndGui gui = new DndGui();
            gui.setVisible(true);
        });
    }
}
