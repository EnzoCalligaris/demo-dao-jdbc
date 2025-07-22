package db;

public class DbIntegryException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public DbIntegryException(String msg){
        super(msg);
    }
}
