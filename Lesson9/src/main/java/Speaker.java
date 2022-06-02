public interface Speaker {
    public final static int TEMP = 0; // если  public final static это константа и большими буквами
                                        // все переменные в интерфейсе константы
                                         // все методы public в интерфейсе
    void speak();

    default void info(){

    }
    private String method(){
        return "";
    }
    static void print2(){

    }
}
