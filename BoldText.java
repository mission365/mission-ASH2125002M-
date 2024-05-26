class BoldText extends Text {
    private Text decoratedText;

    public BoldText(Text text) {
        super(text.getText());
        this.decoratedText = text;
    }

    @Override
    public String getDescription() {
        return decoratedText.getDescription() + ", bold";
    }
}