package Graphical_User_Interface;

import javax.swing.*;

public class JTextArea_ {

    //`JTextArea` is a multi-line area that displays plain text. It is part of the Java Swing library and is commonly used for displaying or editing large amounts of text. Unlike `JTextField`, which is single-line, `JTextArea` allows for multiple lines of text, making it useful for text input forms, comments sections, or anywhere a larger text input is required.

    //#### **Features**
    //- **Multi-line Text**: `JTextArea` can handle multiple lines of text, making it ideal for input fields where more than one line is needed.
    //- **Line Wrapping**: You can set line wrapping to automatically wrap text to the next line when it exceeds the width of the text area.
    //- **Scrollable**: Often used within a `JScrollPane` to provide scrollable text areas, making it easier to handle large amounts of text.
    //- **Editable or Read-Only**: Can be set to editable mode or read-only mode depending on the application needs.
    //- **Customizable**: Font, color, and alignment of the text can be customized.

    //#### **Common Methods**
    //Here are some of the key methods provided by the `JTextArea` class:

    //1. **Constructor Methods:**
    //   - **`JTextArea()`**: Creates a `JTextArea` with no text and the default number of rows and columns.
    //   - **`JTextArea(String text)`**: Creates a `JTextArea` with the specified text.
    //   - **`JTextArea(int rows, int columns)`**: Creates a `JTextArea` with the specified number of rows and columns.
    //   - **`JTextArea(String text, int rows, int columns)`**: Creates a `JTextArea` with the specified text, rows, and columns.

    //2. **Text Manipulation Methods:**
    //   - **`void append(String str)`**: Appends the specified string to the end of the text area.
    //   - **`void setText(String t)`**: Sets the text of the `JTextArea`.
    //   - **`String getText()`**: Returns the text contained in the `JTextArea`.
    //   - **`void insert(String str, int pos)`**: Inserts the specified text at the specified position.
    //   - **`void replaceRange(String str, int start, int end)`**: Replaces text between the specified start and end positions with the specified string.

    //3. **Caret and Selection Methods:**
    //   - **`void setCaretPosition(int position)`**: Sets the position of the caret (cursor) in the text area.
    //   - **`int getCaretPosition()`**: Returns the position of the caret.
    //   - **`void select(int start, int end)`**: Selects text between the specified start and end positions.
    //   - **`String getSelectedText()`**: Returns the currently selected text.

    //4. **Line and Wrapping Methods:**
    //   - **`void setLineWrap(boolean wrap)`**: Sets whether lines should wrap if they are too long to fit within the text area.
    //   - **`boolean getLineWrap()`**: Returns whether line wrapping is enabled.
    //   - **`void setWrapStyleWord(boolean word)`**: Sets whether to wrap lines at word boundaries (true) or character boundaries (false).
    //   - **`boolean getWrapStyleWord()`**: Returns whether word-wrapping is enabled.

    //5. **Editable and Visibility Methods:**
    //   - **`void setEditable(boolean editable)`**: Sets whether the text area is editable.
    //   - **`boolean isEditable()`**: Returns whether the text area is editable.
    //   - **`void setVisible(boolean visible)`**: Sets the visibility of the text area.
    //   - **`boolean isVisible()`**: Returns whether the text area is visible.

    //#### **Example Code**

        public static void main(String[] args) {
            JFrame frame = new JFrame("JTextArea Example");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            JTextArea textArea = new JTextArea("Enter your text here...");
            textArea.setBounds(50, 50, 300, 150);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);

            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setBounds(50, 50, 300, 150);

            JButton button = new JButton("Show Text");
            button.setBounds(150, 210, 100, 30);
            button.addActionListener(e -> {
                String text = textArea.getText();
                JOptionPane.showMessageDialog(frame, text);
            });

            frame.add(scrollPane);
            frame.add(button);
            frame.setVisible(true);
        }

    //#### **Why Use JTextArea?**
    //- **Multi-line Input**: Essential for situations where you need users to enter or display more than a single line of text.
    //- **Flexibility**: Offers a variety of methods to manipulate and interact with the text, including options for wrapping, inserting, and replacing text.
    //- **Scrollability**: When combined with `JScrollPane`, it provides an effective way to handle long text input, ensuring that users can scroll through the text.
    //- **Customizability**: Allows you to customize the appearance and behavior of the text area to suit different application requirements.
}
