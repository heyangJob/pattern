package demo.dhcc.com.visitor.simple1;

/**
 * @author 512573717@qq.com
 * @created 2018/8/20  上午10:37.
 */
public interface Element {
    void accept(Visitor visitor);
}
