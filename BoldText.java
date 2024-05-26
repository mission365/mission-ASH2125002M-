class BoldText extends TextDecorator {
    public BoldText(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getDescription() {
        return decoratedText.getDescription() + ", bold";
    }
}