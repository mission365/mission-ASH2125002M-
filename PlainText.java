class PlainText extends Text {
    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public String getDescription() {
        return text + ">";
    }
}
