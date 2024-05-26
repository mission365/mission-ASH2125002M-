abstract class TextDecorator extends Text {
    protected Text decoratedText;

    public TextDecorator(Text decoratedText) {
        this.decoratedText = decoratedText;
    }

    @Override
    public String getText() {
        return decoratedText.getText();
    }
}