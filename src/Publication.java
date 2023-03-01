public interface Publication {
    public abstract boolean openBook();

    public abstract void closeBook();

    public abstract void turnPage(int page);

    public abstract void nextPage();

    public abstract void returnPage();

}
