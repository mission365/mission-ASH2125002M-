class ItalicText extends TextDecorator {
    public ItalicText(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getDescription() {
        return decoratedText.getDescription() + ", italic";
    }
}
