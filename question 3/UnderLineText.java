class UnderLineText extends TextDecorator {
    public UnderLineText(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getDescription() {
        return decoratedText.getDescription() + ", underline";
    }
}