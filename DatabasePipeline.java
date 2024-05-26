class DatabasePipeline extends DataPipeline {
    @Override
    protected boolean connect(String URL) {
        boolean connected = false;
        System.out.println("Connecting to database...");
        // Simulate connection logic
        connected = true;
        return connected;
    }

    @Override
    protected boolean transformData() {
        boolean transformed = false;
        System.out.println("Transforming data in database...");
        // Simulate transformation logic
        transformed = true;
        return transformed;
    }

    @Override
    protected boolean storeData() {
        boolean stored = false;
        System.out.println("Storing data in database...");
        // Simulate storage logic
        stored = true;
        return stored;
    }
}
