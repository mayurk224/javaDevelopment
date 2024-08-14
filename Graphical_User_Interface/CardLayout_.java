package Graphical_User_Interface;

import javax.swing.*;
import java.awt.*;

public class CardLayout_ {

    //`CardLayout` is a layout manager in Java Swing that allows you to stack several components (usually JPanels) on top of each other like a deck of cards, with only one card visible at a time. This layout is especially useful for implementing wizard-style interfaces, tabbed panes, or any situation where you need to switch between multiple views within the same space.
    //
    //#### **Features of CardLayout**
    //
    //- **Stacked Components**: Components are arranged in a stack, with only one component visible at a time.
    //
    //- **Controlled Navigation**: Provides methods to programmatically navigate through the cards (e.g., next, previous, first, last).
    //
    //- **Named Cards**: Components can be assigned a unique name, allowing you to navigate to a specific card directly.
    //
    //- **Dynamic Interface**: Supports dynamic interfaces where the user can switch between different panels based on interactions.
    //
    //#### **Methods in CardLayout**
    //
    //1. **`CardLayout()`**: Constructs a new `CardLayout` with the gaps of size 0 (no horizontal or vertical gaps between the components).
    //
    //2. **`CardLayout(int hgap, int vgap)`**: Constructs a `CardLayout` with the specified horizontal (`hgap`) and vertical (`vgap`) gaps.
    //
    //3. **`void addLayoutComponent(Component comp, Object constraints)`**: Adds the specified component to the layout, associating it with the specified name (constraints).
    //
    //4. **`void first(Container parent)`**: Flips to the first card of the container.
    //
    //5. **`void next(Container parent)`**: Flips to the next card of the container.
    //
    //6. **`void previous(Container parent)`**: Flips to the previous card of the container.
    //
    //7. **`void last(Container parent)`**: Flips to the last card of the container.
    //
    //8. **`void show(Container parent, String name)`**: Flips to the card that was added to this layout with the specified name.
    //
    //#### **Example Code**

        public static void main(String[] args) {
            JFrame frame = new JFrame("CardLayout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Create a panel with CardLayout
            JPanel cardPanel = new JPanel();
            CardLayout cardLayout = new CardLayout();
            cardPanel.setLayout(cardLayout);

            // Create cards
            JPanel card1 = new JPanel();
            card1.add(new JLabel("This is Card 1"));
            card1.setBackground(Color.CYAN);

            JPanel card2 = new JPanel();
            card2.add(new JLabel("This is Card 2"));
            card2.setBackground(Color.ORANGE);

            JPanel card3 = new JPanel();
            card3.add(new JLabel("This is Card 3"));
            card3.setBackground(Color.LIGHT_GRAY);

            // Add cards to cardPanel with unique names
            cardPanel.add(card1, "Card 1");
            cardPanel.add(card2, "Card 2");
            cardPanel.add(card3, "Card 3");

            // Create a button panel to navigate between cards
            JPanel buttonPanel = new JPanel();
            JButton btnNext = new JButton("Next");
            JButton btnPrevious = new JButton("Previous");
            buttonPanel.add(btnPrevious);
            buttonPanel.add(btnNext);

            // Action listeners for buttons
            btnNext.addActionListener(e -> cardLayout.next(cardPanel));
            btnPrevious.addActionListener(e -> cardLayout.previous(cardPanel));

            // Add components to the frame
            frame.add(cardPanel, BorderLayout.CENTER);
            frame.add(buttonPanel, BorderLayout.SOUTH);

            frame.setVisible(true);
        }

    //#### **Explanation**
    //
    //- **CardPanel**: A `JPanel` with `CardLayout` is created, where each card is a different `JPanel`.
    //- **Cards**: Three cards are created, each with a different background color and label.
    //- **Navigation Buttons**: The "Next" and "Previous" buttons allow users to navigate through the cards.
    //- **Card Switching**: The `next()` and `previous()` methods are used to navigate between the cards.
    //
    //#### **Why Use CardLayout?**
    //
    //- **Simple View Switching**: Ideal for scenarios where you need to switch between different views or panels within the same space, like forms with multiple steps.
    //
    //- **Efficient Use of Space**: `CardLayout` allows multiple components to share the same space, making efficient use of the GUI area.
    //
    //- **Dynamic Interfaces**: Supports creating dynamic interfaces where different panels can be shown based on user interaction, without having to resize or rearrange components.
    //
    //- **Ease of Navigation**: Provides easy methods to navigate between different panels, either sequentially or directly by name.
    //
    //In summary, `CardLayout` is a versatile layout manager in Java Swing that allows for efficient and dynamic switching between multiple panels within the same container. It is particularly useful for implementing wizards, multi-step forms, and other user interfaces that require controlled navigation between different views.
}
