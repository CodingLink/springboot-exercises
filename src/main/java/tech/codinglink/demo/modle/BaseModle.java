package tech.codinglink.demo.modle;

/**
 * json封装的基类
 */
public class BaseModle {
    public int code;
    public String msg;
    public int count;


    public BaseModle(){
    }
    public BaseModle(int code,String msg){
        this.code=code;
        this.msg=msg;
    }
    public BaseModle(int code,String msg,int count){
        this.code=code;
        this.msg=msg;
        this.count=count;
    }
}
