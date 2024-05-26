abstract class DataPipeline {
    public final boolean processData(String URL) {
        if (connect(URL)) {
            transformData();
            storeData();
            return true;
        }
        return false;
    }

    protected abstract boolean connect(String URL);
    protected abstract boolean transformData();
    protected abstract boolean storeData();
}
