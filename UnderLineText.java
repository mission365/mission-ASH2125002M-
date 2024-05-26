class UnderLineText extends Text {
    private Text decoratedText;

    public UnderLineText(Text text) {
        super(text.getText());
        this.decoratedText = text;
    }

    @Override
    public String getDescription() {
        return decoratedText.getDescription() + ", underline";
    }
}
