import com.anno.TargetInterface;

/**
 * @author wangguanru
 * @date 2021-12-08
 */
public class Target implements TargetInterface {


    @Override
    public void save() {
        System.out.println("save running...");
        //int i=1/0;
    }

}
