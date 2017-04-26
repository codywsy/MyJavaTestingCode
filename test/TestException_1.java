class DefaultException extends Exception{
    public DefaultException(String msg){
        super(msg);
    }
}

public class TestException_1{
    public static void main(String[] args){
        try{
            throw new DefaultException("自定义异常！");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}