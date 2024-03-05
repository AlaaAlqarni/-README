/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_3;

// Prototype interface representing document templates
interface DocumentTemplate extends Cloneable {

    DocumentTemplate clone();

    void custom(String cont, String lay, String styl);
}

// Concrete implementation of the Prototype pattern for a Document
class Document implements DocumentTemplate {

    private String content;
    private String layout;
    private String styles;

    public Document(String cont, String lay, String styl) {
        content = cont;
        layout = lay;
        styles = styl;
    }

    @Override
    public DocumentTemplate clone() {
        try {
            return (DocumentTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void custom(String cont, String lay, String styl) {
        content = cont;
        layout = lay;
        styles = styl;
        System.out.println("the content " + content + ",the " + layout + ",the " + styles);
    }

    // Getters for content, layout, and styles
    // ...
}

// Client class for document generation system
public class DocumentSystem {

    public static void main(String[] args) {
        // Create a prototype document template
        DocumentTemplate Template = new Document("Default content", "Default layout", "Default styles");

        // Clone the prototype for customization
        DocumentTemplate Document1 = Template.clone();
        Document1.custom(" are Animals", "the layout is 1", "and the styles is 1");

        // Clone the prototype for another customization
        DocumentTemplate Document2 = Template.clone();
        Document2.custom("is Ocean", "the layout is 2", "and the styles is 2");

        // Repeat the process for other documents
    }
}
