class ItalicText extends Text {
    private Text decoratedText;

    public ItalicText(Text text) {
        super(text.getText());
        this.decoratedText = text;
    }

    @Override
    public String getDescription() {
        return decoratedText.getDescription() + ", italic";
    }
}
