class BoldItalicText extends TextDecorator {
    public BoldItalicText(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getDescription() {
        return decoratedText.getDescription() + ", bold and italic";
    }
}