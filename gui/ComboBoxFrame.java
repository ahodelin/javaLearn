import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ComboBoxFrame extends JFrame{
  private final JComboBox<String> imagesJComboBox;
  private final JLabel label;

  private static final String[] names = {
    "m.png", "y.png", "n.png", "m.png", "y.png"
  };

  private final Icon[] icons = {
    new ImageIcon(getClass().getResource(names[0])),
    new ImageIcon(getClass().getResource(names[1])),
    new ImageIcon(getClass().getResource(names[2])),
    new ImageIcon(getClass().getResource(names[3]))
  };
 
  public ComboBoxFrame(){
    super("Testing JComboBox");
    setLayout(new FlowLayout());

    imagesJComboBox = new JComboBox<String>(names);
    imagesJComboBox.setMaximumRowCount(3);

    imagesJComboBox.addItemListener(new ItemListener(){
      @Override
      public void itemStateChanged(ItemEvent event){
        if(event.getStateChange() == ItemEvent.SELECTED)
          label.setIcon(icons[imagesJComboBox.getSelectedIndex()]); 
      } 
    });

    add(imagesJComboBox);
    label = new JLabel(icons[0]);
    add(label);
  }
}
