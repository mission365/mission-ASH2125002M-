public class TextEditor {
    public static void main(String[] args) {
        Text myText = new Text("I am a DP");
        System.out.println(myText.getDescription());
        
        BoldText boldText = new BoldText(myText);
        System.out.println(boldText.getDescription());
        
        BoldItalicText boldItalicText = new BoldItalicText(boldText);
        System.out.println(boldItalicText.getDescription());
        
        UnderLineText underLineText = new UnderLineText(boldItalicText);
        System.out.println(underLineText.getDescription());
    }
}

