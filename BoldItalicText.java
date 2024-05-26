class BoldItalicText extends Text {
    private Text decoratedText;

    public BoldItalicText(Text text) {
        super(text.getText());
        this.decoratedText = text;
    }

    @Override
    public String getDescription() {
        return decoratedText.getDescription() + ", bold and italic";
    }
}
